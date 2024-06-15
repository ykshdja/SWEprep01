import java.util.Scanner;

public class reversedStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        String revString = "";
        for (int i=userInput.length()-1;i>=0;i--)
        {
           revString+=userInput.charAt(i);
        }
        System.out.println(revString);
        scanner.close();
    }
}
