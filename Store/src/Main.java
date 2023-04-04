import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean t = true;
        while (t) {
            System.out.println("What task you want to check 1-10?, press 0 to quit");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            switch (n) {
                case 0:
                    t = false;
                    break;
                case 1:
                    Task1 task1 = new Task1();
                    task1.Solution();
                    break;
                case 2:
                    Task2 task2 = new Task2();
                    task2.Solution();
                    break;
                case 3:
                    Task3 task3 = new Task3();
                    task3.Solution();
                    break;
                case 4:
                    Task4 task4 = new Task4();
                    task4.Solution();
                    break;
                case 5:
                    Task5 task5 = new Task5();
                    task5.Solution();
                    break;
                case 6:
                    Task6 task6 = new Task6();
                    task6.Solution();
                    break;
                case 7:
                    Task7 task7 = new Task7();
                    task7.Solution();
                    break;
                case 8:
                    Task8 task8 = new Task8();
                    task8.Solution();
                    break;
                case 9:
                    Task9 task9 = new Task9();
                    task9.Solution();
                    break;
                case 10:
                    Task10 task10 = new Task10();
                    task10.Solution();
                    break;
                default:
                    System.out.println("Enter appropriate number in range 0-10");
                    break;
            }
        }
    }
}
