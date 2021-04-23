package MonPackage;

public class UtiliseEtudiant {

    public static void main(String[] args)
    {
        Promotion liste = new Promotion();
        Etudiant premier_eleve = new Etudiant();
        Etudiant deuxieme_eleve = new Etudiant();
        Etudiant troisieme_eleve = new Etudiant();
        liste.ajouter_etudiant(premier_eleve);
        liste.ajouter_etudiant(deuxieme_eleve);
        liste.ajouter_etudiant(troisieme_eleve);
        premier_eleve.modifier_moyenne(15);
        System.out.println(liste.afficher_etudiant_moyenne());
        System.out.println(liste.afficher_moyenne_totale());
    }
}
