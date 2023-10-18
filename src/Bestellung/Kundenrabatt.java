package Bestellung;

public class Kundenrabatt
{
    static double kundenrabatt = 0.05;

    public static double getKundenrabatt()
    {
        return kundenrabatt;
    }

    public static void setKundenrabatt(double kundenrabatt)
    {
        Kundenrabatt.kundenrabatt = kundenrabatt;
    }

    public static double berechneRabattpreis(double vollerPreis){
        return vollerPreis*(1-kundenrabatt);
    }
}
