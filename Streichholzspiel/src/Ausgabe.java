package Streichholzspiel.src;
public class Ausgabe {
private int eingabe;

  public static void zahlEingeben () {
    System.out.println("Bitte geben Sie eine Anzahl zwischen 1 und 3 der Streichhölzer, die sie ziehen möchten ein: ");
   

  }

  public static void keineZahl() {
    System.out.println("Das ist keine Zahl!");
  }

  public static void zahlNichtImBereich() {
    System.out.println("Die Zahl ist nicht im Bereich!");
  }

  public static void menschGewinnt () {
    System.out.println("Gratulation! Sie haben gewonnen!");
  }

  public static void computerGewinnt () {
    System.out.println("Der Computer hat gewonnen!");
  }

  public static void zugNichtMoeglich () {
    System.out.println("Es sind nicht genug Hölzer für den von Ihnen gewählten Zug vorhanden!");
  }

  public static void spielstand (int anzahlHoelzerImSpiel) {
    
    System.out.println("Es sind noch " + anzahlHoelzerImSpiel + " Hölzer im Spiel.");
  }

  public static void menschZug (int gezogeneHoelzer, int anzahlHoelzerImSpiel) {
    System.out.println("Sie haben " + gezogeneHoelzer + " Hölzer gezogen und es bleiben noch " + anzahlHoelzerImSpiel + " Hölzer im Spiel.");
    
  }

  public static void computerZug (int gezogeneHoelzer, int anzahlHoelzerImSpiel) {
    System.out.println("Der Computer hat " + gezogeneHoelzer + " Hölzer gezogen und es bleiben noch " + anzahlHoelzerImSpiel + " Hölzer im Spiel.");
    
  }
  
}
