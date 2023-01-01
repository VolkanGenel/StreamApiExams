package odev.service;

import odev.repository.IslemRepository;
import odev.repository.entity.Departman;
import odev.repository.entity.Personel;

import java.util.List;
import java.util.Map;

public class IslemService {
    IslemRepository islemRepository = new IslemRepository();
    public void personelMaasiDuzenle(List<Double> maasListesi) {
    islemRepository.personelMaasiDuzenle(maasListesi);
    }

    public List<Double> odemeListesi() {
    return islemRepository.odemeListesi();
    }

    public Map<Departman,List<Personel>> departmanPersonelListesi() {
    return islemRepository.departmanPersonelListesi();
    }
}
