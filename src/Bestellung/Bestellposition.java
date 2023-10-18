package Bestellung;

public class Bestellposition
{
    Ware ware;

    public Bestellposition(Ware ware, int menge)
    {
        this.ware = ware;
        this.menge = menge;
    }

    public Ware getWare()
    {
        return ware;
    }

    public int getMenge()
    {
        return menge;
    }

    int menge;


}
