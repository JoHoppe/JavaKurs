package Konto;

public class KontoTest implements Runnable
{
    int i;
    public KontoTest(int i){
        this.i =i;
        System.out.println("inside of the thread");
    }
    private void iterateI(int i){
        this.i++;
    }
    public static void main(String[] args)
    {
        KontoTest obj = new KontoTest(1);
        KontoTest obj2 = new KontoTest(2);
        Thread thread = new Thread(obj);
        Thread thread2 = new Thread(obj2);

        Konto myKonto = new Konto("DE44 2304 0000",2000,0.06);

        int numberThreads = 8;


    }

    @Override
    public void run()
    {
        while (true)
        {
            System.out.println(i);
            iterateI(i);
            /*try
            {
                Thread.sleep(500);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

             */
        }
    }
}
