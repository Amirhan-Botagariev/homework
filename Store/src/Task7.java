import java.util.Scanner;

public class Task7 {

    public int reverseNumbers(int n, int[] arr){
        if (n == 0){
            return arr[0];
        }else{
            System.out.print(arr[n-1] + " ");
            return reverseNumbers(n-1, arr);
        }
    }
    public void Solution(){
        System.out.println("""
                You are given a number “n” and an array of “n” elements,
                write the program that returns given array in reverse order
                without using array data structure.
                (Hint: recursion)
                Input:
                4
                1 4 6 2
                Output:
                2 6 4 1
                """);
        Task7 task7 = new Task7();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the sequence: ");
        for(int i = 0; i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Reversed sequence is: ");
        task7.reverseNumbers(n, arr);
        System.out.println();
    }
}
