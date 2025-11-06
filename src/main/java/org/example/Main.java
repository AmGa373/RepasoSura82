package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*//ESTRUCTURA DE DATOS EN JAVA
        //Lista (arreglo)
        //hasmap (diccionario)

        //PARA GUARDAR DATOS EXISTEN LAS VARIABLES
        //TIPOS
        //1. Variables primitivas
        int precio=5000;
        double peso=2.5;
        boolean estaPodrida=false;
        char letraUno='j';
        char letraDos='u';
        char letraTres='A';
        char letraCuatro='n';

        //2. Variables tipo envoltura
        String nombre="Manzana";
        Double pesoNuevo=2.5;
        Integer precioNuevo=5000;*/

        //Manzana
        String nombre="Manzana";
        Integer precio=5000;
        String descripcion="Deliciosa Manzana importada";
        Integer codigo=4587986;

        //ARREGLO PRIMITIVO //SIEMPRE EL NOMBRE DE LOS ARREGLOS DEBE IR EN PLURAL
        String[] frutas=new String[5];


        //ARREGLOS EVOLUCIONADOS DINAMICOS O (LISTA) ARRAY LIST <> (Operador diamante)
        ArrayList<String> frutasDos= new ArrayList<>();
        frutasDos.add("Manzana");
        frutasDos.add("Pera");
        frutasDos.add("Sandia");
        System.out.println(frutasDos);

        //Tarea: Necesito un arreglo de nombres de clientes (almacenar 5 clientes)-->String
        //arreglo de nombres de proveedores (10)-->String
        //arreglo o lista de valores de servicios publicos de los ultimos (5 meses)-->Double o Integer
        



    }
}