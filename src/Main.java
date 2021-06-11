import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double tutar=0,kdv=0,kdvtutar=0,kdvlitutar=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz: ");
        tutar=input.nextDouble();
        if(tutar>1000)
        {
            kdv=0.08;
            kdvtutar=tutar*kdv;
            kdvlitutar=tutar+kdvtutar;
        }
        else if(tutar<=1000)
        {
            kdv=0.18;
            kdvtutar=tutar*kdv;
            kdvlitutar=tutar+kdvtutar;
        }
        else
        {
            System.out.println("Hatalı Giriş!");
        }
        System.out.println("KDV\'SİZ FİYAT= "+tutar);
        System.out.println("KDV\'Lİ FİYAT= "+kdvlitutar);
        System.out.println("KDV TUTARI= "+kdvtutar);
    }
}
