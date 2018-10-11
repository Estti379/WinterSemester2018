public class Main
{

    public static void main (String[] args)
    {

        Car    A    =   new Car("BMW",10,200);
        Person B    =   new Person("Alice", 30);

        printAge(A);
        printAge(B);
    }

    public static void printAge (Age A)
    {
        System.out.println("The age is "+A.getAge());
    }
}
