public class ThreadTest
{

    public static void main (String[] args)
    {
        Thread  A   =   new  Thread ( new PrintA());
        Thread  B   =   new  Thread ( new PrintB());

        A.start();
        B.start();
    }
}
