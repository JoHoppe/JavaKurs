package Bestellung;

public class Ware
{
    String bezeichnung;
    double preis;
    String nummer;

    public Ware(String nummer, String bezeichnung, double preis)
    {
        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }


    public void setPreis(double preis)
    {
        this.preis = preis;
    }

    public String getNummer()
    {
        return nummer;
    }

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public double getPreis()
    {
        return preis;
    }


}
