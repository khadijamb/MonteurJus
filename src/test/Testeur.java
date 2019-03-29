package test;

import model.*;

public class Testeur {

    public static void main(String[] args){

// Par rapport à la possiblité de faire un cocktail ou genre,
// le Monteur ne nous permet de creer que des représentations différentes
// d'un objet avec le même procédé de construction.

        MonteurJus jus1 = new JusPomme();

        Serveur serveur1= new Serveur(jus1);

        MonteurJus jus2 = new JusOrange();
        Serveur serveur2= new Serveur(jus2);



        Jus jusPomme = serveur1.FaireUnJus();
        Jus jusOrange = serveur2.FaireUnJus();


        System.out.println(jusPomme.toString());
        System.out.println(jusOrange.toString());











    }
}
