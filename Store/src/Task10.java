import java.util.Scanner;

public class Task10 {
    public int findGCD(int a, int b){
        if (a % b == 0){
            return b;
        }else{
            int remainder = a % b;
            return findGCD(b, remainder);
        }
    }
    public void Solution(){
        System.out.println("""
                You are given “a” and “b”, write the function for finding
                GCD(a, b) using recursion. (Hint: Euclidean Algorithm)
                Input:
                32 48
                Output:
                16
                
                Input:
                10 7
                Output:
                1
                """);
        Task10 task10 = new Task10();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("GCD is " + task10.findGCD(a, b));
    }
}
