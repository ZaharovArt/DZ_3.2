import java.util.Scanner;

public class zad_9 {
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите M");
        int m = scanner.nextInt();
        System.out.println("Введите N");
        int n =scanner.nextInt();
        m=m>>2;
        System.out.println(Integer.toBinaryString(m));

    }
}
