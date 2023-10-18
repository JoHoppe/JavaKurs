package Bestellung;

public class testBestellung
{
    public static void main(String[] args)
    {
        Kunde kunde = new Kunde("peter","hans","123");
        Bestellung bestellung= new Bestellung(kunde);
        Ware w = new Ware("123","Hammer",20.00);
        Bestellposition pos = new Bestellposition(w,30);
        bestellung.nimmAuf(pos);
        bestellung.zeigeAn();

    }
}