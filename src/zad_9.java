import java.util.Scanner;

public class zad_9 {
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите M");
        int m = scanner.nextInt();
        System.out.println("Введите N");
        int n =scanner.nextInt();
        if ((m>>31&1) == (n>>31&1)) {System.out.println("Числа имееют одинаковый знак");}
        else System.out.println("Числа имееют разные знаки ");

    }
}
