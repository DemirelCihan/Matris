import java.util.Scanner;

public class matrix_operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("matris satır sayısı?");
        int satir = scan.nextInt();

        System.out.println("matris sütun sayısı?");
        int sutun = scan.nextInt();

        int [][] matris1 = new int [satir][sutun];
        int [][] matris2 = new int [satir][sutun];
        int [][] toplam_matrisi = new int [satir][sutun];

        for (int i=0; i<satir; i++){
            for (int j =0; j< sutun; j++){
                System.out.println("ilk matris için ["+i+"] ve ["+ j +"] değerlerini gir");
                matris1[i][j] =(int)(Math.random()*10)+1;

                System.out.println("ikinci matris için ["+i+"] ve ["+ j +"] değerlerini gir");
                matris2[i][j] =(int)(Math.random()*10)+1;

                toplam_matrisi[i][j] = matris1[i][j]+matris2[i][j];

            }
        }

        System.out.println("birinci matris");
        for (int i=0; i<satir; i++){
            for (int j=0; j<sutun; j++){
                System.out.println(matris1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ikinci matris");
        for (int i=0; i<satir; i++){
            for (int j=0; j<sutun; j++){
                System.out.println(matris2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("matrislerin toplam sonucu");
        for (int i=0; i<satir; i++){
            for (int j=0; j<sutun; j++){
                System.out.println(toplam_matrisi[i][j] );
            }
        }
        System.out.println();
    }
}
