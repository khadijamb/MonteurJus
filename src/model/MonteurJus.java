package model;

 public abstract class MonteurJus {
   protected Jus jus;

        public Jus getJus() {return jus;}

        public void FaireNouveauJus() { jus = new Jus(); }

        abstract void ajouterEau();

        abstract void ajouterFruit();

        abstract void ajouterSucre();

      
}
