import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String s1;
        String s2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter first statement");
        s1=scanner.next();
        System.out.println("Please enter second statement");
        s2=scanner.next();
        System.out.println("Results:"+ s1.contains(s2));

    }
}