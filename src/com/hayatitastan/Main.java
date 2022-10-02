package com.hayatitastan;

/**
 * Created by Dr. Hayati TAŞTAN on $DATE
 */
public class Main {
    public static void main(String[] args) {
        // strings manipulation
        String mesaj ="Bugün hava çok güzel";

        System.out.println(mesaj);
        System.out.println("Karakter Sayısı = " + mesaj.length());
        System.out.println("5. Karakter     = " + mesaj.charAt(4));

        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj); // mesaj değişkenin içi değişmez

        mesaj = mesaj.concat(" Yaşasın!"); // mesaj değişkenin içi değişir
        System.out.println(mesaj);

        System.out.println(mesaj.startsWith("B")); // sonuc true olacaktır. Çünkü mesaj B ile başlıyor
        System.out.println(mesaj.endsWith(".")); // sonuc false olacaktır. Çünkü mesaj ! ile bitiyor
        char[] karakterler = new char[5];

        mesaj.getChars(0,5,karakterler,0); //ilk 5 karaker, karakterler dizisi içine
        // başlangıçtan itibaren aktarılır
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); //ilk bulunan a nın kaçıncı karakter olduğu bulunur
        System.out.println(mesaj.indexOf("av")); //ilk bulunan av nin kaçıncı karakter olduğu bulunur
        System.out.println(mesaj.lastIndexOf('a')); //sondan geriye doğru a nin kaçıncı karakter olduğu bulunur

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);

        String parcaMesaj = mesaj.substring(2); //2 inci indeksten itibaren kes
        System.out.println(parcaMesaj);

        String kucukParcaMesaj = mesaj.substring(2,5); //2 inciden 5 inci indekse kadar kes
        System.out.println(kucukParcaMesaj);

        System.out.println("---- Kelime kelime yazdırma -----------------------");
        for(String kelime: mesaj.split(" ")){ //kelime kelime ayırıp yazdırma
            System.out.println(kelime);
        }

        System.out.println("---- Kücük harfe çevirme -----------------------"); //Veritabanı aramalarda kullanılır
        System.out.println(mesaj.toLowerCase());
        System.out.println("---- Büyük harfe çevirme -----------------------"); //Veritabanı aramalarda kullanılır
        System.out.println(mesaj.toUpperCase());


        mesaj ="  Bugün hava çok güzel.  ";
        System.out.println("---- Başta ve sonda boşluk var: -----------------------");
        System.out.println(mesaj);
        System.out.println("---- Baştaki ve sondaki boşluk traşlandı -----------------");
        System.out.println(mesaj.trim()); //Baştaki ve sondaki boşluklar silinir.






    }
}
