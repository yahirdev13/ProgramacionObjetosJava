package Tareas;

import java.util.Scanner;

public class ExamenRopa {

    public static void main(String[] args) {

        //variables
        int oportunidades = 0, opc, opc2, i = 0, y = 0, buscador = -1, aumentarE, cant, existencia;
        double totalDia = 0, cambioP, total = 0;
        String buscadorClave, confirmacion;

        String pass;

        boolean respuesta = false;

        //CONSTANTES
        double TIPO1 = 0, TIPO2 = 0.05, TIPO3 = 0.10, TIPO4 = 0.15;

        Scanner leer = new Scanner(System.in);

        verificar_1 verif = new verificar_1();

        while (oportunidades < 3) {
            System.out.println("Ingrese el password");
            pass = leer.next();
            respuesta = verif.verificarPassword(pass);

            if (respuesta) {

                System.out.println("Ingresa el numero de prendas para vender");
                ExamenArreglos data = new ExamenArreglos(leer.nextInt());
                System.out.println("Se crearan " + data.getLongitud() + " prendas");

                for (i = 0; y < data.getLongitud(); i++) {
                    System.out.println("Ingrese la clave del producto ");
                    data.setClave(leer.next(), i);
                    System.out.println("Ingrese las existencias ");
                    data.setExistencias(leer.nextInt(), i);
                    System.out.println("Ingrese el precio ");
                    data.setPrecio(leer.nextDouble(), i);
                    System.out.println("Ingrese el tipo de descuento de la prenda ");
                    data.setTipo(leer.nextInt(), i);
                    y++;
                }

                do {
                    System.out.println("MENU PRINCIPAL \nSelecciona una opcion");
                    System.out.println("1. Venta \n2. Incremento de existencia \n3. Cambio del precio \n4. Salir");
                    opc = leer.nextInt();

                    switch (opc) {
                        case 1:
                            do {
                                System.out.println("MENU VENTAS \n1. Venta \n2. Total \n3. Regresar al menu principal");
                                opc2 = leer.nextInt();
                                switch (opc2) {
                                    case 1:
                                        System.out.println("Ingrese la clave del producto ha vender");
                                        buscadorClave = leer.next();

                                        for (i = 0; i < y; i++) {
                                            if (data.getClave(y).equals(buscadorClave)) {
                                                buscador = i;
                                                break;
                                            }
                                        }

                                        if (buscador != -1) {
                                            System.out.println("Ingrese la cantidad a vender ");
                                            cant = leer.nextInt();
                                            if (cant <= data.getExistencias(i)) {
                                                existencia = data.getExistencias(i);
                                                existencia -=cant;
                                                data.setExistencias(existencia, i);
                                                total += cant * data.getPrecio(i);
                                                
                                                
                                                
                                                opc2 = 0;
                                            } else {
                                                System.out.println("La existencia no cubre la venta, intente otra cantidad");
                                            }
                                        } else {
                                            System.out.println("clave no encontrada");
                                        }

                                        break;
                                    case 2:
                                        System.out.println("El total de la compra es de: $" + total);
                                        totalDia += total;
                                        total = 0;
                                        break;
                                    case 3:
                                        opc2 = 3;
                                        break;
                                    default:
                                        System.out.println("Opcion no valida, intentelo de nuevo");
                                }
                            } while (opc2 != 3);
                            break;
                        case 2:
                            System.out.println("Ingrese la clave del producto para aumentar la existencia");
                            buscadorClave = leer.next();

                            for (i = 0; i < y; i++) {
                                if (data.getClave(y).equals(buscadorClave)) {
                                    buscador = i;
                                    break;
                                }
                            }

                            if (buscador != -1) {
                                System.out.println("Encontramos la Clave, la existencia es: " + data.getExistencias(i));
                                System.out.println("Ingrese el nuevo precio de la prenda");
                                aumentarE = leer.nextInt();
                                System.out.println("¿Esta seguro/a de cambiar la existencia del producto?");
                                confirmacion = leer.next();
                                if (confirmacion.equalsIgnoreCase("Si")) {
                                    data.setExistencias(aumentarE, i);
                                    System.out.println("Precio correctamente actualizado a " + data.getPrecio(i));
                                } else {
                                    System.out.println("Precio no actualizado");
                                }
                            } else {
                                System.out.println("clave no encontrada");
                            }
                            break;

                        case 3:
                            System.out.println("Ingrese la clave del producto para cambiar el precio");
                            buscadorClave = leer.next();

                            for (i = 0; i < y; i++) {
                                if (data.getClave(y).equals(buscadorClave)) {
                                    buscador = i;
                                    break;
                                }
                            }

                            if (buscador != -1) {
                                System.out.println("Encontramos la Clave, el precio es: " + data.getPrecio(i));
                                System.out.println("Ingrese el nuevo precio de la prenda");
                                cambioP = leer.nextDouble();
                                System.out.println("¿Esta seguro/a de cambiar el precio del producto?");
                                confirmacion = leer.next();
                                if (confirmacion.equalsIgnoreCase("Si")) {
                                    data.setPrecio(cambioP, i);
                                    System.out.println("Precio correctamente actualizado a " + data.getPrecio(i));
                                } else {
                                    System.out.println("Precio no actualizado");
                                }
                            } else {
                                System.out.println("clave no encontrada");
                            }
                            break;
                        case 4:
                            System.out.println("Ventas totales del dia son de: $" + totalDia);
                            break;
                        default:
                            System.out.println("Opcion no valida, intentelo de nuevo");
                    }
                } while (opc != 4);
            } else {
                System.out.println("PASSWORD incorrecto");
                oportunidades++;
            }
        }
    }
}
