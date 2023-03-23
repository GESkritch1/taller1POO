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
            System.out.println("Opcion 5: Salir del programa");
            int OpcionIngresada = teclado.nextInt();
            double[] sismos = new double[168];
            double nMayor;
            int SmayoresQue5;
            switch (OpcionIngresada) {
                case 1:
                    sismos = ingresoDeDatos();
                    break;
                case 2:
                    nMayor=sismosMayorMagnitud(sismos);
                    break;
                case 3:
                    SmayoresQue5 = sismosMayoresQue5(sismos);
                    break;
                case 4:
                    enviarSMSPorCadaSismo(sismos);
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
    private static void enviarSMSPorCadaSismo(double[] sismosEntregadas3) {

        int contador = 0;

        for (int i = 0; i < sismosEntregadas3.length; i++) {
            if (sismosEntregadas3[i] >= 7) {
                System.out.println("Alerta!!! se debe evacuar zona costera!");
            }
        }
    }

    private static int sismosMayoresQue5(double[] sismosEntregadas2) {

        int contador = 0;

        for (int i = 0; i < sismosEntregadas2.length; i++) {
            if (sismosEntregadas2[i]>=5){
                contador++;
            }
        }
        System.out.println("hay " + contador+ " sismos mayores que 5");
        return contador;
    }

    private static double sismosMayorMagnitud(double[] sismosEntregadas) {
        double nMayor = sismosEntregadas[0];

        for (int i = 0; i<sismosEntregadas.length;i++) {
            if (sismosEntregadas[i] > nMayor) {
                nMayor = sismosEntregadas[i];
            }
        }
        System.out.println("El sismo de mayor magnitud es: "+ nMayor);
        return nMayor;
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