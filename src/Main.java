import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,min=0,maks=0,sayi;

        System.out.println("Kac tane sayi giriceksiniz ? ");
        Scanner oku= new Scanner(System.in);
        n=oku.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("sayi giriniz? ");
            sayi= oku.nextInt();

            if(sayi<n) {
                min = sayi;
            } else if (sayi>n) {
                maks=sayi;

            }

        }

        System.out.println("maks = "+maks);
        System.out.println("min ="+min);
    }
}