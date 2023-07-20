package Tareas;

import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        //Variables
        int existencia, opc, oportunidades = 0, contador = 0;
        String nombre, confirmacion,pass;
        double cambio, precio, total = 0, totalDia = 0;
        producto producto1, producto2, producto3;
        boolean respuesta;
        int cant[] = new int[4];

        //CONSTANTES
        final String PASSWORD = "Sistema";
        Scanner leer = new Scanner(System.in);
        
        while (oportunidades<3){
            System.out.println("Ingrese la contrase�a");
            pass = leer.next();
            if(pass.equals(PASSWORD)){
                
                System.out.println("Ingrese el nombre del primer producto");
                nombre = leer.next();
                System.out.println("Ingrese el precio de " + nombre);
                precio = leer.nextDouble();
                System.out.println("Ingrese la existencia de " + nombre);
                existencia = leer.nextInt();
                producto1 = new producto(nombre, precio, existencia);

                System.out.println("Ingrese el nombre del segundo producto");
                nombre = leer.next();
                System.out.println("Ingrese el precio de " + nombre);
                precio = leer.nextDouble();
                System.out.println("Ingrese la existencia de " + nombre);
                existencia = leer.nextInt();
                producto2 = new producto(nombre, precio, existencia);

                System.out.println("Ingrese el nombre del tercer producto producto");
                nombre = leer.next();
                System.out.println("Ingrese el precio de " + nombre);
                precio = leer.nextDouble();
                System.out.println("Ingrese la existencia de " + nombre);
                existencia = leer.nextInt();
                producto3 = new producto(nombre, precio, existencia);

                do {
                    System.out.println("MENU PRINCIPAL \nSelecciona una opcion");
                    System.out.println("1. " + producto1.getNombre() + "\n2. " + producto2.getNombre() + "\n3. " + producto3.getNombre() + "\n4. Total \n5. Comprar \n6. Cambiar precio \n7. Salir");
                    opc = leer.nextInt();

                    switch (opc) {
                        case 1:
                            do {
                                System.out.println("¿Cuantos " + producto1.getNombre() + " vendera?");
                                cant[0] = leer.nextInt();
                                if (cant[0] <= producto1.getExistencia()) {
                                    producto1.disminuirExistencia(cant[0]);
                                    total += cant[0] * producto1.getPrecio();
                                    opc = 0;
                                } else {
                                    System.out.println("La existencia no cubre la venta, intente otra cantidad");
                                }
                            } while (opc != 0);
                            break;
                        case 2:
                            do {
                                System.out.println("¿Cuantos " + producto2.getNombre() + " vendera?");
                                cant[1] = leer.nextInt();
                                if (cant[1] <= producto2.getExistencia()) {
                                    producto2.disminuirExistencia(cant[1]);
                                    total += cant[1] * producto2.getPrecio();
                                    opc = 0;
                                } else {
                                    System.out.println("La existencia no cubre la venta, intente otra cantidad");
                                }
                            } while (opc != 0);
                            break;
                        case 3:
                            do {
                                System.out.println("¿Cuantos " + producto3.getNombre() + " vendera?");
                                cant[2] = leer.nextInt();
                                if (cant[2] <= producto3.getExistencia()) {
                                    producto3.disminuirExistencia(cant[2]);
                                    total += cant[2] * producto3.getPrecio();
                                    opc = 0;
                                } else {
                                    System.out.println("La existencia no cubre la venta, intente otra cantidad");
                                }
                            } while (opc != 0);
                            break;
                        case 4:
                            System.out.println("El total de la compra es de: $" + total);
                            totalDia += total;
                            cant[0] = 0;
                            cant[1] = 0;
                            cant[2] = 0;
                            total = 0;
                            break;
                        case 5:
                            do {
                                System.out.println("MENU COMPRAS\n1. " + producto1.getNombre() + "\n2. " + producto2.getNombre() + "\n3. " + producto3.getNombre() + "\n4. Regresar");
                                opc = leer.nextInt();
                                switch (opc) {
                                    case 1:
                                        System.out.println("Ingrese la cantidad de " + producto1.getNombre() + " para comprar");
                                        cant[3] = leer.nextInt();
                                        producto1.aumentarExistencia(cant[3]);
                                        cant[3] = 0;
                                        break;
                                    case 2:
                                        System.out.println("Ingrese la cantidad de " + producto2.getNombre() + " para comprar");
                                        cant[3] = leer.nextInt();
                                        producto1.aumentarExistencia(cant[3]);
                                        cant[3] = 0;
                                        break;
                                    case 3:
                                        System.out.println("Ingrese la cantidad de " + producto3.getNombre() + " para comprar");
                                        cant[3] = leer.nextInt();
                                        producto1.aumentarExistencia(cant[3]);
                                        cant[3] = 0;
                                        break;
                                    case 4:
                                        opc = 0;
                                        break;
                                    default:
                                        System.out.println("Opcion no valida, intentelo de nuevo");
                                }
                            } while (opc != 0);
                            break;
                        case 6:
                            do {
                                System.out.println("MENU CAMBIO DE PRECIOS\n1. " + producto1.getNombre() + "\n2. " + producto2.getNombre() + "\n3. " + producto3.getNombre() + "\n4. Regresar");
                                opc = leer.nextInt();
                                switch (opc) {
                                    case 1:
                                        System.out.println("Ingrese el nuevo precio de " + producto1.getNombre());
                                        cambio = leer.nextDouble();
                                        System.out.println("¿Esta seguro/a de cambiar el precio de " + producto1.getNombre() + " de $" + producto1.getPrecio() + " por $" + cambio + "?");
                                        confirmacion = leer.next();
                                        if (confirmacion.equalsIgnoreCase("Si")) {
                                            producto1.setPrecio(precio);
                                            System.out.println("Precio correctamente actualizado");
                                        } else {
                                            System.out.println("Precio no actualizado");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo precio de " + producto2.getNombre());
                                        cambio = leer.nextDouble();
                                        System.out.println("¿Esta seguro/a de cambiar el precio de " + producto2.getNombre() + " de $" + producto2.getPrecio() + " por $" + cambio + "?");
                                        confirmacion = leer.next();
                                        if (confirmacion.equalsIgnoreCase("Si")) {
                                            producto2.setPrecio(precio);
                                            System.out.println("Precio correctamente actualizado");
                                        } else {
                                            System.out.println("Precio no actualizado");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Ingrese el nuevo precio de " + producto3.getNombre());
                                        cambio = leer.nextDouble();
                                        System.out.println("¿Esta seguro/a de cambiar el precio de " + producto3.getNombre() + " de $" + producto3.getPrecio() + " por $" + cambio + "?");
                                        confirmacion = leer.next();
                                        if (confirmacion.equalsIgnoreCase("Si")) {
                                            producto3.setPrecio(precio);
                                            System.out.println("Precio correctamente actualizado");
                                        } else {
                                            System.out.println("Precio no actualizado");
                                        }
                                        break;
                                    case 4:
                                        opc = 0;
                                        break;
                                    default:
                                        System.out.println("Opcion no valida, intentelo de nuevo");
                                }
                            } while (opc != 0);
                            break;
                        case 7:
                            System.out.println("Ventas totales del dia son de: $" + totalDia);
                            opc = 7;
                            break;
                        default:
                            System.out.println("Opcion no valida, intentelo de nuevo");
                    }
                } while (opc != 7);
            }else{
                System.out.println("Contrasena incorrecta");
                oportunidades ++;
                        
            }    
        }    
    }
}
