import java.util.Scanner;

public class Task4 {
    public int findFactorial(int n){
        if (n == 0 || n == 1){
            return 1;
        }else{
            return n * findFactorial(n-1);
        }
    }
    public void Solution(){
        System.out.println("""
                Problem 4
                You are given a number “n”, write the program using recursion for
                finding “n!”
                Input:
                5
                Output:
                120
                """);
        Task4 task4 = new Task4();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        System.out.println("The factorial of " + n + " is " +task4.findFactorial(n));
    }
}
