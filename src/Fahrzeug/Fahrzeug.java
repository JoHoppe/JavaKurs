package Fahrzeug;


public abstract class Fahrzeug
{
    private String fahrzeugart;
    private int anzahlRäder;
    private Fahrzeughalter halter;

    public Fahrzeug(Fahrzeughalter halter,int anzahlRäder)
    {
        this(halter,"allgemeines Fahrzeug",anzahlRäder);
    }

    public Fahrzeug(Fahrzeughalter halter, String fahrzeugart, int anzahlRäder)
    {
        this.halter = halter;
        this.fahrzeugart = fahrzeugart;
        this.anzahlRäder = anzahlRäder;

        halter.addFahrzeug(this);
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
        String output =anzahlRäder+fahrzeugart;
        output= output+"owned by:" + halter.getName();
        return output;
    }
    public  String noOwnerToString(){
        return anzahlRäder+fahrzeugart;
    }
}
