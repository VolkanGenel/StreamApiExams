package odev.repository;

import odev.repository.entity.Departman;
import odev.repository.entity.Personel;
import odev.repository.entity.utility.StaticValues;

import java.util.*;
import java.util.stream.Collectors;

public class IslemRepository {

    public void personelMaasiDuzenle(List<Double> maasListesi) {
        for (int i =0; i<StaticValues.personelListesi.size();i++) {
            StaticValues.personelListesi.get(i).setMaas(maasListesi.get(i));
        }
    }

    public ArrayList<Double> odemeListesi() {
        ArrayList<Double> odemeListesi = new ArrayList<>();
        for (int i =0; i<StaticValues.personelListesi.size();i++) {
           odemeListesi.add(StaticValues.personelListesi.get(i).getMaas());
        }
        return odemeListesi;
    }

    public Map<Departman,List<Personel>> departmanPersonelListesi() {
        Map<Departman,List<Personel>> departmanListMap = StaticValues.personelListesi.stream().collect(Collectors.groupingBy(Personel::getDepartman));
        return departmanListMap;
    }

    public void enCokPersonelBulunanDepartman () {

    }
    public Set<String> mudurSorumluluk () {
        Set <String> mudurSorumlulukAlani = new TreeSet<>();

        return null;
    }
    public Map<Long,List<Personel>> kayitTarihineGoreSirala() {
        Map<Long,List<Personel>> kayitTarihiListMap = StaticValues.personelListesi.stream().collect(Collectors.groupingBy(Personel::getCreateDate));
        return kayitTarihiListMap;
    }
}
