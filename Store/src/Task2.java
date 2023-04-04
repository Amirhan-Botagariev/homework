import java.util.Scanner;

public class Task2 {
    public double findAvg(int n, int[] arr){
        if (n == 1){
            return arr[0];
        }
        else{
            return (arr[n-1] + findAvg(n-1, arr) * (n-1)) / n;
        }
    }
    public void Solution(){
        System.out.println("""
                Problem 2
                You are given a number “n” and an array of “n” elements,
                write the function that returns average of them.
                Input:
                4
                3 2 4 1
                Output: 2.5
                """);
        Task2 task2 = new Task2();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the sequence of elements: ");
        for(int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        double avg = task2.findAvg(n, arr);
        System.out.println("The average is " + avg);
    }
}
