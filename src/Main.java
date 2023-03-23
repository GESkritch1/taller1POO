import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    private static void menu() {
        boolean salir = true;
        do {


            System.out.println("elija 1 opcion del menu con un numero: ");
            System.out.println("Opcion 1: Ingresar datos");
            System.out.println("Opcion 2: Mostrar sismos de mayor magnitud");
            System.out.println("Opcion 3: Contar sismos mayores o igual a 5.0");
            System.out.println("Opcion 4: Enviar SMS por cada sismo mayor o igual a 7.0");
            System.out.println("Opcion 5:Salir del programa");
            int OpcionIngresada = teclado.nextInt();
            double[] sismos = new double[168];

            switch (OpcionIngresada) {
                case 1:
                    sismos = ingresoDeDatos();
                    break;
                case 2:
                    sismosMayorMagnitud(sismos);
                    break;
                case 3:
                    sismosMayoresQue5();
                    break;
                case 4:
                    enviarSMSPorCadaSismo();
                    break;
                case 5:
                    salir=false;
                    break;
                default:
                    System.out.println("ese dato no existe ingrese otra vez");
                    break;
            }
        }while (salir == true);
    }
    private static void enviarSMSPorCadaSismo() {

    }

    public static void sismosMayoresQue5() {

    }

    private static void sismosMayorMagnitud(double[] sismosEntregadas) {


    }

    public static double[] ingresoDeDatos() {

        double[] datos = new double[168];
        Random  rnd = new Random();


        for (int i = 0; i<168; i++){

            datos[i] = Math.floor(((rnd.nextDouble(0.0,9.9))*10)/10);
        }

        return datos;

    }


    public static void main(String[] args) {

            menu();
    }
}