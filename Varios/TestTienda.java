package clases;

import java.util.Scanner;

public class TestTienda {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        Producto producto1, producto2, producto3;
        String nombre, confirmacion;
        double precio, total = 0;
        int existencia, totalVentas = 0, opc, cantidad[] = new int[4];

        System.out.println("Escribe el nombre del primer producto:");
        nombre = leer.next();
        System.out.println("Esribe el precio de " + nombre);
        precio = leer.nextDouble();
        System.out.println("Escribe la existencia de " + nombre);
        existencia = leer.nextInt();
        producto1 = new Producto(nombre, precio, existencia);

        System.out.println("Escribe el nombre del segundo producto:");
        nombre = leer.next();
        System.out.println("Esribe el precio de " + nombre);
        precio = leer.nextDouble();
        System.out.println("Escribe la existencia de " + nombre);
        existencia = leer.nextInt();
        producto2 = new Producto(nombre, precio, existencia);

        System.out.println("Escribe el nombre del tercer producto:");
        nombre = leer.next();
        System.out.println("Esribe el precio de " + nombre);
        precio = leer.nextDouble();
        System.out.println("Escribe la existencia de " + nombre);
        existencia = leer.nextInt();
        producto3 = new Producto(nombre, precio, existencia);

        do {
            System.out.println("---------------MENU---------------\n1. " + producto1.getNombre() + " (" + producto1.getExistencia() + ") ($" + producto1.getPrecio() +")\n2. " + producto2.getNombre() + " (" + producto2.getExistencia() + ")($" + producto2.getPrecio() +")\n3. " + producto3.getNombre() + " (" + producto3.getExistencia() + ") ($" + producto1.getPrecio() +")\n4. Total\n5. Comprar\n6. Cambiar Precio\n7. Salir\n----------------------------------");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    do {
                        System.out.println("¿Que cantidad de " + producto1.getNombre() + " va a llevar");
                        cantidad[0] = leer.nextInt();
                        if (cantidad[0] <= producto1.getExistencia()) {
                            producto1.disminuirExistencia(cantidad[0]);
                            total += cantidad[0] * producto1.getPrecio();
                            opc = 0;
                        } else {
                            System.out.println("***Error, no hay inventario suficiente");
                        }
                    } while (opc != 0);
                    break;
                case 2:
                    do {
                        System.out.println("¿Que cantidad de " + producto2.getNombre() + " va a llevar");
                        cantidad[1] = leer.nextInt();
                        if (cantidad[1] <= producto2.getExistencia()) {
                            producto2.disminuirExistencia(cantidad[1]);
                            total += cantidad[1] * producto2.getPrecio();
                            opc = 0;
                        } else {
                            System.out.println("***Error, no hay inventario suficiente");
                        }
                    } while (opc != 0);
                    break;
                case 3:
                    do {
                        System.out.println("¿Que cantidad de " + producto3.getNombre() + " va a llevar");
                        cantidad[2] = leer.nextInt();
                        if (cantidad[2] <= producto3.getExistencia()) {
                            producto3.disminuirExistencia(cantidad[2]);
                            total += cantidad[2] * producto3.getPrecio();
                            opc = 0;
                        } else {
                            System.out.println("***Error, no hay inventario suficiente");
                        }
                    } while (opc != 0);
                    break;
                case 4:
                    if (total != 0) {
                        System.out.println("Gracias por su compra, total: $" + total);
                        cantidad[0] = 0; //Cantidad del producto 1
                        cantidad[1] = 0; //Cantidad del producto 2
                        cantidad[2] = 0; //Cantidad del producto 3
                        cantidad[3] = 0; //Cantidad de productos a comprar (cualquiera de los 3 productos)
                        total = 0;
                        totalVentas++;
                    } else {
                        System.out.println("***Error, no has comprado nada aun");
                    }
                    break;
                case 5:
                    do {
                        System.out.println("------Menu compras------\n1. " + producto1.getNombre() + " (" + producto1.getExistencia() + ")\n2. " + producto2.getNombre() + " (" + producto2.getExistencia() + ")\n3. " + producto3.getNombre() + " (" + producto3.getExistencia() + ")\n4. Regresar\n------------------------");
                        opc = leer.nextInt();
                        switch (opc) {
                            case 1:
                                System.out.println("Escribe la cantidad de " + producto1.getNombre() + " que deseas comprar");
                                cantidad[3] = leer.nextInt();
                                producto1.aumentarExistencia(cantidad[3]);
                                cantidad[3] = 0;
                                break;
                            case 2:
                                System.out.println("Escribe la cantidad de " + producto2.getNombre() + " que deseas comprar");
                                cantidad[3] = leer.nextInt();
                                producto2.aumentarExistencia(cantidad[3]);
                                cantidad[3] = 0;
                                break;
                            case 3:
                                System.out.println("Escribe la cantidad de " + producto3.getNombre() + " que deseas comprar");
                                cantidad[3] = leer.nextInt();
                                producto3.aumentarExistencia(cantidad[3]);
                                cantidad[3] = 0;
                                break;
                            case 4:
                                opc = 0;
                                break;
                            default:
                                System.out.println("***Error, opcion no valida");
                        }
                    } while (opc != 0);
                    break;
                case 6:
                    do {
                        System.out.println("------Menu cambiar precio------\n1. " + producto1.getNombre() + " ($" + producto1.getPrecio() + ")\n2. " + producto2.getNombre() + " ($" + producto2.getPrecio() + ")\n3. " + producto3.getNombre() + " ($" + producto3.getPrecio() + ")\n4. Regresar\n-------------------------------");
                        opc = leer.nextInt();
                        switch(opc){
                            case 1:
                                System.out.println("Escribe el nuevo precio de " + producto1.getNombre());
                                precio = leer.nextDouble();
                                System.out.println("Estas seguro de realizar el cambio de precio de $" + producto1.getPrecio() + " a $" + precio);
                                confirmacion = leer.next();
                                if(confirmacion.toUpperCase().startsWith("S")){
                                    producto1.setPrecio(precio);
                                    System.out.println("Precio cambiado exitosamente!!!");
                                }
                                break;
                            case 2:
                                System.out.println("Escribe el nuevo precio de " + producto2.getNombre());
                                precio = leer.nextDouble();
                                System.out.println("Estas seguro de realizar el cambio de precio de $" + producto2.getPrecio() + " a $" + precio);
                                confirmacion = leer.next();
                                if(confirmacion.toUpperCase().startsWith("S")){
                                    producto2.setPrecio(precio);
                                    System.out.println("Precio cambiado exitosamente!!!");
                                }
                                break;
                            case 3:
                                System.out.println("Escribe el nuevo precio de " + producto3.getNombre());
                                precio = leer.nextDouble();
                                System.out.println("Estas seguro de realizar el cambio de precio de $" + producto3.getPrecio() + " a $" + precio);
                                confirmacion = leer.next();
                                if(confirmacion.toUpperCase().startsWith("S")){
                                    producto3.setPrecio(precio);
                                    System.out.println("Precio cambiado exitosamente!!!");
                                }
                                break;
                            case 4:
                                opc = 0;
                                break;
                            default:
                                System.out.println("***Error, opcion no valida");
                        }
                    } while (opc != 0);
                    break;
                case 7:
                    System.out.println("Ventas totales del dia: " + totalVentas);
                    opc = 7;
                    break;
                default:
                    System.out.println("***Error, opcion no valida");
            }
        } while (opc != 7);
    }
}
