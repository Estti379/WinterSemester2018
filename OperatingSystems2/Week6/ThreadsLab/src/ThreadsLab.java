import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThreadsLab {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputCommand;
        int inputID, inputValue;
        Boolean done = false;
        char c;

        while(!done) {
            System.out.println("Waiting for input!");
            inputCommand = reader.re();

            System.out.print("You typed: " + inputCommand );
            switch (inputCommand){
                case "start":
                    break;
                case "stop":
                    break;
                case "setMax":
                    break;
                case "setValue":
                    break;
                case "quit":
                    System.out.println("1: " + scanner.hasNext());
                    if( scanner.hasNext() ){
                        System.out.println("\nToo many arguments for command \"quit\"!\n");
                    } else {
                        done = true;
                    }
                    break;
                default:
                    System.out.println("\nInvalid command!\n");
                    break;
            }

            System.out.println("2: " + scanner.hasNext());
            inputCommand = scanner.nextLine();
//            while( inputCommand.equals("\n") ) {
//                inputCommand = scanner.nextLine();
//            }
            System.out.println("3: " + scanner.hasNext());

        }

        scanner.close();
    }
}
