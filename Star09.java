import java.util.Scanner;

public class Star09 {

    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc09.nextInt();

        for (int i=1; i<=N; i++); {
            System.out.print("*");
        }
    }
}