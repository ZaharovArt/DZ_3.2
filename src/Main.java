import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        System.out.println("Введте N");
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        System.out.println("Введите i");
        int i=scanner.nextInt();
        int mask =1;
        System.out.println(Integer.toBinaryString(n));
        mask = mask << i-1;
        n = n | mask;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));


        System.out.println(2<<(n-1));
        System.out.println(Integer.toBinaryString(2<<(n-1)));


        System.out.println(Integer.toBinaryString(n));



        System.out.println(Integer.toBinaryString(mask));
        mask=~mask;
        System.out.println(Integer.toBinaryString(mask));
        System.out.println(n&mask);
        System.out.println(Integer.toBinaryString(n&mask));


    }
}