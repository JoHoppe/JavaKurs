package Fahrzeug;

import java.util.ArrayList;

public class NatürlichePerson extends Person implements Fahrzeughalter
{
    private  final String vorName;
    private  final  String  nachName;
    public NatürlichePerson(String vorName, String nachName)
    {
        super(vorName, nachName);
    }
    public String getName(){
        return (vorName+" "+nachName);
    }
    @Override
    public void addFahrzeug(Fahrzeug fahrzeug)
    {

    }

    @Override
    public ArrayList<Fahrzeug> getFahrzeuge()
    {
        return null;
    }

    @Override
    public String arrFahrToString()
    {
        return null;
    }
}
