package Fahrzeug;

import java.util.ArrayList;

public interface Fahrzeughalter
{

    public void addFahrzeug(Fahrzeug fahrzeug);

    public ArrayList<Fahrzeug> getFahrzeuge();

    public String arrFahrToString();

    @Override
    public String toString();

    abstract String getName();

}
