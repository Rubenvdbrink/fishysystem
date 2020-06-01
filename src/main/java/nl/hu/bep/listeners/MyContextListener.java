package nl.hu.bep.listeners;

import nl.hu.bep.model.AquariumManager;
import nl.hu.bep.model.aquarium.*;
import nl.hu.bep.model.bewoners.Garnaal;
import nl.hu.bep.model.bewoners.Kreeft;
import nl.hu.bep.model.bewoners.Slak;
import nl.hu.bep.model.bewoners.Vis;
import nl.hu.bep.model.personen.Beheerder;
import nl.hu.bep.model.personen.Eigenaar;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        new AquariumManager("aqua");

        Eigenaar e1 = new Eigenaar("AquaRuben","1234", "ruben", "van den Brink");
        Beheerder b1 = new Beheerder("AquaAdmin", "1234", "henk", "tenk");

        Aquarium a1 = new Aquarium("Bikini Bottom", 50, 50, 50, "zand", "zout");
        Aquarium a2 = new Aquarium("Admin Aqua", 100, 40, 50, "steen", "brak");
        Aquarium a3 = new Aquarium("WaterWorld", 200, 200, 100, "zand", "zout");

        Garnaal g1 = new Garnaal("Malacostraca", "oranje", 5, false);
        Vis v1 = new Vis("Guppy", "blauw", 10, true, false, true);
        Slak s1 = new Slak("Poelslak", "bruin", 3, false, true);
        Kreeft k1 = new Kreeft("Rivierkreeft", "rood", 4, true);

        Filter f1 = new Filter("Aquaclean", 9834872, false, 120);
        Thermostaat t1 = new Thermostaat("YeetHeat", 1293519, 10,50,28);
        Verlichting ve1 = new Verlichting("LightUp", 2930492, true, 100, 90);

        Ornament o1 = new Ornament("Spongebob's Huis", "Ananas diep in de zee", "Oranje", true);

        a1.addBewoner(g1);
        a1.addBewoner(s1);
        a1.addToebehoren(f1);
        a1.addToebehoren(ve1);
        a1.addToebehoren(t1);
        a1.addOrnament(o1);

        a2.addBewoner(v1);
        a2.addBewoner(k1);
        a2.addToebehoren(t1);
        a2.addToebehoren(f1);
        a2.addOrnament(o1);

        a3.addBewoner(v1);
        a3.addBewoner(k1);
        a3.addBewoner(s1);
        a3.addToebehoren(f1);
        a3.addToebehoren(ve1);
        a3.addOrnament(o1);

        e1.addAquarium(a1);
        e1.addAquarium(a3);

        b1.addAquarium(a2);

    }
}
