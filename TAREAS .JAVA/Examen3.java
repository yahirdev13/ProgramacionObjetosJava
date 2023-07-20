package ExamenU3;

import java.util.Scanner;

public class Examen3 {

    public static void main(String[] args) {
        //variables de password
        Password Verificacion = new Password();
        String password;
        boolean respuesta;
        int contadorIntentos = 0;

        //variables de array
        int socioNormal, socioPlus;
        
        //variables del codigo
        String nombre, clave;
        int opc, opc2, socios,socio, validacion,pelicula;

        double totalDia = 0,total = 0, costoTotal = 0,costoPeli;
        //CONSTANTES del codigo
        final double COSTOT1 = 100, COSTOT2 = 200, EFECTIVO = 0.95, DEBITO = 1, CREDITO = 1.03;
        

        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");

        //Pedir password y validarlo
        System.out.println("Ingrese el password del sistema");
        password = leer.next();
        respuesta = Verificacion.Verificacion(password);
        while (respuesta == false && contadorIntentos < 2) {
            contadorIntentos++;
            System.out.println("Password incorrecto, ingrese el password correcto");
            password = leer.next();
            respuesta = Verificacion.Verificacion(password);
        }

        if (respuesta) {
            System.out.println("Ingrese la cantidad de socios normales");
            socioNormal = leer.nextInt();
            System.out.println("Ingrese la cantidad de socios Plus");
            socioPlus = leer.nextInt();
            Array array = new Array(socioNormal + socioPlus, socioNormal, socioPlus);
            do {
                System.out.println("MENU PRINCIPAL"
                        + "\n1. Registar un socio"
                        + "\n2. Renta de una pelicula"
                        + "\n3. Baja de un socio"
                        + "\n4. Imprimir socios"
                        + "\n5. salir");
                opc = leer.nextInt();

                switch (opc) {
                    case 1://Registar un socio
                        do {
                            System.out.println("SUBMENU REGISTRO"
                                    + "\n1. Normal"
                                    + "\n2. Plus"
                                    + "\n3. Regresar");
                            opc2 = leer.nextInt();
                            switch (opc2) {
                                case 1://Registro socio nomal/1
                                    if (array.getSig() < array.longitud()) {
                                        System.out.println("Ingrese la cantidad de personas para registrar");
                                        socios = leer.nextInt();
                                        if (socios <= array.getSociosT1()) {
                                            for (int i = 0; i < socios; i++) {
                                                System.out.println("Ingrese la clave del socio #" + (i + 1));
                                                do {
                                                    clave = leer.next();
                                                    validacion = array.busqueda(clave);
                                                    if (validacion == -1) {

                                                    } else {
                                                        System.out.println("Clave existente");
                                                    }
                                                } while (validacion != -1);
                                                System.out.println("Ingrese el nombre del socio");
                                                nombre = leer.next();
                                                socio = 1;
                                                pelicula = 30;
                                                array.registro(array.getSig(), clave, nombre, socio,pelicula);
                                                array.contador();
                                                total = COSTOT1;
                                                costoTotal = costoTotal + total; 
                                            }
                                            System.out.println("El costo del registro es de: $" + costoTotal);
                                            totalDia = totalDia + costoTotal;
                                            costoTotal = 0;
                                        } else {
                                            System.out.println("No puedes registrar esa cantidad de socios");
                                        }
                                    } else {
                                        System.out.println("Limite de altas alcanzado");
                                    }
                                    break;
                                case 2://Registro socio plus/2
                                    if (array.getSig() < array.longitud()) {
                                        System.out.println("Ingrese la cantidad de personas para registrar");
                                        socios = leer.nextInt();
                                        if (socios <= array.getSociosT2()) {
                                            for (int i = 0; i < socios; i++) {
                                                System.out.println("Ingrese la clave del socio #" + (i + 1));
                                                do {
                                                    clave = leer.next();
                                                    validacion = array.busqueda(clave);
                                                    if (validacion == -1) {

                                                    } else {
                                                        System.out.println("Clave existente");
                                                    }
                                                } while (validacion != -1);
                                                System.out.println("Ingrese el nombre del socio");
                                                nombre = leer.next();
                                                socio = 2;
                                                pelicula = 20;
                                                array.registro(array.getSig(), clave, nombre, socio,pelicula);
                                                array.contador();
                                                total = COSTOT2;
                                                costoTotal = costoTotal + total; 
                                            }
                                            System.out.println("El costo del registro es de: $" + costoTotal);
                                            totalDia = totalDia + costoTotal;
                                            costoTotal = 0;
                                        } else {
                                            System.out.println("No puedes registrar esa cantidad de socios");
                                        }
                                    } else {
                                        System.out.println("Limite de altas alcanzado");
                                    }
                                    break;
                                case 3://Regresar al MENU PRINCIPAL
                                    System.out.println("Volviendo al MENU PRINCIPAL");
                                    break;
                                default:
                                    System.out.println("Opcion no valida, vuelva a intentarlo");
                            }
                        } while (opc2 != 3);
                        break;
                    case 2://Renta de una pelicula
                        System.out.println("Ingrese la clave del socio");
                        clave = leer.next();
                        validacion = array.busqueda(clave);
                        if (validacion != -1){
                            System.out.println("Ingrese lla forma de pago"
                                    + "\n1. Efectivo"
                                    + "\n2. Tarjeta de debito"
                                    + "\n3. tarjeta de credito");
                            opc2 = leer.nextInt();
                            switch(opc2){
                                case 1:
                                    costoPeli = (array.getPersona(validacion).getPelicula())*EFECTIVO;
                                    System.out.println("El costo de la renta es de: $" + costoPeli);
                                    totalDia = totalDia + costoPeli;
                                    break;
                                case 2:
                                    costoPeli = (array.getPersona(validacion).getPelicula())*DEBITO;
                                    System.out.println("El costo de la renta es de: $" + costoPeli);
                                    totalDia = totalDia + costoPeli;
                                    break;
                                case 3:
                                    costoPeli = (array.getPersona(validacion).getPelicula())*CREDITO;
                                    System.out.println("El costo de la renta es de: $" + costoPeli);
                                    totalDia = totalDia + costoPeli;
                                    break;
                                default:
                                    System.out.println("Opcion no valida, vuelva a intentarlo");
                            }
                        }else{
                            System.out.println("No se encontro ninguna persona con la clave " + clave);
                        }
                        break;
                    case 3://Baja de un socio
                        System.out.println("Ingrse la clave del socio del cual se dara de baja");
                        clave = leer.next();
                        validacion = array.busqueda(clave);
                        if (validacion != -1) {
                            System.out.println("persona encontrada:"
                                    + "\n Clave: " + array.getPersona(validacion).getClave()
                                    + "\n Nombre: " + array.getPersona(validacion).getNombre()
                                    + "\n Tipo de entrada: " + array.getPersona(validacion).getSocio());
                            do {
                                System.out.println("Esta seguro de dar de baja al socio?"
                                        + "\n1. Si"
                                        + "\n2. No");
                                opc2 = leer.nextInt();
                                switch (opc2) {
                                    case 1:
                                        array.eliminacion(validacion);
                                        System.out.println("Eliminacion exitosa");
                                        array.menoscontador();
                                        if(array.getPersona(validacion).getSocio() == 1){
                                            array.masSociosT1();
                                        }else{
                                            array.MasSociosT2();
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Eliminacion cancelada");
                                        break;
                                    default:
                                        System.out.println("opcion no valida");
                                }
                            } while (opc2 != 1 && opc2 != 2);
                        }else{
                            System.out.println("No se encontro ninguna persona con la clave " + clave);
                        }
                        break;
                    case 4://Imprimir socios
                        do {
                            System.out.println("SUBMENU IMPRESION"
                                    + "\n1. Imprimir socios normales"
                                    + "\n2. Imprimir socios plus"
                                    + "\n3. Imprimir todos los socios"
                                    + "\n4. Regresar al MENU PRINCIPAL");
                            opc2 = leer.nextInt();
                            switch (opc2) {
                                case 1://Imprimir socios normales
                                    for (int i = 0; i < array.getSig(); i++) {
                                        if (array.getPersona(i).getSocio() == 1) {
                                            System.out.println("Clave: " + array.getPersona(i).getClave()
                                                    + "\nNombre: " + array.getPersona(i).getNombre()
                                                    + "\n--------------------------------------");
                                        }
                                    }
                                    break;
                                case 2://Imprimir socios plus
                                    for (int i = 0; i < array.getSig(); i++) {
                                        if (array.getPersona(i).getSocio() == 2) {
                                            System.out.println("Clave: " + array.getPersona(i).getClave()
                                                    + "\nNombre: " + array.getPersona(i).getNombre()
                                                    + "\n--------------------------------------");
                                        }
                                    }
                                    break;
                                case 3://Imprimir todos los socios
                                    for (int i = 0; i < array.getSig(); i++) {
                                        if (array.getPersona(i).getSocio() == 1) {
                                            System.out.println("Clave: " + array.getPersona(i).getClave()
                                                    + "\nNombre: " + array.getPersona(i).getNombre()
                                                    + "\n--------------------------------------");
                                        }
                                    }
                                    for (int i = 0; i < array.getSig(); i++) {
                                        if (array.getPersona(i).getSocio() == 2) {
                                            System.out.println("Clave: " + array.getPersona(i).getClave()
                                                    + "\nNombre: " + array.getPersona(i).getNombre()
                                                    + "\n--------------------------------------");
                                        }
                                    }
                                    break;
                                case 4://Regresar al MENU PRINCIPAL
                                    System.out.println("Volviendo al MENU PRINCIPAL");
                                    break;
                                default:
                                    System.out.println("Opcion no valida, vuelva a intentarlo");
                            }
                        } while (opc2 != 3);
                        break;
                    case 5://Salir
                        System.out.println("---------------------------------------------------");
                        System.out.println("Las ventas totales del dia fueron de: $" + totalDia);
                        System.out.println("Saliendo del sistema");
                        System.out.println("---------------------------------------------------");
                        break;
                    default:
                        System.out.println("Opcion no valida, vuelva a intentarlo");
                }
            } while (opc != 5);
        } else {
            System.out.println("Llegaste al limite de intentos");
        }
    }
}
