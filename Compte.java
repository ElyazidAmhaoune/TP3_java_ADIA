public class Compte {
    private static int codeIncrement = 1;
    private int numero;  // Add this line to declare the account number
    private String code;
    private double solde;
    private Agence lAgence;
    private Client proprietaire;

    // Constructeur
    public Compte(double solde, Agence lAgence, Client proprietaire) {
        this.numero = codeIncrement++;  // Initialize the account number
        this.code = "Compte:" + this.numero;
        this.solde = solde;
        this.lAgence = lAgence;
        this.proprietaire = proprietaire;
    }

    // Méthode pour obtenir le numéro du compte
    public int getNumero() {
        return numero;
    }

    // Méthode pour obtenir le code du compte
    public String getCode() {
        return code;
    }

    // Méthode pour obtenir le solde du compte
    public double getSolde() {
        return solde;
    }

    // Méthode pour déposer de l'argent dans le compte
    public void deposer(double montant) {
        solde += montant;
    }

    // Méthode pour retirer de l'argent du compte
    public void retirer(double montant) {
        solde -= montant;
    }

    // Méthode toString pour afficher les informations du compte
    @Override
    public String toString() {
        return "Compte [code=" + code + ", solde=" + solde + ", lAgence=" + lAgence + ", proprietaire=" + proprietaire + "]";
    }
}
