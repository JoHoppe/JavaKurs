package Fahrzeug;

import java.util.ArrayList;

public class NatürlichePerson extends Person implements Fahrzeughalter
{
    private final String vorName;
    private final String nachName;

    public NatürlichePerson(String vorName, String nachName)
    {
        this.vorName = vorName;
        this.nachName = nachName;

    }

    public String getName()
    {
        return (vorName + " " + nachName);
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
        return ("Owner: " + this.getName() + "| Cars: " + arrFahrToString());

    }
}
