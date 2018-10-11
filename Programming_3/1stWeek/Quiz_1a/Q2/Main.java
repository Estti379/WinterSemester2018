public class Main
{

    public static void main (String[] args)
    {
        Hello H = new Hello() {
          @Override
          public void greet (String name){
            System.out.println("Hi " + name + "!");
          }
        };
        H.greet("Alice");
        H.greet("Bob");
        H.greet("Carol");
    }
}
