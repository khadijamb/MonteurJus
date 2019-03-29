package model;

public  class JusOrange extends MonteurJus {

    public void FaireNouveauJus(){
        jus  = new Jus();
    }

    public void ajouterEau() {
        jus.setEau(300);
    }
    public void ajouterSucre() {
        jus.setSucre(4);
    }

    public void ajouterFruit() {
        jus.setFruit("Orange");
    }
}
