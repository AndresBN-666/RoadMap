package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringBuilder mensaje = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            mensaje.append("Producto ")
                    .append(i)
                    .append("\n");
        }

        Integer stock = null;

        if (stock !=null && stock == 0) {
            System.out.println("Sin stock");
        }

        String estado1 = "ACTIVO";
        String estado2 = "ACTIVO";

        if (estado1.equals(estado2)) {
            System.out.println("Producto activo");
        }
    }


}