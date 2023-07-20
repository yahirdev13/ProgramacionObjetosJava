package ArregloDeObjetos;

import java.util.Scanner;

public class ClaseMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n");
        ClaseMain confirmar = new ClaseMain();
        //variables de codigo
        int menuP, opcDato = 0, opc3, aux;
        boolean confirm;
        String clave, nuevoN;
        int nuevaE = 0;
        double nuevaEst;

        System.out.println("Cuantos nombres vas a ingresar: ");
        Array array = new Array(leer.nextInt());

        do {
            System.out.println("\nMENU");
            System.out.println("1. Alta de una persona\n2. Baja de una persona\n3. Cambio de datos\n4. Consulta de una persona\n5. Consulta de datos\n6. Salir");
            menuP = leer.nextInt();

            switch (menuP) {
                case 1:
                    if (array.getSig() < array.longitud()) {
                        System.out.println("Ingrese la clave (NO CLAVES REPETIDAS)");
                        clave = leer.next();
                        aux = array.busqueda(clave);
                        if (aux == -1) {
                            System.out.println("Ingresa tu nombre");
                            nuevoN = leer.next();
                            System.out.println("Ingresa tu edad");
                            nuevaE = leer.nextInt();
                            System.out.println("Ingresa tu estatura");
                            nuevaEst = leer.nextDouble();
                            array.registro(array.getSig(), clave, nuevoN, nuevaE, nuevaEst);
                            System.out.println("Registro exitoso");
                            array.contador();
                        } else {
                            System.out.println("\nLa clave ya está registrada, ingresa una diferente\n");
                        }
                    } else {
                        System.out.println("\nYa no hay espacio disponible para dar de alta mas personas");
                    }
                    break;

                case 2:
                    System.out.println("Ingrese la clave de la persona que va a dar de baja");
                    clave = leer.next();
                    aux = array.busqueda(clave);
                    if (aux != -1) {

                        System.out.println("\nPersona encontrada:\n");
                        System.out.println("Clave: " + array.getPersona(aux).getClave());
                        System.out.println("Nombre: " + array.getPersona(aux).getNombre());
                        System.out.println("Edad: " + array.getPersona(aux).getEdad());
                        System.out.println("Estatura: " + array.getPersona(aux).getEstatura());
                        System.out.println("Estas seguro de eliminar el registro? 1.Si   2.No");
                        confirm = confirmar.confirmacion(leer.nextInt());
                        if (confirm) {
                            array.eliminar(aux);
                            System.out.println("\nRegistro eliminado exitosamente");
                        } else {
                            System.out.println("\nEliminacion cancelada");
                        }

                    } else {
                        System.out.println("Clave no encontrada ");
                    }
                    break;
                //Cambio de Datos
                case 3:
                    System.out.println("Ingrese la clave de la persona");
                    clave = leer.next();
                    aux = array.busqueda(clave);
                    if (aux != -1) {
                        do {
                            System.out.println("\nPersona encontrada, estos son sus datos:\n");;
                            System.out.println("Nombre: " + array.getPersona(aux).getNombre());
                            System.out.println("Edad: " + array.getPersona(aux).getEdad());
                            System.out.println("Estatura: " + array.getPersona(aux).getEstatura());
                            System.out.println("Que dato deseas modificar?");
                            System.out.println("1.- Cambiar nombre\n"
                                    + "2.- Cambiar edad\n"
                                    + "3.- Cambiar estatura\n"
                                    + "4.- Regresar");
                            opcDato = leer.nextInt();
                            switch (opcDato) {
                                case 1:
                                    System.out.println("Ingresa el nuevo nombre");
                                    nuevoN = leer.next();
                                    System.out.println("Estas seguro de modificar el registro? 1.Si   2.No");
                                    confirm = confirmar.confirmacion(leer.nextInt());
                                    if (confirm) {
                                        array.getPersona(aux).setNombre(nuevoN);
                                        System.out.println("Registro modificado exitosamente");
                                    } else {
                                        System.out.println("Modificacion cancelada");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Ingresa la nueva edad");
                                    nuevaE = leer.nextInt();
                                    System.out.println("Estas seguro de modificar el registro? 1.Si   2.No");
                                    confirm = confirmar.confirmacion(leer.nextInt());
                                    if (confirm) {
                                        array.getPersona(aux).setEdad(nuevaE);
                                        System.out.println("Registro modificado exitosamente");
                                    } else {
                                        System.out.println("Modificacion cancelada");
                                    }
                                    break;

                                case 3:

                                    System.out.println("Ingresa la nueva estatura");
                                    nuevaEst = leer.nextDouble();
                                    System.out.println("Estas seguro de modificar el registro? 1.Si   2.No");
                                    confirm = confirmar.confirmacion(leer.nextInt());
                                    if (confirm) {
                                        array.getPersona(aux).setEstatura(nuevaEst);
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
                            }
                        } while (opcDato != 4);
                    } else {
                        System.out.println("Clave no encontrada");
                    }
                    break;
                //Consulta de una persona
                case 4:
                    System.out.println("\nIngrese la clave del registro que busca: ");
                    clave = leer.next();
                    aux = array.busqueda(clave);
                    if (aux != -1) {
                        System.out.println("\nPersona encontrada:\n");
                        System.out.println("Clave: " + array.getPersona(aux).getClave());
                        System.out.println("Nombre: " + array.getPersona(aux).getNombre());
                        System.out.println("Edad: " + array.getPersona(aux).getEdad());
                        System.out.println("Estatura: " + array.getPersona(aux).getEstatura());
                    } else {
                        System.out.println("Clave no encontrada");
                    }
                    break;

                case 5:
                    System.out.println("\nMOSTRAR DATOS\n");
                    for (int i = 0; i < array.getSig(); i++) {                       
                        System.out.println("Registro "+ (i + 1)+": ");
                        System.out.println("Clave: " + array.getPersona(i).getClave());
                        System.out.println("Nombre: " + array.getPersona(i).getNombre());
                        System.out.println("Edad: " + array.getPersona(i).getEdad());
                        System.out.println("Estatura: " + array.getPersona(i).getEstatura());
                    }

                    break;

                case 6:
                    System.out.println("Saliendo... gracias por tu preferencia");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (menuP != 6);

    }

    boolean confirmacion(int respuesta) {
        boolean confirm;
        return confirm = (respuesta == 1) ? true : false;
    }

}
