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
        int valido = 0;
        int invalido =0;

        for (String c : codigos){
            if (c==null){
                reporte.append("Producto inválido")
                        .append("\n");
                invalido++;
            }else {
                reporte.append("Producto válido: ")
                        .append(c)
                        .append("\n");
                valido++;
            }
        }
        System.out.println(reporte);
        System.out.println("Productos Validos: " + valido);
        System.out.println("Productos Invalidos: " + invalido);
        System.out.println("\n");

        for (String c : codigos){
            if(c!=null && c.contains("MOUSE")){
                System.out.println("Prodcuto " + c + " Pertenece a la categoria MOUSE");
            }
        }
    }


}
