import java.util.Scanner;

public class Task8 {
    public boolean isAllDigits(String string){
        if (string.isEmpty()){
            return true;
        }
        if(Character.isDigit(string.charAt(0))){
                return isAllDigits(string.substring(1));
        }else{
            return false;
        }
    }
    public void Solution(){
        System.out.println("""
                You are given a string “s”, write the function for checking
                whether “s” is all consists of digits.
                Input:
                123456
                Output:
                Yes
                
                Input:
                123a12
                Output:
                No
                """);
        Task8 task8 = new Task8();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.next();
        if (task8.isAllDigits(s)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
