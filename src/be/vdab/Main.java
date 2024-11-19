package be.vdab;

import be.vdab.util.isbn13Exception;
import be.vdab.voorwerpen.Boekenrek;
import be.vdab.voorwerpen.Leesboek;
import be.vdab.util.Voorwerp;
import be.vdab.voorwerpen.Woordenboek;

public class Main {
    public static void main(String[] args) {
        var voorwerpen = new Voorwerp[3];
        try {
            voorwerpen[0] = new Leesboek();
        } catch (isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[1] = new Leesboek("978-14-302-4764-7", "Studieboek Java 7", "Oracle", 20.4F,
                    "genre informatica", "onderw programmeren");
        } catch (isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[2] = new Woordenboek("978-90-664-8143-9", "Woordenboek Engels",
                    "Van Dale", 30.10F, "genre vertaal woordenboek", "taal Engels-Nederlands");
        } catch (isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        var totaleWinst = 0F;
        for (var eenVoorwerp : voorwerpen) {
            if (eenVoorwerp != null) {
                eenVoorwerp.gegevensTonen();
                System.out.println();
                totaleWinst += eenVoorwerp.winstBerekenen();
            }
            System.out.println("DE TOTALE WINST BEDRAAGT " + totaleWinst);
        }
    }
}
