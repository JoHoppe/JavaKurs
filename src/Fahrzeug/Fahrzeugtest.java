package Fahrzeug;

public class Fahrzeugtest
{
    public static void main(String[] args)
    {

        Fahrzeughalter peter = new Firma("Peter");
        Fahrzeughalter hansPeter = new NatürlichePerson("Hans","Peter");
        PKW p1 = new PKW(peter,4,5);
        Motorrad m1 = new Motorrad(hansPeter);
        System.out.println(p1.toString());
        System.out.println(peter.toString());
        System.out.println(hansPeter);


    }
}
