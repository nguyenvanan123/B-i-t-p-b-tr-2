import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[10];
        nhap_mang(arrayNumber);
        in_mang(arrayNumber);
    }

    public static void nhap_mang(int[] arr){
        Scanner input = new Scanner(System.in);
        for ( int i = 0; i < 10; i++){
            System.out.println("Nhap phan tu" +i);
            arr[i] = input.nextInt();
        }

    }

    public static void in_mang(int[] arr){
        for( int i= 0; i < 10 ; i++){
            System.out.println("day la phan tu thu " + i + "co gia tri la  " + arr[i]);

        }
    }
}
