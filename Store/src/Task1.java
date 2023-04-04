import java.util.Scanner;

public class Task1 {

    public int findMin(int n, int[] arr){
        if(n == 1){
            return arr[0];
        }
        else{
            int min = findMin(n-1, arr);
            return Math.min(min, arr[n-1]);
        }
    }
    public void Solution(){
        System.out.println("""
                Problem 1
                You are given a number “n” and an array of “n” elements,
                write the function that returns minimum of them.\s
                Input:
                5
                10 1 32 3 45
                Output: 1
                """);
        Task1 task1 = new Task1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter sequence of elements: ");
        for(int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int min = task1.findMin(n, arr);
        System.out.println("The minimum is " + min);
    }
}
