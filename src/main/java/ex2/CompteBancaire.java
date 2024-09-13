package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 */
public class CompteBancaire {

    /**
     * solde : solde du compte
     */
    private double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    private double decouvert;

    /**
     * tauxRemuneration : taux de rémunération dans le cas d'un livret A
     */
    private double tauxRemuneration;

    /**
     * Le type vaut soit CC=Compte courant, ou soit LA=Livret A
     */
    private String type;

    /** Ce constructeur est utilisé pour créer un compte
     *
     * @param type             = LA
     * @param solde            représente le solde du compte
     * @param decouvert        représente le découvert autorisé
     * @param tauxRemuneration représente le taux de rémunération du livret A
     */
    public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
        super();
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
        this.tauxRemuneration = tauxRemuneration;
    }

    /** Ajoute un montant au solde
     *
     * @param montant
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /** débite un montant au solde
     *
     * @param montant
     */
    public void debiterMontant(double montant) {
        if (type.equals("CC")) {
            if (this.solde - montant >= -decouvert) {
                this.solde -= montant;
            }
        } else if (type.equals("LA")) {
            if (this.solde - montant >= 0) {
                this.solde -= montant;
            }
        }
    }
    /** Ajoute la rémuneration annuelle au solde
     *
     */
    public void appliquerRemuAnnuelle() {
        if (type.equals("LA")) {
            this.solde += this.solde * tauxRemuneration / 100;
        }
    }

    /** Getter pour le solde
     * @return le solde
     */
    public double getSolde() {
        return solde;
    }

    /** Setter pour le solde
     * @param solde
     * @return double
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /** Getter pour le decouvert
     *
     * @return le decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /** Setter pour le decouvert
     *
     * @param decouvert
     * @return double
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /** Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /** Setter pour le tauxRemuneration
     *
     * @param tauxRemuneration
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }

    /** Getter for type
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**  Setter pour le type
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
