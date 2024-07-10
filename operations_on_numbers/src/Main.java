import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        while (true) {
            System.out.print("enter number a: ");
            int a = scanInt.nextInt();
            System.out.print("enter number b: ");
            int b = scanInt.nextInt();
            int ekub = a;
            while (true) {
                if (a % ekub == 0 && b % ekub == 0) {
                    break;
                }
                ekub--;
            }
            System.out.println("ekub --> " + ekub);
        }
    }
}