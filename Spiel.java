public class Spiel {
  private int anzahlHoelzerZuBeginn;
  private int anzahlHoelzerImSpiel;

  // Konstruktor
  public Spiel(int anzahlHoelzerZuBeginn) {
    this.anzahlHoelzerZuBeginn = anzahlHoelzerZuBeginn;
  }

  //setter für anzahlHoelzerZuBeginn
  public void setAnzahlHoelzerZuBeginn(int anzahlHoelzerZuBeginn) {
    this.anzahlHoelzerZuBeginn = anzahlHoelzerZuBeginn;
  }

  //getter für anzahlHoelzerImSpiel
  public int getAnzahlHoelzerImSpiel() {
    return anzahlHoelzerImSpiel;
  }
}