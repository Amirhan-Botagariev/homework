import java.util.Scanner;

public class Task9 {
    public int findBinomialCoefficient(int n, int k){
        if (k == 0 || n == k){
            return 1;
        }else{
            return findBinomialCoefficient(n-1, k-1) + findBinomialCoefficient(n-1, k);
        }
    }
    public void Solution(){
        System.out.println("""
                Problem 9
                You are given numbers“n” and “k”,write the program that
                finds Ck_n (binomial coefficient) using formula Ck_n = Ck-1_n-1 + Ck_n-1 where C0_n = Cn_n = 1
                Input:
                2 1
                Output:
                2
                
                Input:
                7 3
                Output:
                35
                """);
        Task9 task9 = new Task9();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.print("Enter k: ");
        int k = scanner.nextInt();
        System.out.println("The answer is " + task9.findBinomialCoefficient(n, k));
    }

}
