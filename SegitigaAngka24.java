import java.util.Scanner;

public class SegitigaAngka24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3) = ");
        int N= sc.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=N-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
