package Fahrzeug;

public class PKW extends Fahrzeug
{
    private int anzahlTüren;


    public PKW(int anzahlRäder,int anzahlTüren)
    {
        super("PKW",anzahlRäder);
        this.anzahlTüren= anzahlTüren;

    }

    public int getAnzahlTüren()
    {
        return anzahlTüren;
    }


    public String toString(){
        String output= super.toString()+getAnzahlTüren();
        return output;
    }
}
