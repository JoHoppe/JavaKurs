package Bestellung;

public class Kunde
{
    public Kunde(String vorname, String nachname, String nummer)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.nummer = nummer;
    }

    String vorname;
    String nachname;

    public void setBekommtRabatt(boolean bekommtRabatt)
    {
        this.bekommtRabatt = bekommtRabatt;
    }

    public String getVorname()
    {
        return vorname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public String getNummer()
    {
        return nummer;
    }

    public boolean isBekommtRabatt()
    {
        return bekommtRabatt;
    }

    String nummer;
    boolean bekommtRabatt= false;

}
