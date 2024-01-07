public class ApplicationBancaire {

    public static void main(String[] args) {
        // Créer une instance de la banque
        Agence banque = new Agence("123 Rue de la Banque");

        // Créer des clients
        Client client1 = new Client("John", "Doe", "123 Main St");
        Client client2 = new Client("Jane", "Doe", "456 Oak St");

        // Ajouter des clients à la banque
        banque.addClient(client1);
        banque.addClient(client2);

        // Créer des comptes
        Compte compte1 = new Compte(1000, banque, client1);
        Compte compteEpargne = new CompteEpargne(2000, banque, client2, 0.05);
        Compte comptePayant = new ComptePayant(3000, banque, client2);

        // Ajouter des comptes aux clients
        client1.addCompte(compte1);
        client2.addCompte(compteEpargne);
        client2.addCompte(comptePayant);

        // Effectuer des transactions
        client1.deposer(compte1.getCode(), 500);
        client2.retirer(compteEpargne.getCode(), 200);

        // Afficher les informations
        System.out.println("Liste des clients avec leurs comptes:");
        System.out.println(banque.toString());

        System.out.println("Liste des comptes d'épargne de l'agence:");
        System.out.println(banque.getComptesEpargne());

        System.out.println("Liste des comptes payants de l'agence:");
        System.out.println(banque.getComptesPayants());

        System.out.println("Le solde total des comptes de " + client1.getNom() + ": " + client1.getSoldeTotal());
        System.out.println("Le solde total des comptes de " + client2.getNom() + ": " + client2.getSoldeTotal());

        System.out.println("Classement des clients selon le solde total:");
        System.out.println(banque.classementClients());
    }
}
