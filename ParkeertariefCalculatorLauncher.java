package controller;

import java.util.Scanner;

/**
 * @author: My Linh Lu
 * Berekenen van het parkeertarief voor een parkeergarage
 */

public class ParkeertariefCalculatorLauncher {
    public static final double TARIEF_WEEK_DAG = 3.50;
    public static final double TARIEF_WEEK_AVOND = 2.00;
    public static final double TARIEF_WEEK_NACHT = 1.50;
    public static final double TARIEF_WEEKEND = 2.50;
    public static final int ONDERGRENS_OVERDAG = 8;
    public static final int BOVENGRENS_OVERDAG = 18;
    public static final int GRENS_NACHT = 24;

    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);

        System.out.println("=== Parkeertarief Calculator ===\n");
        System.out.print("Welke dag is het? (1=ma, 2=di, 3=wo, 4=do, 5=vr, 6=za, 7=zo): ");
        int parkeerDagNr = toetsenbord.nextInt();

        String parkeerDag;

        switch (parkeerDagNr) {
            case 1:
                parkeerDag = "Maandag";
                break;
            case 2:
                parkeerDag = "Dinsdag";
                break;
            case 3:
                parkeerDag = "Woensdag";
                break;
            case 4:
                parkeerDag = "Donderdag";
                break;
            case 5:
                parkeerDag = "Vrijdag";
                break;
            case 6:
                parkeerDag = "Zaterdag";
                break;
            case 7:
                parkeerDag = "Zondag";
                break;
            default:
                parkeerDag = "Parkeerdag ongeldig";
        }

        System.out.print("Hoe laat begint u met parkeren? (uur, 0-23): ");
        int startTijdParkeren = toetsenbord.nextInt();

        System.out.print("Hoeveel uur wilt u parkeren? ");
        int parkeerTijd = toetsenbord.nextInt();

        double parkeerTarief;

        System.out.println("\nBerekening:\n----------");
        if (parkeerDagNr > 0 && parkeerDagNr < 6){
            if (startTijdParkeren >= ONDERGRENS_OVERDAG && startTijdParkeren < BOVENGRENS_OVERDAG){
                parkeerTarief = TARIEF_WEEK_DAG;
            } else if (startTijdParkeren >= BOVENGRENS_OVERDAG && startTijdParkeren < GRENS_NACHT){
                parkeerTarief = TARIEF_WEEK_AVOND;
            } else {
                parkeerTarief = TARIEF_WEEK_NACHT;
            }
        } else {
            parkeerTarief = TARIEF_WEEKEND;
        }

        double totaalTarief = parkeerTarief * parkeerTijd;

        System.out.println("Dag: " + parkeerDag);
        System.out.println("Starttijd: " + startTijdParkeren + ":00 uur");
        System.out.println("Aantal uren: " + parkeerTijd);
        System.out.println("Tarief: €" + parkeerTarief + " per uur\n");

        System.out.println("Totaal te betalen: €" + totaalTarief);
    }
}
