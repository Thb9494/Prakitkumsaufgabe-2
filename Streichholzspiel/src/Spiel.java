package Streichholzspiel.src;
public class Spiel {
  private int anzahlHoelzerImSpiel;

  // Konstruktor
  public Spiel(int anzahlHoelzerZuBeginn) {
    this.anzahlHoelzerImSpiel = anzahlHoelzerZuBeginn;
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
  int gezogen = berechneComputerZug();
  anzahlHoelzerImSpiel = anzahlHoelzerImSpiel - gezogen;
  Ausgabe.computerZug(gezogen, anzahlHoelzerImSpiel);
}

public void menschZiehen () {
  int input = Eingabe.leseHoelzer();
  anzahlHoelzerImSpiel = anzahlHoelzerImSpiel - input;
  if (anzahlHoelzerImSpiel < 0) {
    Ausgabe.zugNichtMoeglich();
    anzahlHoelzerImSpiel = anzahlHoelzerImSpiel + input;
    menschZiehen();
  }
  Ausgabe.menschZug(input, anzahlHoelzerImSpiel);
}

private int berechneComputerZug () {
  if (anzahlHoelzerImSpiel % 4 == 0) {
    return 3;
  } else if (anzahlHoelzerImSpiel % 4 == 3) {
    return 2;
  } else if (anzahlHoelzerImSpiel % 4 == 2) {
    return 1;
  } else {
  return 1;
}
}
}