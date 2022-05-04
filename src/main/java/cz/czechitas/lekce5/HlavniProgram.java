package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        Adresa adresa1 = new Adresa();
        adresa1.setUliceACisla("Sokolovská 123");
        adresa1.setObec("Praha");
        adresa1.setPsc(11000);

        Osoba osoba1 = new Osoba("Eva", "Černá", "985115/8900");
        osoba1.setPracovniEmail("eva.cerna@banka.cz");

        osoba1.setTrvalyPobyt(adresa1);

        Telefon telefon = new Telefon();
        telefon.setTelefonniCislo("800123456");
        osoba1.setTelefon(telefon);

        adresa1.setUliceACisla("Rovná 43");
        adresa1.setObec("Brno");
        adresa1.setPsc(30000);

        Osoba osoba2 = new Osoba("Tomáš", "Novák", "990110/0000");
        osoba2.setSoukromyEmail("tomas@example.com");
        osoba2.setPracovniEmail("tomas@example.net");
        osoba2.setTrvalyPobyt(adresa1);
        osoba2.setDorucovaciAdresa(new Adresa("Dlouhá 1", "Ostrava", 40000));

        System.out.println(osoba1);
        System.out.println(osoba1.getTrvalyPobyt());
        System.out.println();
        System.out.println(osoba2);
        System.out.println(osoba2.getTrvalyPobyt());
        System.out.println(osoba2.getDorucovaciAdresa());
    }

}
