package parcial_ipc;

import java.util.Scanner;

public class Parcial_IPC {

    public static void main(String[] args) {
        int Opcion;
        Scanner Leer = new Scanner(System.in);

        System.out.println("---------MENU--------");
        System.out.println("*     Problema 1    *");
        System.out.println("*     Problema 2    *");
        System.out.println("*     Problema 3    *");
        System.out.println("*        Salir      *");
        System.out.println("---------------------");

        Opcion = Leer.nextInt();

        switch (Opcion) {
            case 1:
                System.out.println("Esta ejecutandose el problema 1");

                break;

            case 2:
                System.out.println("Esta ejecutandose el problema 2");

                break;

            case 3:
                System.out.println("Esta ejecutandose el problema 3");

                break;

            case 4:
                System.out.println("Terminando la ejecucion");
                System.exit(0);

            default:
                System.out.println("***********Ingrese un valor numerico del 1 al 4*************");

        }

    }

}
