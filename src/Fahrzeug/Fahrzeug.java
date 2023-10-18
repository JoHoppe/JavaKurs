package Fahrzeug;


public class Fahrzeug
{
    private String fahrzeugart;
    private int anzahlRäder;

    public Fahrzeug(int anzahlRäder)
    {
        this("allgemeines Fahrzeug",anzahlRäder);
    }

    public Fahrzeug(String fahrzeugart, int anzahlRäder)
    {
        this.fahrzeugart = fahrzeugart;
        this.anzahlRäder = anzahlRäder;
    }

    public String getFahrzeugart()
    {
        return fahrzeugart;
    }

    public int getAnzahlRäder()
    {
        return anzahlRäder;
    }

    public String toString(){
        String output =getAnzahlRäder()+getFahrzeugart();
        return output;
    }
}
