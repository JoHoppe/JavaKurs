package Fahrzeug;

import java.util.ArrayList;

public class Firma extends JuristischePerson implements Fahrzeughalter
{

    private ArrayList<Fahrzeug> arrFahr = new ArrayList<Fahrzeug>();

    public Firma(String name)
    {
        super(name);
    }

    public void addFahrzeug(Fahrzeug fahrzeug)
    {
        arrFahr.add(fahrzeug);
    }

    public ArrayList<Fahrzeug> getFahrzeuge()
    {
        return arrFahr;
    }

    public String arrFahrToString()
    {
        return Util.arrFahrToString(arrFahr);
    }

    public String toString()
    {
        return ("Owner: " + name + "| Cars: " + arrFahrToString());

    }

    public String getName()
    {
        return (name);
    }

}
