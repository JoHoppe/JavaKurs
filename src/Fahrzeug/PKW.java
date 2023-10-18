package Fahrzeug;

public class PKW extends Fahrzeug
{
    private int anzahlTüren;


    public PKW(Fahrzeughalter fahrzeughalter,int anzahlRäder,int anzahlTüren)
    {
        super(fahrzeughalter,"PKW",anzahlRäder);
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
    public  String noOwnerToString(){
        return super.noOwnerToString()+getAnzahlTüren();
    }
}
