package Gestion;

import Modelo.Binario;

import javax.swing.*;

public class GestionBinarios {
    Binario binario =new Binario(0,"");

    public String decimalABinario(){
        binario.setDecimal(Integer.parseInt(JOptionPane.showInputDialog("ingrese el decimal para pasarlo a binario")));
        binario.setBinario(Integer.toBinaryString(binario.getDecimal()));

        return "El decimal "+ binario.getDecimal() + " es: "+ binario.getBinario() + " en numero binario";
    }

    public String binarioADecimal(){
        String numBinario =(JOptionPane.showInputDialog("ingrese el numero binario a comvertir a decimal"));
        binario.setBinario(numBinario);
        int decimal = 0;

        for (int i = 0; i < numBinario.length(); i++) {
            decimal = decimal * 2 + Character.getNumericValue(numBinario.charAt(i));
        }
        binario.setDecimal(decimal);

        return "El binario "+ binario.getBinario() + " es: "+ binario.getDecimal() + " en numero decimal";
    }
}
