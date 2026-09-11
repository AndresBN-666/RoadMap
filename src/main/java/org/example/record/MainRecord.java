package org.example.record;

public class MainRecord {
    public static void main(String[] args) {
        ProductoResponse producto = new ProductoResponse("P001", "Laptop",
                2500.0);

        System.out.println(producto.codigo());
        System.out.println(producto.nombre());
        System.out.println(producto.precio());
    }
}
