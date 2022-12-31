package odev.repository.entity;

import java.util.Arrays;

public class Mudur extends Personel {
    public int maasekodeme;
    String [] gorevalanlari;
    String [] baglipersoneller;

    public Mudur(String ad, String soyisim, String unvan, double maas, String telefon, String aciltelefon, String tckimlik, Departman departman, int maasekodeme, String[] gorevalanlari, String[] baglipersoneller) {
        super(ad, soyisim, unvan, maas, telefon, aciltelefon, tckimlik, departman);
        this.maasekodeme = maasekodeme;
        this.gorevalanlari = gorevalanlari;
        this.baglipersoneller = baglipersoneller;
    }

    @Override
    public String toString() {
        return "Mudur{" +
                "maasekodeme=" + maasekodeme +
                ", gorevalanlari=" + Arrays.toString(gorevalanlari) +
                ", baglipersoneller=" + Arrays.toString(baglipersoneller) +
                '}';
    }

    public int getMaasekodeme() {
        return maasekodeme;
    }

    public void setMaasekodeme(int maasekodeme) {
        this.maasekodeme = maasekodeme;
    }

    public String[] getGorevalanlari() {
        return gorevalanlari;
    }

    public void setGorevalanlari(String[] gorevalanlari) {
        this.gorevalanlari = gorevalanlari;
    }

    public String[] getBaglipersoneller() {
        return baglipersoneller;
    }

    public void setBaglipersoneller(String[] baglipersoneller) {
        this.baglipersoneller = baglipersoneller;
    }
}
