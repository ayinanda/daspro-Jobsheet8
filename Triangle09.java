import java.util.Scanner;

public class Triangle09 {
    public static void main(String[] args) {
        Scanner sc09 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = sc09.nextInt();
        int i = 2;
    
        while ( (i <= N)) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            } System.out.println();  
            i++;
        }  
    } 
}
