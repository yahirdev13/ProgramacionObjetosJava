package Unidad4;

import java.util.Scanner;

public class Nombres {

    public static void main(String[] args) {
        //Variables
        String buscador, clave, nuevoR;
        int aux = -1, menuP, i = 0, opcDato, nuevoDatoI, siguiente=0;
        double nuevoDatoD;
        boolean confirm;
        Scanner leer = new Scanner(System.in);
        Nombres confirmar = new Nombres();
        leer.useDelimiter("\n");
        //int longitud;
        System.out.println("Cuantos nombres vas a ingresar: ");
        ArregloNombres array = new ArregloNombres(leer.nextInt());
        /**
         * ES LO MISMO QUE: longitud=leer.nextInt(); Eje1Metod array []= new
         * Array[longitud];
         */
        do {
            System.out.println("\nMENU");
            System.out.println("1. Alta de una persona\n2. Baja de una persona\n3. Cambio de datos\n4. Consulta de una persona\n5. Consulta de datos\n6. Salir");
            menuP = leer.nextInt();
            switch (menuP) {
                case 1:
                    if (array.getSig() < array.getLongitud()) {
                        do {
                            System.out.println("Ingresa la clave de la persona: ");
                            clave = leer.next();
                            aux = array.buscadorNum(clave);
                            if (aux == -1) {
                                array.setClave(clave, array.getSig());
                                System.out.println("Ingrese el Nombre " + (array.getSig() + 1));
                                array.setNombre(leer.next(), array.getSig());
                                System.out.println("Ingrese la edad " + (array.getSig() + 1));
                                array.setEdad(leer.nextInt(), array.getSig());
                                System.out.println("Ingrese la estatura " + (array.getSig() + 1));
                                array.setEstatura(leer.nextDouble(),array.getSig());
                                i++;
                                array.altaNumero(i);
                            } else {
                                System.out.println("\nLa clave ya está registrada, ingresa otra clave");
                            }
                        } while (aux != -1);
                    }else{
                        System.out.println("Espacio insuficiente para un nuevo registro");
                    }
                    break;
                case 2:
                    System.out.println("\nIngresa la clave de la persona que deseas eliminar");
                    clave = leer.next();
                    aux = array.buscadorNum(clave);
                    if (aux != -1) {
                        System.out.println("Encontramos la clave, estos son sus datos: \n");
                        System.out.println("Clave: " + array.getClave(aux));
                        System.out.println("Nombre: " + array.getNombre(aux));
                        System.out.println("Edad: " + array.getEdad(aux));
                        System.out.println("Estatura: " + array.getEstatura(aux));
                        System.out.println("Estas seguro de eliminar el registro? 1.Si   2.No");
                        confirm = confirmar.confirmacion(leer.nextInt());
                        if (confirm) {
                            array.eliminar(clave);
                            System.out.println("Registro eliminado exitosamente");
                        } else {
                            System.out.println("Eliminacion cancelada");
                        }
                    } else {
                        System.out.println("Clave no encontrada");
                    }
                    break;
                case 3:
                    System.out.println("\nIngresa la clave de la persona: ");
                    clave = leer.next();
                    aux = array.buscadorNum(clave);
                    if (aux == -1) {
                        System.out.println("Clave no encontrada");
                    } else {
                        System.out.println("La clave fue encontrada, estos son sus datos:\n");
                        System.out.println("Clave: " + array.getClave(aux));
                        System.out.println("Nombre: " + array.getNombre(aux));
                        System.out.println("Edad: " + array.getEdad(aux));
                        System.out.println("Estatura: " + array.getEstatura(aux));
                        System.out.println("Que dato deseas cambiar?: ");
                        System.out.println("1.- Cambiar nombre\n"
                                + "2.- Cambiar edad\n"
                                + "3.- Cambiar estatura\n"
                                + "4.- Regresar");
                        opcDato = leer.nextInt();
                        switch (opcDato) {
                            case 1:
                                System.out.println("Ingresa el nuevo nombre");
                                nuevoR = leer.next();
                                System.out.println("Estas seguro de modificar el registro? 1.Si   2.No");
                                confirm = confirmar.confirmacion(leer.nextInt());
                                if (confirm) {
                                    array.setNombre(nuevoR, aux);
                                    System.out.println("Registro modificado exitosamente");
                                } else {
                                    System.out.println("Modificacion cancelada");
                                }
                                break;
                            case 2:
                                System.out.println("Ingresa la nueva edad");
                                nuevoDatoI = leer.nextInt();
                                System.out.println("Estas seguro de modificar el registro? 1.Si   2.No");
                                confirm = confirmar.confirmacion(leer.nextInt());
                                if (confirm) {
                                    array.setEdad(nuevoDatoI, aux);
                                    System.out.println("Registro modificado exitosamente");
                                } else {
                                    System.out.println("Modificacion cancelada");
                                }
                                break;
                            case 3:
                                System.out.println("Ingresa la nueva estatura");
                                nuevoDatoD = leer.nextDouble();
                                System.out.println("Estas seguro de modificar el registro? 1.Si   2.No");
                                confirm = confirmar.confirmacion(leer.nextInt());
                                if (confirm) {
                                    array.setEstatura(nuevoDatoD, aux);
                                    System.out.println("Registro modificado exitosamente");
                                } else {
                                    System.out.println("Modificacion cancelada");
                                }
                                break;
                            case 4:
                                System.out.println("Regresando al menu principal..");
                                break;
                            default:
                                System.out.println("Opcion incorrecta");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nIngrese la clave del registro que busca: ");
                    clave = leer.next();
                    aux = array.buscadorNum(clave);
                    if (aux == -1) {
                        System.out.println("Clave no encontrada");
                    } else {
                        System.out.println("\nLa clave fue encontrada, estos son sus datos:\n");
                        System.out.println("Clave: " + array.getClave(aux));
                        System.out.println("Nombre: " + array.getNombre(aux));
                        System.out.println("Edad: " + array.getEdad(aux));
                        System.out.println("Estatura: " + array.getEstatura(aux));
                    }
                    break;
                case 5:
                    System.out.println("\nMOSTRAR DATOS\n");
                    for (int j = 0; j < array.getLongitud(); j++) {
                        System.out.println("Registro " + (j + 1));
                        System.out.println("Clave: " + array.getClave(j));
                        System.out.println("Nombre: " + array.getNombre(j));
                        System.out.println("Edad: " + array.getEdad(j));
                        System.out.println("Estatura: " + array.getEstatura(j));
                        System.out.println("\n");
                    }
                    break;
            }
        } while (menuP <= 5);
    }

    boolean confirmacion(int respuesta) {
        boolean confirm;
        return confirm = (respuesta == 1) ? true : false;
    }
}
