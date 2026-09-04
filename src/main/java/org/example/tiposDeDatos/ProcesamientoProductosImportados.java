package org.example.tiposDeDatos;

import java.util.Arrays;

public class ProcesamientoProductosImportados {

    public static void main(String[] args) {
        String[] codigos = {
                "LAPTOP-001",
                "MOUSE-002",
                "TECLADO-003",
                "MOUSE-002",
                null,
                "MONITOR-004"
        };

        StringBuilder reporte = new StringBuilder();

        int productosValidos = 0;
        int productosInvalidos = 0;

        for (String codigo : codigos) {

            if (codigo!=null){
                productosValidos++;
                String categoria = codigo.split("-")[0];
                if ("MOUSE".equals(categoria)) {
                    reporte.append("Producto válido: ")
                            .append(codigo)
                            .append("-- Categoria: ")
                            .append(categoria)
                            .append("\n");
                } else {
                    reporte.append("Producto válido: ")
                            .append(codigo)
                            .append("\n");
                }
            }else {
                reporte.append("Producto inválido")
                        .append("\n");
                productosInvalidos++;

            }

        }

        System.out.println(reporte);
        System.out.println("Productos Validos: " + productosValidos);
        System.out.println("Productos Invalidos: " + productosInvalidos);
        System.out.println("\n");

    }


}
