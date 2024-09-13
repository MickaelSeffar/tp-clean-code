package ex2;

/**
 * Représente un compte de type Livret A
 */
public class LivretA extends CompteBancaire {

    /**
     * Constructeur pour créer un compte Livret A
     *
     * @param solde            représente le solde du compte
     * @param tauxRemuneration représente le taux de rémunération du livret A
     */
    public LivretA(double solde, double tauxRemuneration) {
        super("LA", solde, 0, tauxRemuneration);
    }

}
