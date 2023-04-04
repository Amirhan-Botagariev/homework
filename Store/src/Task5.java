import java.util.Scanner;

public class Task5 {
    public int findFibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }else{
            return findFibonacci(n-1) + findFibonacci(n-2);
        }
    }
    public void Solution(){
        System.out.println("""
                Problem 5
                You are given a number “n”, write the function for finding n-th
                elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).
                F0= 0, F1 = 1.
                Input:
                5
                Output:
                5
                
                Input:
                17
                Output:
                1597
                """);
        Task5 task5 = new Task5();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        System.out.println("The " + n + "th element in Fibonacci sequence is " + task5.findFibonacci(n));
    }
}
