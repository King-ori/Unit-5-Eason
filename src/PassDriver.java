import java.util.Scanner;
    public class PassDriver {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int keyGuess;
            System.out.println("Enter key: ");
            keyGuess = scan.nextInt();
            Pass key = new Pass( keyGuess);
            System.out.println(key);

        }
    }
