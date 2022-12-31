package odev.controller;

import odev.repository.ICrud;
import odev.repository.entity.Hizmetli;
import odev.repository.entity.Personel;
import odev.service.PersonelService;
import java.util.List;
import java.util.Scanner;

public class PersonelController {
    Scanner sc;
    PersonelService personelService;
    Personel personel;
    public PersonelController() {
       this.sc = new Scanner(System.in);
       this.personelService = new PersonelService();
    }

    public void save() {
        int secenek = 0;
        do {
            System.out.println("***** Personel İşlemleri *****");
            System.out.println("0- Ana Menüye Dön");
            System.out.println("1- Büro Personeli Ekleme");
            System.out.println("2- Genel Müdür Ekleme");
            System.out.println("3- Hizmetli Ekleme");
            System.out.println("4- İnsan Kaynakaları Ekleme");
            System.out.println("5- Müdür Ekleme");
            System.out.println("6- Muhasebe Personeli Ekleme");
            System.out.println("7- Teknik Personel Ekleme");
            System.out.println("Lütfen Yapmak İstediğiniz İşlemi Seçiniz");
            secenek = sc.nextInt();
            switch (secenek) {
              //  case 0: System.out.println("Ana Menüye Dönülüyor");break;
                //  case 1: personelController.save();break;
                //   case 2: personelController.findAll();break;
                //   case 3: personelController.update(); break;
                //    case 4: personelController.deleteById();
                //   case 5: personelController.findById();
                //   case 6: departmanController.save(); break;
                //   case 7: departmanController.findAll(); break;
                default: System.out.println("Hatalı Giriş Yaptınız"); break;
            }
        } while (secenek!=0);

    }

    public void update() {

    }
    public List<Personel> findAll() {
        return null;
    }
    public Personel findById() {
        return null;
    }
    public void deleteById() {
    }
    public void personelBilgileeri () {
        //Personel personel = new Hizmetli();
        System.out.println("Lütfen Personel Adı Giriniz...:");
        String ad=sc.nextLine();
        System.out.println();
    }
}
