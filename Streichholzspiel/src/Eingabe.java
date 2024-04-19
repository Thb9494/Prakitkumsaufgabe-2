package Streichholzspiel.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Eingabe {

  public static int leseZahl() {
    
      try {
        Ausgabe.zahlEingeben();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
