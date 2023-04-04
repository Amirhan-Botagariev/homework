import java.util.Scanner;

public class Task3 {
    public boolean isPrime(int n){
        return isPrimeChecker(n, 2);
    }
    public boolean isPrimeChecker(int n, int divisor){
        if (n <= 2){
            return n == 2;
        }
        if (divisor * divisor > n){
            return true;
        }
        if (n % divisor == 0){
            return false;
        }
        return isPrimeChecker(n, divisor + 1);
    }
    public void Solution(){
        System.out.println("""
                Problem 3
                You are given a number “n”, write the function for checking
                whether“n” is prime.
                Input: 
                7
                Output:
                Prime
                
                Input:
                10
                Output:
                Composite
                """);
        Task3 task3 = new Task3();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        if(task3.isPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Composite");
        }
    }
}
