package Modelo;

public class Binario {
    private int decimal;
    private String binario;

    public Binario(int decimal, String binario) {
        this.decimal = decimal;
        this.binario = binario;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }
}
