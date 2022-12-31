package com.volkan.ornekler;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ornek1 {
    public static void main(String[] args) {
        List<String> liste = List.of("Ocak","Şubat","Mart","Nisan",
                "Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık");

        /**
         * İçinde a harfi geçmeye ayların listesini yazdıran komut
         * true -> değillemek gerekir -> false
         */
        liste.stream().filter(x->!x.toLowerCase().contains("a")).forEach(System.out::println);
        /**
         *
         */
        liste = List.of("Ahmet","Ali","Canan","Tekin","Ülkü",
                "Hayri","Deniz","Eren","Kaan","Canan","Deniz","Ali");
        liste.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(g-> System.out.println(g+"-"));

        /**
         * İçerisinde a harfi içeren isimleri, K(Integer,V (List<String>) olacak şekilde Map yapan kod
         */
        liste = List.of("Ahmet","Ali","Muhammet","Canan","Tekin","Ülkü",
                "Hayri","Deniz","Eren","Kaan","Canan","Deniz","Ali");
       Map<Integer,List<String>> newList = liste.stream()
                .filter(x-> x.toLowerCase().contains("a"))
                .collect(Collectors.groupingBy(String::length));
        System.out.println(newList);
    }
}
