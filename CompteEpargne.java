public class CompteEpargne extends Compte {
    private double taux;

    // Constructeur
    public CompteEpargne(double solde, Agence lAgence, Client proprietaire, double taux) {
        super(solde, lAgence, proprietaire);
        this.taux = taux;
    }

    // Méthode pour obtenir le taux du compte épargne
    public double getTaux() {
        return taux;
    }

    // Méthode pour définir le taux du compte épargne
    public void setTaux(double taux) {
        this.taux = taux;
    }

    // Méthode pour calculer les intérêts et mettre à jour le solde
    public void calculInteret() {
        double interet = getSolde() * taux;
        deposer(interet);
    }

    // Autres méthodes à implémenter
}
