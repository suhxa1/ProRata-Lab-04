import java.util.Scanner;

public class IT22091598Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String result = (num > 0) ? "The number is: Positive" : 
                        (num < 0) ? "The number is: Negative" : "The number is: Zero";
        
        System.out.println(result);
        scanner.close();
    }
}