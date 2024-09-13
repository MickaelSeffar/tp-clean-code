package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un zoo avec une liste d'animaux
 */
public class Zoo {

    private String nom;
    private List<String> typesAnimaux;
    private List<String> nomsAnimaux;
    private List<String> comportementsAnimaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.typesAnimaux = new ArrayList<>();
        this.nomsAnimaux = new ArrayList<>();
        this.comportementsAnimaux = new ArrayList<>();
    }

    /**
     * Méthode pour ajouter des animaux
     *
     * @param nomAnimal
     * @param typeAnimal
     * @param comportement
     */
    public void ajouterAnimal(String nomAnimal, String typeAnimal, String comportement) {
        typesAnimaux.add(typeAnimal);
        nomsAnimaux.add(nomAnimal);
        comportementsAnimaux.add(comportement);
    }

    /**
     * Méthode pour afficher la liste des animaux
     */
    public void afficherListeAnimaux() {
        for (int i = 0; i < typesAnimaux.size(); i++) {
            System.out.println(nomsAnimaux.get(i) + " " + typesAnimaux.get(i) + " " + comportementsAnimaux.get(i));
        }
    }

    /**
     * Retourne le nombre d'animaux dans le zoo
     *
     * @return taille
     */
    public int taille() {
        return typesAnimaux.size();
    }

    /**
     * Getter pour le nom
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter pour le nom
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
