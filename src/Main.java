import java.util.Scanner;
//Kullanıcıdan veri alabilmek içi projemize Scanner sınıfını dahil ettik.


public class Main {
    public static void main(String[] args) {

        //İşlemlerde Kullanacağımız 3 tane int değeri tanımladık ve ayrıca işlem için de bir adet islem adında değişken tanımladık
        int islem, a,b,c;

        Scanner input = new Scanner(System.in);


        //Kullanıcıdan verileri almak için mesaj ve input kodlarımızı yazdık
        System.out.print("1. Değer Giriniz: ");
        a = input.nextInt();


        System.out.print("2. Değeri Giriniz ");
        b = input.nextInt();


        System.out.print("3. Değeri Giriniz: ");
        c = input.nextInt();


        //Kullanıcıdan aldığımız verileri onceden tanımlamış olduğumuz islem değişkeninde istenilen matematiksel işlemlere rabi tuttuktan sonra sonucu ekrana yzdırdık.
        islem = a+(b*c)-b;
        System.out.println(islem);
    }
}