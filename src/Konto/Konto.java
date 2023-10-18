package Konto;

public class Konto
{
    public Konto(String kontonummer, int kontostand, double zinssatz)
    {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
        this.zinssatz = zinssatz;
    }

    public String getKontonummer()
    {
        return kontonummer;
    }


    public int getKontostand()
    {
        return kontostand;
    }

    public void setKontostand(int kontostand)
    {
        this.kontostand = kontostand;
    }

    public double getZinssatz()
    {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz)
    {
        this.zinssatz = zinssatz;
    }

    public String kontonummer;
    public int kontostand;
    private double zinssatz;
}