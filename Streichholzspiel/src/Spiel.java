package Streichholzspiel.src;
public class Spiel {
  private int anzahlHoelzerZuBeginn;
  private int anzahlHoelzerImSpiel;

  // Konstruktor
  public Spiel(int anzahlHoelzerZuBeginn) {
    this.anzahlHoelzerZuBeginn = anzahlHoelzerZuBeginn;
    while (anzahlHoelzerImSpiel > 0) {
      computerZiehen();
      menschZiehen();
    }
  }

  //setter für anzahlHoelzerZuBeginn
  // public void setAnzahlHoelzerZuBeginn(int anzahlHoelzerZuBeginn) {
  //   this.anzahlHoelzerZuBeginn = anzahlHoelzerZuBeginn;
  // }

  // //getter für anzahlHoelzerImSpiel
  // public int getAnzahlHoelzerImSpiel() {
  //   return anzahlHoelzerImSpiel;
  // }
public void computerZiehen () {}

public void menschZiehen () {}

private int berechneComputerZug () {
  return 0;
}
}