import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Etudiant etu = new Etudiant();

        etu.ajoutNote(3.2f);
        etu.ajoutNote(17.2f);
        etu.ajoutNote(10.2f);
        etu.ajoutNote(11.2f);

        etu.voirNotes();
        etu.modifierNote(1, 2.5f);
        System.out.println();
        etu.voirNotes();

        System.out.println("Ta moyenne est de " + etu.moyenne());

        System.out.println();

        // Créer 25 étudiants dans un ArrayList
        ArrayList<Etudiant> etudiants = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 25; i++) {
            Etudiant e = new Etudiant("Etudiant" + (i + 1),
             rand.nextInt(2000,2020), // Année de naissance aléatoire entre 2000 et 2020
             rand.nextInt(1, 100), // Identifiant aléatoire entre 1 et 100
             rand.nextDouble(1.5, 2.0)); // Taille

            // Leur mettre chacun 5 notes aléatoires (entre 0 et 20)
            for (int j = 0; j < 5; j++) {
                e.ajoutNote(rand.nextFloat() * 20);
            }

            etudiants.add(e);
        }

        // Afficher la moyenne de chacun
        float sommeGenerale = 0;
        for (int i = 0; i < etudiants.size(); i++) {
            Etudiant e = etudiants.get(i);
            float moyenne = e.moyenne();
            sommeGenerale += moyenne;
            System.out.println(e.getNom() + " -> moyenne : " + String.format("%.2f", moyenne));
        }

        // Afficher la moyenne générale
        float moyenneGenerale = sommeGenerale / etudiants.size();
        System.out.println();
        System.out.println("Moyenne générale : " + String.format("%.2f", moyenneGenerale));

    }

}
