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

    public PersonelController() {
       this.sc = new Scanner(System.in);
       this.personelService = new PersonelService();
    }

    public void save() {
       /**
        switch () {
            case 1: break;
            case 2: break;
        }
        //Personel personel = new Hizmetli();
        System.out.println("Lütfen Personel Adı Giriniz...:");
        String ad=sc.nextLine();

    personelService.save();
        */
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
}
