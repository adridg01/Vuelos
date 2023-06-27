import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Aeropuerto {
    static Scanner sc = new Scanner(System.in);
    private static ArrayList<Vuelos> vuelos = new ArrayList<Vuelos>();

    private static int findVuelos(Vuelos vuelo){
        int index = vuelos.indexOf(vuelo);
        if (index >=0) {
            return index;
        }
        else
            return -1;
    }
    public static int findVuelo(){
        System.out.println("BUSCAR VUELO POR Nº:");
        if (vuelos.isEmpty()){
            System.out.println("No existen vuelos");
        }else {
            System.out.print("Número de vuelo: ");
            String vuelo = sc.nextLine();
            for (int i = 0; i < vuelos.size(); i++) {
                if (vuelos.get(i).getNumero().equals(vuelos)) {
                    System.out.println("Datos del vuelo:");
                    System.out.println(vuelos.get(i).toString());
                    break;
                }
            }
        }
        return -1;
    }
    public static void findVueloClaves(){
        System.out.println("BUSCAR VUELO POR CLAVE:");
        if (vuelos.isEmpty()){
            System.out.println("No existen vuelos");
        }else {
            Scanner sc=new Scanner(System.in);
            String opcion;
            System.out.print("Clave: ");
            opcion= sc.nextLine();
            switch (opcion.toLowerCase()){
                case "origen"->{
                    System.out.print("Valor: ");
                    String val= sc.nextLine();
                    for (int i = 0; i < vuelos.size(); i++) {
                        if (vuelos.get(i).getOrigen().toLowerCase().equals(val)) {
                            System.out.println("Datos del vuelo:");
                            System.out.println(vuelos.get(i).toString());
                        }
                    }
                }
                case "destino" ->{
                    System.out.print("Valor: ");
                    String val= sc.nextLine();
                    for (int i = 0; i < vuelos.size(); i++) {
                        if (vuelos.get(i).getDestino().toLowerCase().equals(val)) {
                            System.out.println("Datos del vuelo:");
                            System.out.println(vuelos.get(i).toString());
                        }
                    }
                }
                case "numero" ->{
                    findVuelo();
                }
                case "dia" ->{
                    System.out.print("Valor(dd-mm): ");
                    String val= sc.nextLine();
                    for (int i = 0; i < vuelos.size(); i++) {
                        if (vuelos.get(i).getDia().equals(val)) {
                            System.out.println("Datos del vuelo:");
                            System.out.println(vuelos.get(i).toString());
                        }
                    }
                }
                case "clase" ->{
                    System.out.print("Valor: ");
                    String val= sc.nextLine();
                    for (int i = 0; i < vuelos.size(); i++) {
                        if (vuelos.get(i).getClase().toLowerCase().equals(val)) {
                            System.out.println("Datos del vuelo:");
                            System.out.println(vuelos.get(i).toString());
                        }
                    }
                }
            }

        }
    }
    public static void printVuelos(){
        System.out.println("DATOS DE LOS VUELOS:");
        if (vuelos.isEmpty()){
            System.out.println("No existen vuelos");
        }else {
            for (int i = 0; i < vuelos.size(); i++) {
                System.out.println(vuelos.get(i).toString());
            }
        }
    }
    public static boolean addNewVuelo(Vuelos vuelo){
        if (findVuelos(vuelo) == -1){
            vuelos.add(vuelo);
            return true;
        }
        else{
            System.out.println("El vuelo ya existe.");
            return false;
        }
    }
    public static boolean removeVuelo(){
        System.out.println("BORRAR VUELO:");
        if (vuelos.isEmpty()){
            System.out.println("No existen vuelos");
        }else {
            System.out.print("Número de vuelo: ");
            String vuelo = sc.nextLine();
            for (int i = 0; i < vuelos.size(); i++) {
                if (Objects.equals(vuelos.get(i).getNumero(), vuelo)) {
                    System.out.println("Vuelo nº "+vuelos.get(i).getNumero()+" eliminado.");
                    int index = vuelos.indexOf(vuelo);
                    vuelos.remove(index);
                    return true;
                }
            }
        }
        return false;
    }
    public static void imprimirMenu(){
        System.out.println("=======================================");
        System.out.println("   VUELOS DEL AEROPUERTO DE VALENCIA   ");
        System.out.println("=======================================");
        System.out.println(" 1 - Imprimir todos los vuelos");
        System.out.println(" 2 - Buscar un número de vuelo");
        System.out.println(" 3 - Buscar vuelo por clave");
        System.out.println(" 4 - Añadir vuelo nuevo");
        System.out.println(" 5 - Borrar vuelo por número");
        System.out.println(" 0 - SALIR");
        System.out.println("-----------------------------");

    }
}
