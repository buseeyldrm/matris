import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye=new Scanner(System.in);
        System.out.print("Satır sayısı: ");
        int satir= klavye.nextInt();
        System.out.print("Sütun sayısı: ");
        int sutun= klavye.nextInt();


        int [][] matris=new int[satir][sutun];
        int [][] transpozu=new int[sutun][satir];

        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j <sutun ; j++) {
                System.out.print((i+1)+".satırın " +(j+1)+".elemanını giriniz: ");
                matris[i][j]= klavye.nextInt();
            }

        }
        //transpozu:

        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j <sutun ; j++) {
                transpozu[j][i]=matris[i][j];

            }

        }
        System.out.println("Matris: ");
        for (int[] n:matris){
            for (int k:n){
                System.out.print(k+ " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
        System.out.println("Tranpozu: ");

        for (int[] b:transpozu){
            for (int a:b){
                System.out.print(a+ " ");
            }
            System.out.println();
        }

    }
}