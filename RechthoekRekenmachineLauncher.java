package controller;
import java.util.Scanner;

/**
 * @author: My Linh Lu
 * Dit programma berekent oppervlakte en omtrek obv lengte en breedte invoer van gebruiker
 */

public class RechthoekRekenmachineLauncher {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Rechthoek Rekenmachine ===\n");

        System.out.print("Wat is de lengte van de rechthoek (in cm)? ");
        double lengte = scanner.nextDouble();

        System.out.print("Wat is de breedte van de rechthoek (in cm)? ");
        double breedte = scanner.nextDouble();

        double oppervlakte = lengte * breedte;
        double omtrek = 2 * (lengte + breedte);

        System.out.println();
        System.out.println("Resultaten:\n-----------");
        System.out.println("Lengte:       " + lengte + "cm");
        System.out.println("Breedte:      " + breedte + "cm");
        System.out.println("Oppervlakte:  " + oppervlakte + "cm2");
        System.out.println("Omtrek:       " + omtrek + "cm");
    }
}
