import java.awt.event.ItemEvent;
import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    private static void menu() {
        System.out.println("elija 1 opcion del menu: ");
        int OpcionIngresada = teclado.nextInt();

        switch (OpcionIngresada) {
            case 1:
                System.out.println("Opcion 1: Ingresar datos");
                ingresoDeDatos();
                break;
            case 2:
                System.out.println("Opcion 2: Mostrar sismos de mayor magnitud");
                sismosMayorMagnitud();
                break;
            case 3:
                System.out.println("Opcion 3: Contar sismos mayores o igual a 5.0");
                sismosMayoresQue5();
                break;
            case 4:
                System.out.println("Opcion 4 Enviar SMS por cada sismo mayor o igual a 7.0");
                enviarSMSPorCadaSismo();
                break;
            case 5:
                System.out.println("Salir del programa");
                break;
            default:
        }
    }

    public static void ingresoDeDatos() {

    }


    public static void main(String[] args) {
        menu();
    }
}