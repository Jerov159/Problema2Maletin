package Domain;

import java.io.Serializable;

public class Maletin implements Serializable {          //Maletin(id, marca, precio, Tipo)
    private int id;
    private String marca;
    private double precio;
    private String Tipo;

    public Maletin(int id, String marca, double precio, String tipo) {
        this.id = id;
        this.marca = marca;
        this.precio = precio;
        this.Tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }
}
