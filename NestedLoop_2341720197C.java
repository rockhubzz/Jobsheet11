import java.util.Scanner;

public class NestedLoop_2341720197C {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double array[][]= new double[5][7];
        double jumlah[]= new double [5];
        double rata[]= new double[5];

        int kotake = 0;
        for(double[] kota: array){
            System.out.println("Kota ke-"+(kotake+1));
            int harike = 0;
            for(double hari: kota){
                System.out.print("Hari ke-"+(harike+1)+": ");
                array[kotake][harike]= sc.nextDouble();
                jumlah[kotake]+= array[kotake][harike];
                harike++;
            }
            kotake++;
            System.out.println();
        }
        for(int i=0; i<array.length; i++){
            rata[i]= jumlah[i] / array[i].length;
        }
        kotake = 0;
        for(double[] kota: array){
            System.out.print("Kota ke-"+(kotake+1)+": ");
            for(double suhu: kota){
                System.out.print(suhu+" ");
            }
            System.out.println("\nRata-rata suhu kota ke-"+(kotake+1)+": "+rata[kotake]);
            System.out.println();
            kotake++;
        }
    }
}
