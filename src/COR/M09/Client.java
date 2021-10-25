package COR.M09;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;

public class Client {
    private String nom;
    private List<Float> llistaPreus;

    public Client(){this.nom="Anònim";}
    public Client(String nom) {this.nom=nom;}

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public List<Float> getLlistaPreus() {
        return llistaPreus;
    }
    public void setLlistaPreus(List<Float> llistaPreus) {
        this.llistaPreus = llistaPreus;
    }

    public void ompleLlistaPreus() {
        List<Float> llistaTemp = (List) new ArrayList<>();

        // loop, omplim la llista
        int numItems = (int) (Math.random() * 100);
        for (int i = 0; i < numItems; i++) {
            llistaTemp.add( (float) (Math.random() * 100) );
        }
        this.llistaPreus = llistaTemp;
    }
}
