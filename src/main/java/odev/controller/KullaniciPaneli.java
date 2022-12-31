package odev.controller;

import java.util.Scanner;

public class KullaniciPaneli {
    PersonelController personelController;
    DepartmanController departmanController;
    Scanner sc;

    public KullaniciPaneli() {
        personelController = new PersonelController();
        departmanController = new DepartmanController();
        int secim=0;
    }
    public void run() {
        int secim = 0;
       do {
           System.out.println("***** Kontrol Paneli *****");
           System.out.println("1- Personel İşlemleri");
           System.out.println("2- Muhasebe İşlemleri");
           System.out.println("3- Raporlama İşlemleri");
           System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
           secim = sc.nextInt();
           switch (secim) {
               case 0: System.out.println("başarılı Bir Şekilde Çıkış Yapıldı");break;
               case 1: personelIslemleri();break;
               case 2: muhasebeIslemleri();break;
               case 3: raporlamalar(); break;
               default: System.out.println("Hatalı Giriş Yaptınız"); break;
           }
       } while (secim!=0);
    }

    public void personelIslemleri () {
        int islem = 0;
        do {
            System.out.println("***** Personel İşlemleri *****");
            System.out.println("0- Çıkış");
            System.out.println("1- Personel Ekleme");
            System.out.println("2- Personel Listesi");
            System.out.println("3- Personel Güncelleme");
            System.out.println("4- Personel Silme");
            System.out.println("5- Personel Bulma");
            System.out.println("6- Departman Ekleme");
            System.out.println("7- Departman Listesi");
            System.out.println("9- Ana Menüye Dön");
            System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
            islem = sc.nextInt();
            switch (islem) {
                case 0:
                    int secim = 0;
                    System.out.println("Başarılı Bir Şekilde Çıkış Yapıldı");break;
                case 1: personelController.save();break;
                case 2: personelController.findAll();break;
                case 3: personelController.update(); break;
                case 4: personelController.deleteById();
                case 5: personelController.findById();
                case 6: departmanController.save(); break;
                case 7: departmanController.findAll(); break;
                case 9: System.out.println("Ana Menüye Dönülüyor");break;
                default: System.out.println("Hatalı Giriş Yaptınız"); break;
            }
        } while (islem!=0);
    }
    public void muhasebeIslemleri () {
        int islem = 0;
        do {
            System.out.println("***** Kontrol Paneli *****");
            System.out.println("1- Personel İşlemleri");
            System.out.println("2- Muhasebe İşlemleri");
            System.out.println("3- Raporlama İşlemleri");
            System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
            islem = sc.nextInt();
            switch (islem) {
                case 0: System.out.println("Başarılı Bir Şekilde Çıkış Yapıldı");break;
                case 1: personelIslemleri();break;
                case 2: muhasebeIslemleri();break;
                case 3: raporlamalar(); break;
                default: System.out.println("Hatalı Giriş Yaptınız"); break;
            }
        } while (islem!=0);
    }
    public void raporlamalar () {
        int islem = 0;
        do {
            System.out.println("***** Kontrol Paneli *****");
            System.out.println("1- Personel İşlemleri");
            System.out.println("2- Muhasebe İşlemleri");
            System.out.println("3- Raporlama İşlemleri");
            System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
            islem = sc.nextInt();
            switch (islem) {
                case 0: System.out.println("başarılı Bir Şekilde Çıkış Yapıldı");break;
                case 1: personelIslemleri();break;
                case 2: muhasebeIslemleri();break;
                case 3: raporlamalar(); break;
                default: System.out.println("Hatalı Giriş Yaptınız"); break;
            }
        } while (islem!=0);
    }


}
