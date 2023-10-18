package Bestellung;

import javax.swing.*;
import java.util.ArrayList;

public class Bestellung
{
    private final ArrayList<Bestellposition> bestellposition = new ArrayList<>();
    private final Kunde kunde;

    public Bestellung(Kunde kunde)
    {
        this.kunde = kunde;
    }

    public void nimmAuf(Bestellposition position)
    {
        bestellposition.add(position);
    }

    public void zeigeAn() {
        if (kunde.bekommtRabatt) {
            System.out.println("Bestellung von: " + kunde.vorname + " " + kunde.nachname + " mit Kundenrabbat von: " + Kundenrabatt.kundenrabatt);
        } else {
            System.out.println("Bestellung von: " + kunde.vorname + " " + kunde.nachname);
        }

        System.out.println("--------------------------------------------------");
        System.out.format("%-10s %-20s %-15s %-10s%n", "Nummer", "Bezeichnung", "Preis", "Menge");
        System.out.println("--------------------------------------------------");

        for (Bestellposition position : bestellposition) {
            String output = String.format("%-10s %-20s %-15s %-10s",
                    position.ware.nummer, position.ware.bezeichnung, position.ware.preis, position.menge);
            System.out.println(output);
        }
    }

}
