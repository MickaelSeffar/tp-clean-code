package ex3;

/**
 * Application principale pour gérer le zoo
 */
public class ZooApplication {

    public static void main(String[] args) {
        // Création d'un nouveau zoo nommé "Thoiry"
        Zoo zoo = new Zoo("Thoiry");

        // Ajout des mammifères
        zoo.ajouterAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
        zoo.ajouterAnimal("Zèbre", "MAMMIFERE", "HERBIVORE");
        zoo.ajouterAnimal("Lion", "MAMMIFERE", "HERBIVORE");
        zoo.ajouterAnimal("Panthère", "MAMMIFERE", "CARNIVORE");

        // Ajout des poissons
        zoo.ajouterAnimal("Requin blanc", "POISSON", "HERBIVORE");
        zoo.ajouterAnimal("Truite dorée", "POISSON", "HERBIVORE");

        // Ajout des serpents
        zoo.ajouterAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
        zoo.ajouterAnimal("Python", "SERPENT", "CARNIVORE");
    }

}
