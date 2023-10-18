package Fahrzeug;

import java.util.ArrayList;

public final class Util
{
    public static String arrFahrToString(ArrayList<Fahrzeug> arrFahr)
    {
        String output = "";
        for (Fahrzeug fahrzeug : arrFahr)
        {
            output += fahrzeug.noOwnerToString() + " ";
        }
        return output;
    }

}
