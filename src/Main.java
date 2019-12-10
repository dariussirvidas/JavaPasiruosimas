import com.darbininkasItem.DarbininkasItemImpl;
import com.suvestineItem.SuvestineItemImpl;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<DarbininkasItemImpl> darbininkai = new ArrayList<>();
        ArrayList<SuvestineItemImpl> suvestine = new ArrayList<>();

        darbininkai.add(new DarbininkasItemImpl("Jonas Jonaitis", "LED", 500, 0.12));
        darbininkai.add(new DarbininkasItemImpl("Jonas Petraitis", "LED", 600, 0.12));
        darbininkai.add(new DarbininkasItemImpl("Petras Petraitis", "Relė", 100, 0.59));
        darbininkai.add(new DarbininkasItemImpl("Petras Jonaitis", "Relė", 120, 0.59));
        darbininkai.add(new DarbininkasItemImpl("Zigmas Petraitis", "Soc", 100, 59.99));
        darbininkai.add(new DarbininkasItemImpl("Zigmas Antanaitis", "Soc", 103, 59.99));
        darbininkai.add(new DarbininkasItemImpl("Antanas Petraitis", "Ekranas", 102, 59.99));
        darbininkai.add(new DarbininkasItemImpl("Petras Antanaitis", "Ekranas", 101, 59.99));
        darbininkai.add(new DarbininkasItemImpl("Petras Antanaitis", "LED Ekranas", 110, 109.99));
        darbininkai.add(new DarbininkasItemImpl("Petras Antanaitis", "Kondensatorius", 1500, 59.99));

        System.out.println("1 uzduotis:"); //////////////////////////////////////////////////////////////////
        line(147);
        System.out.println(String.format("|%50s|%50s|%20s|%22s|", "Darbininkas", "Detalė", "Kiekis", "Kaina (Eur)"));
        line(147);
        for (DarbininkasItemImpl darbininkas : darbininkai) {
            System.out.println(darbininkas);
        }
        line(147);

        System.out.println("2 uzduotis"); /////////////////////////////////////////////////////////////////////
        HashSet<String> detales = new HashSet<>();
        for (DarbininkasItemImpl darbininkas : darbininkai) {
            detales.add(darbininkas.getDetale());
        }
        for (String detale : detales) {
            int kiekis = 0;
            double suma = 0;
            for (DarbininkasItemImpl darbininkas : darbininkai) {
                if (detale.equals(darbininkas.getDetale())) {
                    kiekis += darbininkas.getDetalesKiekis();
                    suma += darbininkas.getDetalesKiekis() * darbininkas.getDetalesKaina();
                }
            }
            if (kiekis > 0) suvestine.add(new SuvestineItemImpl(detale, kiekis, suma));
        }
        printSuvestine(suvestine);

        System.out.println("3 uzduotis"); ////////////////////////////////////////////////////////////////////
        Collections.sort(suvestine);
        printSuvestine(suvestine);

        System.out.println("4 uzduotis"); /////////////////////////////////////////////////////////////////////
        printSuvestineNorma(suvestine);

        System.out.println("5 uzduotis"); /////////////////////////////////////////////////////////////////////
        ListIterator<SuvestineItemImpl> suvestinesIteratorius = suvestine.listIterator();
        while (suvestinesIteratorius.hasNext()) {
            SuvestineItemImpl irasas = suvestinesIteratorius.next();
            for (DarbininkasItemImpl darbininkas : darbininkai) {
                if (irasas.getDetale().equals(darbininkas.getDetale()) && darbininkas.getDetalesKaina() > 100) {
                    suvestinesIteratorius.remove();
                }
            }
        }
        printSuvestineNorma(suvestine);
    }

    private static void line(int length) {
        char[] line = new char[length];
        Arrays.fill(line, '-');
        System.out.println(line);
    }

    private static void printSuvestine(ArrayList<SuvestineItemImpl> suvestine) {
        line(96);
        System.out.println(String.format("|%50s|%20s|%22s|", "Detalė", "Kiekis", "Suma (Eur)"));
        line(96);
        for (SuvestineItemImpl irasas : suvestine) {
            System.out.println(irasas);
        }
        line(96);
    }

    private static void printSuvestineNorma(ArrayList<SuvestineItemImpl> suvestine) {
        line(96);
        System.out.println(String.format("|%50s|%20s|%22s|", "Detalė", "Kiekis", "Suma (Eur)"));
        line(96);
        for (SuvestineItemImpl irasas : suvestine) {
            String norma = irasas.getPagamintasKiekis() >= 1000 ? " NORMA ĮVYKDYTA" : " NORMA NEĮVYKDYTA";
            System.out.println(irasas + norma);
        }
        line(96);
    }
}
