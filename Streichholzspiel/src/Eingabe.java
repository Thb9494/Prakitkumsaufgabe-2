package Streichholzspiel.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eingabe {

  public static int leseZahl() {

    Ausgabe.zahlEingeben();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String input = reader.readLine();
      return Integer.parseInt(input);

    } catch (IOException e) {
      e.printStackTrace();
      return leseZahl();
    } catch (NumberFormatException e) {
      Ausgabe.keineZahl();
      return leseZahl();
    }
  }

  // Methode für leseHoelzer
  public static int leseHoelzer() {
    int zahl = leseZahl();
    
    if (zahl < 1 || zahl > 3) {
      Ausgabe.zahlNichtImBereich();
      return leseHoelzer();
     } 
    return zahl;
  }
}
