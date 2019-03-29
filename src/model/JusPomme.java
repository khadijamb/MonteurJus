package model;

    public class JusPomme extends MonteurJus {

        public void FaireNouveauJus(){
            jus  = new Jus();
        }

        public void ajouterEau() {
            jus.setEau(300);
        }
        public void ajouterSucre() {
            jus.setSucre(3);
        }

        public void ajouterFruit() {
            jus.setFruit("Pomme");
        }


    }
