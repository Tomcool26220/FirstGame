import java.util.Arrays;

public class Voiture {

    private String marque;
    private String couleur;
    private String model;
    private Collection[] collection;

    public Voiture(){

    }

    public Voiture(String marque, String couleur, String model, Collection[] collection) {
        this.marque = marque;
        this.couleur = couleur;
        this.model = model;
        this.collection = collection;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Collection[] getCollection() {
        return collection;
    }

    public void setCollection(Collection[] collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", couleur='" + couleur + '\'' +
                ", model='" + model + '\'' +
                ", collection=" + Arrays.toString(collection) +
                '}';
    }
}
