import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String[] tenmonan= new String[3];
        for (int i= 0;i<3; i++){
            System.out.println("Nhap ten 3 mon an" + i);
            tenmonan[i]= input.next();
        }
        for (int i= 0;i<3; i++){
            System.out.println(tenmonan[i]);
        }
    }

}


