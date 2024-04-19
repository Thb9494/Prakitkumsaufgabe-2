package Streichholzspiel.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Eingabe {

  public static int leseZahl() {
    boolean isNumber = false;
    int number = 0;

    while (!isNumber) {
      try {
        Ausgabe.zahlEingeben();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        number = Integer.parseInt(input);
        isNumber = true;
      } catch (IOException e) {
        Ausgabe.keineZahl();
        e.printStackTrace();
      } catch (NumberFormatException e) {
        Ausgabe.keineZahl();
      }
    }

    return number; 
} 
  //Methode für leseHoelzer
  public static int leseHoelzer() {
    int hoelzer = leseZahl();
    while (hoelzer < 1 || hoelzer > 3) {
      Ausgabe.zahlNichtImBereich();
      leseZahl();
    }
    return hoelzer;

  
  }
}
