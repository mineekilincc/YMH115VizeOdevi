import java.util.Scanner;

public class DiziElemanlari {
    public static void main (String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Dizinin uzunluğunu girin:");
        
        int n =scan.nextInt();
        int[] dizi= new int[n];
        System.out.println("Dizinin elemanlarını giriniz:");

        for (int i=0; i<n;i++){
            dizi[i]=scan.nextInt();
        }

        System.out.println("Aranacak sayıyı girin:");
        int sayi=scan.nextInt();

        boolean bulunmaDurumu=false;
        int konum= -1;

        for(int i=0;i<n;i++){
            if (dizi[i]==sayi){
                bulunmaDurumu= true;
                konum=i+1;
                break;
            }
        }
        if(bulunmaDurumu){
            System.out.println(sayi+ " sayısı dizinin "+ konum + " . elemanıdır.");
        }else{
            System.out.println(sayi+" sayısı dizide bulunmamaktadır");
        }
        scan.close();
    }
}
