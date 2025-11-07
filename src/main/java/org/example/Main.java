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
        Integer precioNuevo=5000;

        //Manzana
        String nombre="Manzana";
        Integer precio=5000;
        String descripcion="Deliciosa Manzana importada";
        Integer codigo=4587986;

        //ARREGLO PRIMITIVO //SIEMPRE EL NOMBRE DE LOS ARREGLOS DEBE IR EN PLURAL
        String[] frutas=new String[5];*/

        String colorRojo="\u001B[31m";
        String colorVerde="\u001B[32m";
        String colorAmarillo="\u001B[33m";
        String colorAzul="\u001B[34m";

        //ARREGLOS EVOLUCIONADOS DINAMICOS O (LISTA) ARRAY LIST <> (Operador diamante)
        System.out.println(colorRojo+"\nLISTA DE LAS FRUTAS");
        System.out.println("--------------------------------------------");

        ArrayList<String> frutasDos= new ArrayList<>();
        frutasDos.add("Manzana");
        frutasDos.add("\nPera");
        frutasDos.add("\nSandia");
        System.out.println(frutasDos);

        System.out.println("--------------------------------------------");

        //Tarea:
        //Necesito un arreglo de nombres de clientes (almacenar 5 clientes)-->String
        //arreglo de nombres de proveedores (10)-->String
        //arreglo o lista de valores de servicios publicos de los ultimos (5 meses)-->Double o Integer

        /*ARREGLO DINAMICO (LISTA) - NOMBRES DE CLIENTES*/
        System.out.println(colorVerde+"\nLISTA DE NOMBRES DE LOS CLIENTES");
        System.out.println("--------------------------------------------");
        ArrayList<String> nombresClientes = new ArrayList<>();
        nombresClientes.add("Samuel");
        nombresClientes.add("\nAlexis");
        nombresClientes.add("\nLaura");
        nombresClientes.add("\nCristina");
        nombresClientes.add("\nJuan Pablo");
        System.out.println(nombresClientes);

        System.out.println("--------------------------------------------");

        /*ARREGLO DINAMICO (LISTA) - NOMBRES DE PROVEEDORES*/
        System.out.println(colorAmarillo+"\nLISTA DE NOMBRES DE LOS PROVEEDORES");
        System.out.println("--------------------------------------------");
        ArrayList<String> nombresProveedores = new ArrayList<>();
        nombresProveedores.add("Frutas La Ceja");
        nombresProveedores.add("\nDistribuciones Rionegro");
        nombresProveedores.add("\nFinca El Vergel de Antioquia");
        nombresProveedores.add("\nFrutales San Vicente");
        nombresProveedores.add("\nComercializadora Oriente Fresco");
        nombresProveedores.add("\nCampo Natural de Marinilla");
        nombresProveedores.add("\nDelicias de Sonsón");
        nombresProveedores.add("\nProductos La Unión");
        nombresProveedores.add("\nFrutas del Carmen");
        nombresProveedores.add("\nAgrícola San Antonio de Prado");
        System.out.println(nombresProveedores);

        System.out.println("--------------------------------------------");

        /*ARREGLO DINAMICO (LISTA) - VALORES DE SERVICIOS PUBLICOS DE LOS ULTIMOS 5 MESES (TIPO DOUBLE)*/
        System.out.println(colorAzul+"\n LISTA VALORES DE SERVICIOS PUBLICOS EN LOS ULTIMOS 5 MESES");
        System.out.println("--------------------------------------------");
        ArrayList<Double> valoresServiciosPublicosUlt5Meses = new ArrayList<>();
        valoresServiciosPublicosUlt5Meses.add(763480.65); /*Octubre*/
        valoresServiciosPublicosUlt5Meses.add(782300.13); /*Septiembre*/
        valoresServiciosPublicosUlt5Meses.add(739650.98); /*Agosto*/
        valoresServiciosPublicosUlt5Meses.add(751200.45); /*Julio*/
        valoresServiciosPublicosUlt5Meses.add(722800.75); /*Junio*/
        for (double valor: valoresServiciosPublicosUlt5Meses){
            System.out.println(valor);
        }
        System.out.println("--------------------------------------------");

        /*ARREGLO DINAMICO (LISTA) - VALORES DE SERVICIOS PUBLICOS DE LOS ULTIMOS 5 MESES (TIPO STRING)
        System.out.println(colorAzul+"\n LISTA VALORES DE SERVICIOS PUBLICOS EN LOS ULTIMOS 5 MESES");
        System.out.println("--------------------------------------------");
        ArrayList<String> valoresServiciosPublicosUlt5Meses = new ArrayList<>();
        valoresServiciosPublicosUlt5Meses.add("\n763480.65"); //Octubre//
        valoresServiciosPublicosUlt5Meses.add("\n782300.13"); //Septiembre//
        valoresServiciosPublicosUlt5Meses.add("\n739650.98"); //Agosto//
        valoresServiciosPublicosUlt5Meses.add("\n751200.45"); //Julio//
        valoresServiciosPublicosUlt5Meses.add("\n722800.75"); //Junio//
        System.out.println(valoresServiciosPublicosUlt5Meses);

        System.out.println("--------------------------------------------");*/
    }
}