package Fahrzeug;

public class Fahrzeugtest
{
    public static void main(String[] args)
    {
        Motorrad m1 = new Motorrad();
        PKW a1 = new PKW(4,5);
        Fahrzeug f1 = new Fahrzeug(16);

        System.out.println(m1.getAnzahlRäder()+m1.getFahrzeugart());
        System.out.println(f1.toString());
        System.out.println(a1.getAnzahlTüren()+ a1.getAnzahlRäder()+ a1.getFahrzeugart());
        System.out.println(a1.toString());

    }
}
