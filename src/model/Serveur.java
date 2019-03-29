package model;

public class Serveur {
    private MonteurJus monteurJus;

    public Serveur(MonteurJus monteurJus) {
        this.monteurJus = monteurJus;
    }

    public void setMonteurJus(MonteurJus mj)
    {
        monteurJus = mj;
    }
    public Jus getJus() {
        return monteurJus.getJus();
    }
    public Jus FaireUnJus() {
        monteurJus.FaireNouveauJus();
        monteurJus.ajouterEau();
        monteurJus.ajouterSucre();
        monteurJus.ajouterFruit();

        return getJus();
    }
}