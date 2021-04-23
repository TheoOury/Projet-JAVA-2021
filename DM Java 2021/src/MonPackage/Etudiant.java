package MonPackage;

public class Etudiant {

    // Déclaration des attributs de la classe Etudiant
    private String nom;
    private String date_de_naissance;
    private double moyenne;

    // Déclaration de la méthode constructeur Etudiant
    public Etudiant()
    {
        nom = Saisie.lire_String("Veuillez saisir le nom de l'étudiant.");
        date_de_naissance = Saisie.lire_String("Veuillez saisir la date de naissance de l'étudiant.");
        moyenne = Saisie.lire_double("Veuillez saisir la moyenne de l'étudiant");
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getDate_de_naissance()
    {
        return date_de_naissance;
    }

    public void setDate_de_naissance(String date_de_naissance)
    {
        this.date_de_naissance = date_de_naissance;
    }

    public double getMoyenne()
    {
        return moyenne;
    }

    public void setMoyenne(double moyenne)
    {
        this.moyenne = moyenne;
    }

    public void modifier_moyenne(double moyenne)
    {
        this.moyenne = moyenne;
    }

    @Override
    public String toString()
    {
        return "Le nom de l'étudiant est : "+nom+"\nSa date de naissance est le : "+date_de_naissance+"\nSa moyenne est de : "+moyenne+"\n";
    }
}
