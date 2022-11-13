import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int turk,mat,fizik,tarih,ort;

        Scanner cvp = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = cvp.nextInt();
        System.out.print("Turkce Notunuz :");
        turk = cvp.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = cvp.nextInt();
        System.out.print("Tarih notunuz : ");
        tarih = cvp.nextInt();

        ort = (turk + mat + fizik + tarih )/4 ;

        System.out.println("Ortalamanız : " + ort );

        boolean kaldi = 60<ort;
        boolean gecti = 60>=ort;

        System.out.print("Sinifta kaldi" + kaldi);






    }



}
