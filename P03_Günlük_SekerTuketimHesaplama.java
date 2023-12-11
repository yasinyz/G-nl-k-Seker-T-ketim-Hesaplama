package day01_practice;

import java.util.Scanner;

public class P03_Günlük_SekerTuketimHesaplama {
    public static void main(String[] args) {
        /*
     Kullaniciya
     * 1 = Gunde kac bardak cay ictigini,
     * 2 = Her bardak icin kac kup seker kullandigini sorup;
     kullanicinin yillik ve 40 yillik seker tuketimini kg bazinda consolda yazdiran bir program yazin.
     * Kullanici eger seker kullanmiyorsa "Aferin, boyle devam et :)" ciktisini gorsun.
      (1 kup seker = 2.77 gr)
*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("gunde kac bardak cay iciyorsunuz");
        double bardak = scanner.nextDouble();

        System.out.println("her bardak icin kac seker kullaniyorsunuz");
        double seker = scanner.nextDouble();

        double yilliksekertuketimi = (bardak*seker*2.77)*365/1000;
        double kirkyilliksekertuketimi = yilliksekertuketimi*40;

        if (seker==0){
            System.out.println("Aferin boyle devam et");

        }else {
            System.out.println("yillik seker tuketiminiz:"+yilliksekertuketimi+ "kirkyillik seker tuketim:"+kirkyilliksekertuketimi);
        }
    }
}
