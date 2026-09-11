package org.example.Enum;

public enum ProductoEstado {
    ACTIVO("Producto disponible"),
    INACTIVO("Producto deshabilitado"),
    AGOTADO("Producto agotado");

    private final String descripcion;

    ProductoEstado(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean permiteVenta(){
        return this == ACTIVO;
    }
}
