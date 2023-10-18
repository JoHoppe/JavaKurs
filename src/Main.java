import jdk.jfr.Label;

import java.util.Scanner;

import static java.lang.Integer.*;

public class Main implements Runnable
{

    public static void main(String[] args)
    {

    }

    private static void getInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your int");

        int inputInt = scanner.nextInt();
        System.out.println("QS:"+ quersumme(inputInt));
    }

    @Override @Label("run")
    public void run()
    {
    }

    private static int quersumme(int input){
        int i =1;
        int sum=0;

        int lengthInput=(int)(Math.log10(input)+1);
        while(i<=lengthInput){
            int divided= (int)(input%10);
            input=input/10;
            sum=sum+divided;
            i++;
        }
        return sum;
    }
}
