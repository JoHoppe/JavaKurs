package Fahrzeug;
import  org.junit.jupiter.params.ParameterizedTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.junit.jupiter.api.Assertions.*;

public class Fahrzeugtest
{
    public static void main(String[] args)
    {
        Fahrzeughalter peter = new Firma("Peter");
        Fahrzeughalter hansPeter = new NatürlichePerson("Hans", "Peter");
        PKW p1 = new PKW(peter, 4, 5);
        Motorrad m1 = new Motorrad(hansPeter);
        System.out.println(p1.toString());
        System.out.println(peter.toString());
        System.out.println();
        System.out.println(hansPeter.toString());


    }

    @Test

    public static void test()
    {


    }
}
