package lab2p2_catalinayushan;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.DateFormat;
import java.util.SimpleDateFormat;
import java.util.Array;

public class Lab2P2_CatalinaYushan {

    public static void main(String[] args) {
        Scanner quaxly = new Scanner(System.in);
        System.out.println("-----Bienvenido al menu!-----");
        System.out.println("1. Torres de Hanoi");
        System.out.println("2. String Date");
        System.out.println("3. Sumatoria");
        System.out.println("4. Salir ");
        System.out.println("Digite la opcion que desea visitar: ");
        int choice = quaxly.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Ingrese el numero de discos que desee resolver: ");
                    int discnumber = quaxly.nextInt();
                    int originofdisc = 1;
                    int auxiliarystack = 2;
                    int destinyofdisc = 3;
                    HanoiTower(discnumber, originofdisc, auxiliarystack, destinyofdisc);
                    break;
                case 2:
                    System.out.println("Debera ingresar una oracion con el siguiente formato: diego, 01/06/2000, animales123, carro, 22/16/2000... ");
                    System.out.println("Cada elemento y fecha debe de estar separada por comas!");
                    System.out.println("Ingrese su oracion: ");
                    String jabble = quaxly.nextLine();
                    String fabble[] = jabble.split(",");
                    Date numbertwo;
                    DateFormat mewtwo = new SimpleDateFormat("dd/MM/yyyy");
                    
                    for (int i = 0; i < fabble.length; i++) {
                        if{fabble[i].contains("/")){
                            
                        }
                           
                    }
                   
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Adios, no regrese nunca!");
                    break;
                default:
            }

        } while (choice < 3);
    }
    public static void HanoiTower(int discnumber, int originofdisc, int auxiliarystack, int destinyofdisc) {

        if (discnumber == 1) {
            System.out.println("Mover" + discnumber + "de" + originofdisc + "a" + destinyofdisc);
        } else {
            HanoiTower(discnumber - 1, originofdisc, destinyofdisc, auxiliarystack);
        }
        System.out.println("Mover disco" + discnumber + "de" + originofdisc + "a" + destinyofdisc);
        HanoiTower(discnumber - 1, auxiliarystack, originofdisc, destinyofdisc);
    }
}

