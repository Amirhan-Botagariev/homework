import java.util.Scanner;

public class Task6 {
    public int powerOfA(int a, int n){
        if(n == 1){
            return a;
        }else{
            return a * powerOfA(a, n-1);
        }
    }
    public void Solution(){
        System.out.println("""
                Problem 6
                You are given numbers “a” and “n”, write the function that
                returns “a^n.
                Input:
                2 10
                Output:
                1024
                """);
        Task6 task6 = new Task6();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println(a + " to the power of " + n + " is " + task6.powerOfA(a, n));
    }
}
