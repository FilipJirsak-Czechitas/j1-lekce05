package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;

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

        Osoba osoba1 = new Osoba();
        osoba1.setJmeno("Eva");
        osoba1.setPrijmeni("Černá");
        osoba1.setRodneCislo("985115/8900");
        osoba1.setPracovniEmail("eva.cerna@banka.cz");

        osoba1.setTrvalyPobyt(adresa1);

        Osoba osoba2 = new Osoba();
        osoba2.setJmeno("Tomáš");
        osoba2.setPrijmeni("Novák");
        osoba2.setSoukromyEmail("tomas@example.com");
        osoba2.setPracovniEmail("tomas@example.net");
        osoba2.setTrvalyPobyt(adresa1);


        System.out.println(osoba1);
        System.out.println(osoba2);
    }

}
