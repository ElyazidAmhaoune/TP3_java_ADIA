public class ComptePayant extends Compte {
    private static final double TAUX_OPERATION = 5.0;

    // Constructeur
    public ComptePayant(double solde, Agence lAgence, Client proprietaire) {
        super(solde, lAgence, proprietaire);
    }

    // Méthode pour déposer de l'argent avec frais
    @Override
    public void deposer(double montant) {
        super.deposer(montant - TAUX_OPERATION);
    }

    // Méthode pour retirer de l'argent avec frais
    @Override
    public void retirer(double montant) {
        super.retirer(montant + TAUX_OPERATION);
    }

    // Autres méthodes à implémenter
}
