package Gestion;

import Modelo.Divisa;

public class GestionDivisas {

    Divisa peso = new Divisa("pesos colombianos",0.0);
    Divisa dolar = new Divisa("dolar",4100.00);
    Divisa euro = new Divisa("euro",4500.00);
    Divisa libraEsterlina = new Divisa("libra esterlina",5300.00);
    Divisa yen = new Divisa("yen japonés",28.84);
    Divisa won = new Divisa("won surcoreano",3.20);

    public String dolarAPeso(double cantidad){
        double cambio = dolar.getValor()*cantidad;

        return cantidad +" dolares son $"+ cambio + " pesos colombianos";
    }

    public String euroAPeso(double cantidad){
        double cambio = euro.getValor()*cantidad;

        return cantidad +" euros son $"+ cambio + " pesos colombianos";
    }

    public String libraEsterlinaAPeso(double cantidad){
        double cambio = libraEsterlina.getValor() * cantidad;

        return cantidad + " libras esterlinas $"+ cambio + " pesos combianos";
    }

    public String yenAPeso(double cantidad){
        double cambio = yen.getValor() * cantidad;

        return cantidad + " yenes japoneses son $"+ cambio + " pesos combianos";
    }

    public String wonAPeso(double cantidad){
        double cambio = won.getValor() * cantidad;

        return cantidad + " wones surcoreanos son $"+ cambio + " pesos combianos";
    }

    public String pesoADolar(double cantidad){
      double cambio = peso.setValor(cantidad) / dolar.getValor();
        String resultado = String.format("%.2f", cambio);

      return peso.getValor() + " pesos colombianos son $"+ resultado+" dolares";
    }

    public String pesoAEuro(double cantidad){
        double cambio = peso.setValor(cantidad) / euro.getValor();
        String resultado = String.format("%.2f", cambio);

        return peso.getValor() + " pesos colombianos son $"+ resultado+" euros";
    }

    public String pesoALibraEsterlina(double cantidad){
        double cambio = peso.setValor(cantidad) / libraEsterlina.getValor();
        String resultado = String.format("%.2f", cambio);

        return peso.getValor() + " pesos colombianos son $"+ resultado+" libras esterlinas";
    }

    public String pesoAyenes(double cantidad){
        double cambio = peso.setValor(cantidad) / yen.getValor();
        String resultado = String.format("%.2f", cambio);

        return peso.getValor() + " pesos colombianos son $"+ resultado+" yenes japoneses";
    }

    public String pesoAWon(double cantidad){
        double cambio = peso.setValor(cantidad) / won.getValor();
        String resultado = String.format("%.2f", cambio);

        return peso.getValor() + " pesos colombianos son $"+ resultado+" wones surcoreanos";
    }

}
