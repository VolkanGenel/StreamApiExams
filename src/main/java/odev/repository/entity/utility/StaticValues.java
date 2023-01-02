package odev.repository.entity.utility;

import odev.repository.entity.Departman;
import odev.repository.entity.Personel;

import java.util.*;

public class StaticValues {
    public static Long id = 0L;
    public static Long departmanid = 0L;
    public static List<Personel> personelListesi = new ArrayList<>();
    public static List<Departman> departmanListesi = new ArrayList<Departman>();

    public static Map<Departman, List<Personel>> gruplanmisListem = new TreeMap<>();
    public static long idOlustur() {
        id++;
        return id;
    }
    public static long departmanidOlustur() {
        departmanid++;
        return departmanid;
    }
}
