package parcial_ipc;

import java.util.Scanner;

public class Parcial_IPC {

    public static void main(String[] args) {
        int Opcion;
        int numero1;
        int numero2;
        int numeroImpar;
        int Opcion2;
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
                System.out.println("Ingrese un numero");
                numero1 = Leer.nextInt();
                System.out.println("Ingrese el segundo numero");
                numero2 = Leer.nextInt();
                if (numero1 > numero2) {
                    System.out.println("El numero mayor es:  " + numero1);
                } else {
                    System.out.println("El numero mayor es:  " + numero2);
                }
                break;

            case 2:
                System.out.println("Ingrese un numero impar");
                numeroImpar = Leer.nextInt();

                if (numeroImpar % 2 == 0) {
                    System.out.println("ERROR ingrese solamente numeros impares");
                } else {
                    for (int i = 1; i <= (numeroImpar / 2) + 1; i++) {
                        for (int j = 1; j <= numeroImpar - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= (i * 2) - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }
                break;

            case 3:
                System.out.println("Produccion de leche");
                System.out.println("Con cuantas vacas inicia? 8 / 10");
                Opcion2 = Leer.nextInt();
                switch (Opcion2) {
                    case 8:
                        int Indice = 0;
                        int pesoTotal = 0;
                        int PesoLimite = 1000;
                        int peso[] = {223,243,100,200,200,155,300,150};
                        int Leche[] = {30,34,28,45,31,50,29,1};
                        
                        while(pesoTotal <= 1000){
                        
                        for(int x = 1; x < Leche.length; x++){
                            if (Leche[x] > Leche[Indice]){
                                Indice = x;
                            }
                            else
                            {
                                x++;
                            }
                        }
                        int Mayor = Leche[Indice];
                        int PesoVaca = peso[Indice];
                        System.out.println(Indice + "  " + Mayor + "  " + PesoVaca);
                        pesoTotal = PesoVaca + pesoTotal;
                        }
                        
                        System.out.println(pesoTotal);

                        break;

                    case 10:

                        break;
                }

                break;

            case 4:
                System.out.println("Terminando la ejecucion");
                System.exit(0);

            default:
                System.out.println("***********Ingrese un valor numerico del 1 al 4*************");

        }

    }

}
