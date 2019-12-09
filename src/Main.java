import com.darbininkasItem.DarbininkasItemImpl;
import com.suvestineItem.SuvestineItemImpl;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<DarbininkasItemImpl> darbininkai = new ArrayList<>();
        ArrayList<SuvestineItemImpl> suvestine = new ArrayList<>();

        darbininkai.add(new DarbininkasItemImpl("Jonas Jonaitis", "LED", 500, 0.12));
        darbininkai.add(new DarbininkasItemImpl("Jonas Petraitis", "LED", 600, 0.12));
        darbininkai.add(new DarbininkasItemImpl("Petras Petraitis", "Kondensatorius", 100, 0.59));
        darbininkai.add(new DarbininkasItemImpl("Petras Jonaitis", "Kondensatorius", 120, 0.59));
        darbininkai.add(new DarbininkasItemImpl("Zigmas Petraitis", "Soc", 100, 59.99));
        darbininkai.add(new DarbininkasItemImpl("Zigmas Antanaitis", "Soc", 103, 59.99));
        darbininkai.add(new DarbininkasItemImpl("Antanas Petraitis", "Ekranas", 102, 59.99));
        darbininkai.add(new DarbininkasItemImpl("Petras Antanaitis", "Ekranas", 101, 59.99));
        darbininkai.add(new DarbininkasItemImpl("Petras Antanaitis", "LED Ekranas", 110, 109.99));
        darbininkai.add(new DarbininkasItemImpl("Petras Antanaitis", "Kondensatorius", 1500, 59.99));

        System.out.println(String.format("|%50s|%20s|%22s|", "Detalė", "Kiekis", "Suma (Eur)"));
	// write your code here
    }
}
