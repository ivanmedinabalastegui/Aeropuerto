import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Aeropuerto {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String respuesta;
        int opcion = 0;
        Piloto piloto1, piloto2, piloto3;
        Vuelo vuelo1, vuelo2, vuelo3;

        piloto1 = new Piloto("Vicente", "Coronel", "Diaz", "39542154T", 49);
        piloto2 = new Piloto("Fernando", "Medina", "Araujo", "65846378U", 52);
        piloto3 = new Piloto("Gustavo", "Castillo", "Bernabé", "385017486G", 44);
        vuelo1 = new Vuelo("IB2349", "Madrid", 40, 60, 52, "12/2/2022", piloto1);
        vuelo2 = new Vuelo("IB1234", "Lisboa", 60, 60, 42, "2/3/2022", piloto2);
        vuelo3 = new Vuelo("IB4321", "París", 120, 80, 78, "20/10/2022", piloto3);
        System.out.println("\nMenú Aeropuerto de Sevilla");


        do {
            System.out.println("\nIndique la operación que desea realizar:\n" +
                    "1. Consultar código de vuelo\n2. Consultar destino\n3. Consultar y modificar precio " +
                    "de un vuelo\n4. Consultar número de plazas disponibles\n5. Consultar y modificar " +
                    "el número de pasajeros de un vuelo\n6. Consultar fecha de salida\n7. Consultar " +
                    "y modificar el piloto de un vuelo\n8. Salir");

            try {

                System.out.println("Escribe una de las opciones:");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Escriba el destino: ");
                        respuesta = sc.next();

                        if (Objects.equals(respuesta, vuelo1.getDestino())) {
                            System.out.println("El código del vuelo es: " + vuelo1.getCodigo());
                        } else if (Objects.equals(respuesta, vuelo2.getDestino())) {
                            System.out.println("El código del vuelo es: " + vuelo2.getCodigo());
                        } else if (Objects.equals(respuesta, vuelo3.getDestino())) {
                            System.out.println("El código del vuelo es: " + vuelo3.getCodigo());
                        } else {
                            System.out.println("Debe poner un destino válido");
                        }
                        break;
                    case 2:
                        System.out.println("Escriba el código de vuelo: ");
                        respuesta = sc.next();

                        if (Objects.equals(respuesta, vuelo1.getCodigo())) {
                            System.out.println("El destino del vuelo es: " + vuelo1.getDestino());
                        } else if (Objects.equals(respuesta, vuelo2.getCodigo())) {
                            System.out.println("El destino del vuelo es: " + vuelo2.getDestino());
                        } else if (Objects.equals(respuesta, vuelo3.getCodigo())) {
                            System.out.println("El destino del vuelo es: " + vuelo3.getDestino());
                        }else {
                            System.out.println("Debe poner un código válido, recuerde usar mayúsculas");
                        }
                        break;
                    case 3:
                        System.out.println("Escriba el destino: ");
                        int precio = 0;
                        respuesta = sc.next();

                        if (Objects.equals(respuesta, vuelo1.getDestino())) {
                            System.out.println("El precio actual del vuelo es: " + vuelo1.getPrecio() + "€");
                            System.out.println("Introduzca el nuevo precio: ");
                            precio = sc.nextInt();
                            vuelo1.setPrecio(precio);
                        } else if (Objects.equals(respuesta, vuelo2.getDestino())) {
                            System.out.println("El precio actual del vuelo es: " + vuelo2.getPrecio() + "€");
                            System.out.println("Introduzca el nuevo precio: ");
                            precio = sc.nextInt();
                            vuelo2.setPrecio(precio);
                        } else if (Objects.equals(respuesta, vuelo3.getDestino())) {
                            System.out.println("El precio actual del vuelo es: " + vuelo3.getPrecio() + "€");
                            System.out.println("Introduzca el nuevo precio: ");
                            precio = sc.nextInt();
                            vuelo3.setPrecio(precio);
                        } else {
                            System.out.println("Debe poner un destino válido");
                        }
                        break;
                    case 4:
                        System.out.println("Escriba el destino: ");
                        respuesta = sc.next();

                        if (Objects.equals(respuesta, vuelo1.getDestino())) {
                            System.out.println("El número de plazas del vuelo es: " + vuelo1.getNumplazas());
                        } else if (Objects.equals(respuesta, vuelo2.getDestino())) {
                            System.out.println("El número de plazas del vuelo es: " + vuelo2.getNumplazas());
                        } else if (Objects.equals(respuesta, vuelo3.getDestino())) {
                            System.out.println("El número de plazas del vuelo es: " + vuelo3.getNumplazas());
                        } else {
                            System.out.println("Debe poner un destino válido");
                        }
                        break;
                    case 5:
                        System.out.println("Escriba el destino: ");
                        int numpasajeros = 0;
                        respuesta = sc.next();

                        if (Objects.equals(respuesta, vuelo1.getDestino())) {
                            System.out.println("El precio actual del vuelo es: " + vuelo1.getPrecio());
                            System.out.println("Introduzca el nuevo número de pasajeros: ");
                            numpasajeros = sc.nextInt();
                            vuelo1.setPrecio(numpasajeros);
                        } else if (Objects.equals(respuesta, vuelo2.getDestino())) {
                            System.out.println("El precio actual del vuelo es: " + vuelo2.getPrecio());
                            System.out.println("Introduzca el nuevo número de pasajeros: ");
                            numpasajeros = sc.nextInt();
                            vuelo2.setPrecio(numpasajeros);
                        } else if (Objects.equals(respuesta, vuelo3.getDestino())) {
                            System.out.println("El precio actual del vuelo es: " + vuelo3.getPrecio());
                            System.out.println("Introduzca el nuevo número de pasajeros: ");
                            numpasajeros = sc.nextInt();
                            vuelo3.setPrecio(numpasajeros);
                        } else {
                            System.out.println("Debe poner un destino válido");
                        }
                        break;
                    case 6:
                        System.out.println("Escriba el destino: ");
                        respuesta = sc.next();

                        if (Objects.equals(respuesta, vuelo1.getDestino())) {
                            System.out.println("La fecha de salida del vuelo es: " + vuelo1.getFecha());
                        } else if (Objects.equals(respuesta, vuelo2.getDestino())) {
                            System.out.println("La fecha de salida del vuelo es: " + vuelo2.getFecha());
                        } else if (Objects.equals(respuesta, vuelo3.getDestino())) {
                            System.out.println("La fecha de salida del vuelo es: " + vuelo3.getFecha());
                        } else {
                            System.out.println("Debe poner un destino válido");
                        }
                        break;
                    case 7:
                        System.out.println("Escriba un destino: ");
                        respuesta = sc.next();

                        if (Objects.equals(respuesta, vuelo1.getDestino())) {
                            System.out.println("El piloto actual del vuelo es: " + vuelo1.getPiloto() + "\n");
                            System.out.println("Introduzca los datos del nuevo piloto: \nNombre: ");
                            String nombre = sc.next();
                            piloto1.setNombre(nombre);
                            System.out.println("Primer apellido: ");
                            String primerapellido = sc.next();
                            piloto1.setApellido1(primerapellido);
                            System.out.println("Segundo apellido: ");
                            String segundoapellido = sc.next();
                            piloto1.setApellido2(segundoapellido);
                            System.out.println("DNI: ");
                            String dni = sc.next();
                            piloto1.setDni(dni);
                            System.out.println("Edad: ");
                            int edad = sc.nextInt();
                            piloto1.setEdad(edad);
                        } else if (Objects.equals(respuesta, vuelo2.getDestino())) {
                            System.out.println("El piloto actual del vuelo es: " + vuelo2.getPiloto() + "\n");
                            System.out.println("Introduzca los datos del nuevo piloto: \nNombre: ");
                            String nombre = sc.next();
                            piloto2.setNombre(nombre);
                            System.out.println("Primer apellido: ");
                            String primerapellido = sc.next();
                            piloto2.setApellido1(primerapellido);
                            System.out.println("Segundo apellido: ");
                            String segundoapellido = sc.next();
                            piloto2.setApellido2(segundoapellido);
                            System.out.println("DNI: ");
                            String dni = sc.next();
                            piloto2.setDni(dni);
                            System.out.println("Edad: ");
                            int edad = sc.nextInt();
                            piloto2.setEdad(edad);
                        } else if (Objects.equals(respuesta, vuelo3.getDestino())) {
                            System.out.println("El piloto actual del vuelo es: " + vuelo3.getPiloto() + "\n");
                            System.out.println("Introduzca los datos del nuevo piloto: \nNombre: ");
                            String nombre = sc.next();
                            piloto3.setNombre(nombre);
                            System.out.println("Primer apellido: ");
                            String primerapellido = sc.next();
                            piloto3.setApellido1(primerapellido);
                            System.out.println("Segundo apellido: ");
                            String segundoapellido = sc.next();
                            piloto3.setApellido2(segundoapellido);
                            System.out.println("DNI: ");
                            String dni = sc.next();
                            piloto3.setDni(dni);
                            System.out.println("Edad: ");
                            int edad = sc.nextInt();
                            piloto3.setEdad(edad);
                        } else {
                            System.out.println("Debe poner un destino válido");
                        }
                        break;
                    case 8:
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo números del 1 al 8");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }while (opcion != 8);
    }
}
