package org.example.Modulo2;

import java.util.*;

public class ProductoMain {
    public static final double IGV = 0.18;
    static Set<Producto> productos = new HashSet<>();

    public static void main(String[] args) {

        Producto producto1 = new Producto("P001","Laptop", 3450.50, ProductoEstado.ACTIVO);
        Producto producto2 = new Producto("P002","Mouse", 50.50, ProductoEstado.ACTIVO);
        Producto producto3 = new Producto("P001","Laptop Pro", 3450.50, ProductoEstado.ACTIVO);
        Producto producto4 = new Producto("P003","Teclado", 180.40, ProductoEstado.ACTIVO);


        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);

        System.out.println("Productos en Set: " + productos.size());

        Map<Producto, Integer> mapaProductos = new HashMap<>();

        mapaProductos.put(producto1,10);
        mapaProductos.put(producto2,20);
        mapaProductos.put(producto4,5);

        // Nuevo Producto
        Producto otroProducto = new Producto();
        otroProducto.setCodigo("P001");
        System.out.println(mapaProductos.get(otroProducto)* IGV);

        System.out.println("Busqueda de Producto: ");
        System.out.println(buscarProductoPorCodigo(otroProducto.getCodigo()));

    }

    static Optional<ProductoResponse> buscarProductoPorCodigo(String codigo){
        return productos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst()
                .map(producto -> mapper(producto));
    }

    static ProductoResponse mapper (Producto producto){
        if (producto == null) return  null;
        return new ProductoResponse(
                producto.getCodigo(),
                producto.getNombre(),
                producto.getPrecio()
        );
    }




}
