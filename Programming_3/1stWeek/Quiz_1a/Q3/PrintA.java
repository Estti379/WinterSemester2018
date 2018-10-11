public class PrintA implements Runnable
{
  PrintA(){
  //empty
  }

  public void run(){
    while(true){
      System.out.println("A");
    }
  }
}
