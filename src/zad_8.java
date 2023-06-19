import java.util.Scanner;

public class zad_8 {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N");
        int n =scanner.nextInt();
        System.out.println(Integer.toBinaryString(n));

        int t =1;
        if (n>=t <<16) t<<=16;
        if (n>=t <<8) t<<=8;
        if (n>=t <<4) t<<=4;
        if (n>=t <<2) t<<=2;
        if (n>=t <<1) t<<=1;
        t=~t;
        System.out.println(Integer.toBinaryString(n&t));

    }
}
