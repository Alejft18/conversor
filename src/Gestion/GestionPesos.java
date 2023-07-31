package Gestion;

import Modelo.Peso;

public class GestionPesos {

    Peso kilo = new Peso("kilogramos",0.0);
    Peso libra = new Peso("libras",0.0);

    public String libraAKilo(double lib){
        libra.setValor(lib);
        double cambio =  libra.getValor() /  2.205;
        String resultado = String.format("%.2f", cambio);
        kilo.setValor(cambio);

        return lib + " libras son "+ resultado+" kilogramos";
    }

    public String kiloALibra(double kil){
        kilo.setValor(kil);
        double cambio = kilo.getValor() *  2.205;
        String resultado = String.format("%.2f", cambio);
        kilo.setValor(cambio);

        return kil + " kilos son "+ resultado+" libras";
    }
}
