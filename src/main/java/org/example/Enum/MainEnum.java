package org.example.Enum;

public class MainEnum {
    public static void main(String[] args) {
        ProductoEstado estado = ProductoEstado.ACTIVO;
        System.out.println(estado);
        System.out.println(estado.getDescripcion());
        System.out.println(estado.permiteVenta());
    }
}
