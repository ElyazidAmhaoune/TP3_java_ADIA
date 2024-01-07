import java.util.ArrayList;

public class Agence {
    private static int numeroIncrement = 1;
    private String numero;
    private String adresse;
    private ArrayList<Client> lesClients;
    private ArrayList<Compte> lesComptes;

    // Constructeur
    public Agence(String adresse) {
        this.numero = "Agence:" + numeroIncrement++;
        this.adresse = adresse;
        this.lesClients = new ArrayList<>();
        this.lesComptes = new ArrayList<>();
    }

    // Méthode pour récupérer un compte par son numéro
    public Compte getCompte(int numero) {
        for (Compte compte : lesComptes) {
            if (compte.getCode().equals("Compte:" + numero)) {
                return compte;
            }
        }
        return null; // Retourne null si le compte n'est pas trouvé
    }

    // Méthode pour récupérer un client par son code
    public Client getClient(int code) {
        for (Client client : lesClients) {
            if (client.getCode().equals("Client:" + code)) {
                return client;
            }
        }
        return null; // Retourne null si le client n'est pas trouvé
    }

    // Méthode pour ajouter un compte à l'agence
    public void addCompte(Compte compte) {
        lesComptes.add(compte);
    }

    // Méthode pour ajouter un client à l'agence
    public void addClient(Client client) {
        lesClients.add(client);
    }

    // Méthode pour obtenir le nombre de clients dans l'agence
    public int getNbClient() {
        return lesClients.size();
    }

    // Méthode pour obtenir le nombre de comptes dans l'agence
    public int getNbCompte() {
        return lesComptes.size();
    }

    // Autres méthodes à implémenter

    @Override
    public String toString() {
        // Implémentez la méthode toString() pour afficher les informations de l'agence
        // Vous pouvez utiliser cette méthode pour afficher les détails de l'agence
        return "Agence [numero=" + numero + ", adresse=" + adresse + "]";
    }
     // Method to get the list of savings accounts
    public String getComptesEpargne() {
        // Implement this method to return the list of savings accounts
        return "List of savings accounts";
    }

    // Method to get the name of the client
    public String getNom() {
        // Implement this method to return the name of the client
        return "Client Name";
    }

    // Method to get the total balance of all client's accounts
    public double getSoldeTotal() {
        // Implement this method to return the total balance
        return 0.0;
    }
    // Method to get payant accounts
    public ArrayList<ComptePayant> getComptesPayants() {
        ArrayList<ComptePayant> payantAccounts = new ArrayList<>();
        for (Compte compte : lesComptes) {
            if (compte instanceof ComptePayant) {
                payantAccounts.add((ComptePayant) compte);
            }
        }
        return payantAccounts;
    }

    // Method to get a ranking of clients based on total balance
    public String classementClients() {
        // Implement this method to return the ranking of clients
        return "Client Ranking";
    }
}
