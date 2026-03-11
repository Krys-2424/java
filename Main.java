public class Main {

    public static void main(String[] args) {

        // variable pour stocker un Etudiant
        // Déclaration
        Etudiant etu;
        // Initialisation / construction
        etu = new Etudiant();

        Etudiant etu2 = new Etudiant("Bastien", 1990);
        Etudiant etu3 = new Etudiant(2002);

        System.out.println("Le premier etudiant s'appelle " + etu.getNom());
        etu.setNom("Claude");
        System.out.println("Le premier etudiant s'appelle " + etu.getNom());

        // etu3.nom = "f*ck";
        System.out.println(etu3.getNom());
        etu3.setNom("f*ck");
        System.out.println(etu3.getNom());

        System.out.println(etu.toString());

        System.out.println(etu.age());
        System.out.println(etu2.age());
        System.out.println(etu3.age());

        etu.ajoutNote(3.2f);
        etu.ajoutNote(17.2f);
        etu.ajoutNote(10.2f);
        etu.ajoutNote(11.2f);
        System.out.println(etu.getNotes());

        System.out.println(etu.avoirNote(1));
        System.out.println(etu.avoirNote(2));
        System.out.println(etu.avoirNote(3));
        System.out.println(etu.avoirNote(0));

        //  13.5 → 13.5f (float, pas double)
        etu.modifierNote(0, 13.5f);
        //  modifierNote retourne void, on affiche séparément
        System.out.println(etu.avoirNote(0));

        //  affichage des moyennes
        System.out.println("Moyenne de etu   : " + etu.moyenne());

    }

}
