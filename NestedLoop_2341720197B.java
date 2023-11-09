import java.util.Scanner;

public class NestedLoop_2341720197B {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double array[][]= new double[5][7];

        int kotake = 0;
        for(double[] kota: array){
            System.out.println("Kota ke-"+kotake);
            int harike = 0;
            for(double hari: kota){
                System.out.print("Hari ke-"+(harike+1)+": ");
                array[kotake][harike]= sc.nextDouble();
                harike++;
            }
            kotake++;
            System.out.println();
        }
        kotake = 0;
        for(double[] kota: array){
            System.out.print("Kota ke-"+(kotake+1)+": ");
            for(double suhu: kota){
                System.out.print(suhu+" ");
            }
            System.out.println();
            kotake++;
        }
    }
}
