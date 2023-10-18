package Fahrzeug;

import java.util.ArrayList;

public class Firma extends JuristischePerson implements  Fahrzeughalter
{
    private String name;

    public Firma(String name)
    {
       this.name=name;
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

    @Override
    public String toString()
    {
        return ("Owner: "+ name+"| Cars: "+super.toString());

    }
    public String getName(){
        return (name);
    }

}
