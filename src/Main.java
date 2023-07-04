import Gestion.GestionDivisas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        GestionDivisas gestion = new GestionDivisas();

        int opcion= Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion: \n 1. Conversor de divisas \n 2. "));
        switch (opcion){

            case 1:
                int opcionDivisa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que quiere realizar: \n1. De Dolares a pesos colombianos \n2. De euros a pesos colombianos \n3. De libras esterlinas a pesos colombianos \n4. De yenes japones a pesos colombianos \n5. De wones surcoreanos a pesos colombianos \n\n6. De pesos a dolares \n7. De pesos a euros \n8. De pesos a libras esterlinas \n9. De yenes japoneses a pesos \n10. De wones surcoreanos a pesos"));
                switch (opcionDivisa){
                    case 1:
                        double cantidadDolar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dolares"));
                        JOptionPane.showMessageDialog(null,gestion.dolarAPeso(cantidadDolar));
                        break;

                    case 2:
                        double cantidadEuro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de euros"));
                        JOptionPane.showMessageDialog(null,gestion.euroAPeso(cantidadEuro));
                        break;

                    case 3:
                        double cantidadLibras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de libras esterlinas"));
                        JOptionPane.showMessageDialog(null,gestion.libraEsterlinaAPeso(cantidadLibras));
                        break;

                    case 4:
                        double cantidadYen = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de yenes japoneses"));
                        JOptionPane.showMessageDialog(null,gestion.yenAPeso(cantidadYen));
                        break;

                    case 5:
                        double cantidadWon = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de wones surcoreanos"));
                        JOptionPane.showMessageDialog(null,gestion.wonAPeso(cantidadWon));
                        break;

                    case 6:
                        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad pesos a convertir"));
                        JOptionPane.showMessageDialog(null,gestion.pesoADolar(peso1));
                        break;

                    case 7:
                        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad pesos a convertir"));
                        JOptionPane.showMessageDialog(null,gestion.pesoAEuro(peso2));
                        break;

                    case 8:
                        double peso3 = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad pesos a convertir"));
                        JOptionPane.showMessageDialog(null,gestion.pesoALibraEsterlina(peso3));
                        break;

                    case 9:
                        double peso4 = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad pesos a convertir"));
                        JOptionPane.showMessageDialog(null,gestion.pesoAyenes(peso4));
                        break;

                    case 10:
                        double  peso5 = Double.parseDouble(JOptionPane.showInputDialog("ingrese la cantidad pesos a convertir"));
                        JOptionPane.showMessageDialog(null,gestion.pesoAWon(peso5));
                        break;

                    default:
                        JOptionPane.showMessageDialog(null,"elige una opcion valida");
                        break;
                }
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"opcion invalida");
                break;
        }

    }
}