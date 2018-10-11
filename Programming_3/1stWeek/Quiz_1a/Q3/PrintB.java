public class PrintB implements Runnable
{
  PrintB(){
  //empty
  }

  public void run(){
    while(true){
      System.out.println("B");
    }
  }
}
