package Streichholzspiel.src;
public class Spiel {
  private int anzahlHoelzerZuBeginn;
  private int anzahlHoelzerImSpiel;

  // Konstruktor
  public Spiel(int anzahlHoelzerZuBeginn) {
    this.anzahlHoelzerZuBeginn = anzahlHoelzerZuBeginn;
    while (anzahlHoelzerImSpiel > 0) {
      computerZiehen();
      //menschgewinnt, falls computer das letzte Holz gezogen hat
      if (anzahlHoelzerImSpiel <= 0) {
        Ausgabe.menschGewinnt();
        break;
      }
      menschZiehen();
      //computergewinnt, falls mensch das letzte Holz gezogen hat
      if (anzahlHoelzerImSpiel <= 0) {
        Ausgabe.computerGewinnt();
        break;
      }
    }
  }


public void computerZiehen () {
  berechneComputerZug();
  anzahlHoelzerImSpiel = anzahlHoelzerImSpiel - berechneComputerZug();
  if (anzahlHoelzerImSpiel < 0) {
    anzahlHoelzerImSpiel = anzahlHoelzerImSpiel + berechneComputerZug();
    computerZiehen();
  }
  Ausgabe.computerZug(berechneComputerZug(), anzahlHoelzerImSpiel);
}

public void menschZiehen () {
  Eingabe.leseHoelzer();
  anzahlHoelzerImSpiel = anzahlHoelzerImSpiel - Eingabe.leseHoelzer();
  if (anzahlHoelzerImSpiel < 0) {
    Ausgabe.zugNichtMoeglich();
    anzahlHoelzerImSpiel = anzahlHoelzerImSpiel + Eingabe.leseHoelzer();
    menschZiehen();
  }
  Ausgabe.menschZug(Eingabe.leseHoelzer(), anzahlHoelzerImSpiel);
}

private int berechneComputerZug () {
  if (anzahlHoelzerImSpiel % 4 == 0) {
    return 3;
  } else if (anzahlHoelzerImSpiel % 4 == 3) {
    return 2;
  } else if (anzahlHoelzerImSpiel % 4 == 2) {
    return 1;
  } else {
  return 2;
}
}
}