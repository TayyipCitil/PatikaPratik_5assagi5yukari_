import java.util.Scanner;

public class BesAssagiBesYukari {
    //rekürsif fonksiyon ile yap
        /*Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
         Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
         Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
         Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
         n=16
         16 11 6 1 -4 1 6 11 16
         */
    static void desen(int num, int sayac, boolean isAzal) {
        if (num > 0 && isAzal) {
            System.out.print(num + "\t"); // 16 11 6 1 sayac=4
            num -= 5;
            sayac++;
            desen(num, sayac, isAzal);
        } else {
            isAzal = false;
            System.out.print(num+"\t"); //sayac=4 -4 1 6 11 16
            num += 5;
            sayac--;
            if (sayac != 0) {
                desen(num, sayac, isAzal);
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int num = input.nextInt();
        boolean isAzal = true; //artmaya başlamayı brlirtir
        int sayac = 1; // kaç kez artacağını belirtir
        desen(num, sayac, isAzal);
    }
}
