package Modelo;

public class Divisa {
    private String nombre;
    private Double valor;


    public Divisa(String nombre, Double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValor() {
        return valor;
    }

    public Double setValor(Double valor) {
        this.valor = valor;
        return valor;
    }

    @Override
    public String toString() {
        return "Modelo.Divisa{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }
}
