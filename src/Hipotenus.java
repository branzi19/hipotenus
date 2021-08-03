import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kısa kenarı giriniz:");
        a = inp.nextInt();

        System.out.print("Uzun kenarı giriniz:");
        b = inp.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.print("Hipotenüs:"+ c);

    }

}
