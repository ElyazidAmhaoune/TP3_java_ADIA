import java.util.ArrayList;

public class Client {
    private static int codeIncrement = 1;
    private String code;
    private String nom;
    private String prenom;
    private String adresse;
    private ArrayList<Compte> mesComptes;

    // Constructeur
    public Client(String nom, String prenom, String adresse) {
        this.code = "Client:" + codeIncrement++;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mesComptes = new ArrayList<>();
    }

    // Méthode pour récupérer un compte par son code
    public Compte getCompte(String codeCompte) {
        for (Compte compte : mesComptes) {
            if (compte.getCode().equals(codeCompte)) {
                return compte;
            }
        }
        return null; // Retourne null si le compte n'est pas trouvé
    }

    // Méthode pour ajouter un compte au client
    public void addCompte(Compte compte) {
        mesComptes.add(compte);
    }

    // Méthode pour déposer de l'argent dans un compte
    public void deposer(String codeCompte, double montant) {
        Compte compte = getCompte(codeCompte);
        if (compte != null) {
            compte.deposer(montant);
        } else {
            System.out.println("Compte non trouvé.");
        }
    }

    // Méthode pour retirer de l'argent d'un compte
    public void retirer(String codeCompte, double montant) {
        Compte compte = getCompte(codeCompte);
        if (compte != null) {
            compte.retirer(montant);
        } else {
            System.out.println("Compte non trouvé.");
        }
    }

    // Méthode pour obtenir le nombre de comptes du client
    public int getNbCompte() {
        return mesComptes.size();
    }

    // Méthode pour obtenir le code du client
    public String getCode() {
        return code;
    }

    // Méthode pour obtenir le nom du client
    public String getNom() {
        return nom;
    }

    // Méthode pour obtenir le solde total de tous les comptes du client
    public double getSoldeTotal() {
        double totalSolde = 0;
        for (Compte compte : mesComptes) {
            totalSolde += compte.getSolde();
        }
        return totalSolde;
    }

    @Override
    public String toString() {
        // Implémentez la méthode toString() pour afficher les informations du client
        // Vous pouvez utiliser cette méthode pour afficher les détails du client
        return "Client [code=" + code + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
    }
}
