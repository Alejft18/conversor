package Modelo;

public class Peso {
    private String nombre;
    private Double valor;


    public Peso(String nombre, Double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public Peso() {
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

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Peso{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }
}
