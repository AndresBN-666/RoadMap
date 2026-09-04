package org.example.Modulo2;

import java.util.Objects;

public class Producto {

    private String codigo;
    private String nombre;
    private Double precio;
    private ProductoEstado estado;

    public Producto() {
    }

    public Producto(String codigo, String nombre, Double precio, ProductoEstado estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public ProductoEstado getEstado() {
        return estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEstado(ProductoEstado estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(codigo, producto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
