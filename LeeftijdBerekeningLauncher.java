package controller;
import java.util.Scanner;

/**
 * @author: My Linh Lu
 * Dit programma berekent leeftijd in het jaar 2026 obv geboortejaar ingevoerd door gebruiker
 */

public class LeeftijdBerekeningLauncher {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hoe heet je? ");
        String naam = scanner.nextLine();

        System.out.print("Wat is je geboortejaar? ");
        int geboorteJaar = scanner.nextInt();

        int HUIDIG_JAAR = 2026;
        int leeftijd = HUIDIG_JAAR - geboorteJaar;

        System.out.println();
        System.out.println("Beste " + naam + ", eind " + HUIDIG_JAAR + " zal je leeftijd " + leeftijd + " zijn.");
    }
}
