import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar=true;
        Vuelos v1=new Vuelos("Menorca","Valencia","2023-01","15-08","turista");
        Vuelos v2=new Vuelos("Tenerife","Valencia","2023-02","20-08","turista");
        Vuelos v3=new Vuelos("Valencia","Paris","2023-03","15-08","primera");
        Vuelos v4=new Vuelos("Valencia","Atenas","2023-04","20-08","primera");
        Aeropuerto.addNewVuelo(v1);
        Aeropuerto.addNewVuelo(v2);
        Aeropuerto.addNewVuelo(v3);
        Aeropuerto.addNewVuelo(v4);
        Aeropuerto.imprimirMenu();
        do {
            Scanner st = new Scanner(System.in);
            try {
                System.out.print("Dame la opcion:");
                int opc = st.nextInt();

                switch (opc) {
                    case 0 -> {
                        System.out.println("Saliendo del programa...");
                        continuar = false;
                    }
                    case 1 -> Aeropuerto.printVuelos();
                    case 2 -> Aeropuerto.findVuelo();
                    case 3 -> Aeropuerto.findVueloClaves();
                    case 4 -> añadir();
                    case 5 -> Aeropuerto.removeVuelo();
                    default -> System.out.println("Elige una opcion correcta.");
                }
            }catch (InputMismatchException e){
                System.out.println("Elige una opcion correcta.");
            }
        }while (continuar);
    }
    public static void añadir(){
        Scanner sc =new Scanner(System.in);
        System.out.println("AÑADIR NUEVO VUELO:");
        System.out.print("Número: ");
        String org= sc.nextLine();
        System.out.print("Origen: ");
        String dest= sc.nextLine();
        System.out.print("Destino: ");
        String num= sc.nextLine();
        System.out.print("Día (dd-mm): ");
        String dia= sc.nextLine();
        System.out.print("Clase: ");
        String clase= sc.nextLine();
        System.out.println("Vuelo añadido a la lista");
        Vuelos vv=new Vuelos(org,dest,num, dia,clase);
        Aeropuerto.addNewVuelo(vv);
    }
}