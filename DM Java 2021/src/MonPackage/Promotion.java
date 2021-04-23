package MonPackage;

import java.util.Vector;

public class Promotion {

    // Description des attributs
    private Vector<Etudiant> liste_des_etudiants;
    private int nombre_etudiants = 0;

    public Promotion()
    {
        liste_des_etudiants = new Vector<Etudiant>();
    }

    public Vector<Etudiant> getPromotion()
    {
        return liste_des_etudiants;
    }

    public void setPromotion(Vector<Etudiant> promotion)
    {
        liste_des_etudiants = promotion;
    }

    public int getNombre_etudiants()
    {
        return nombre_etudiants;
    }

    public void setNombre_etudiants(int nombre_etudiants)
    {
        this.nombre_etudiants = nombre_etudiants;
    }

    public Promotion(Vector<Etudiant> promotion, int nombre_etudiants)
    {
        liste_des_etudiants = promotion;
        this.nombre_etudiants = nombre_etudiants;
    }

    public double afficher_moyenne_totale()
    {
        double addition_moyenne = 0;
        System.out.println("Voici la moyenne totale des éléves : ");
        for(Etudiant E: liste_des_etudiants)
        {
            addition_moyenne += E.getMoyenne();
        }
        return addition_moyenne / nombre_etudiants;
    }

    public String afficher_etudiant_moyenne()
    {
        String moyenne_individuelle = new String();
        for(Etudiant E : liste_des_etudiants)
        {
            moyenne_individuelle += E.toString();
        }

        return moyenne_individuelle;
    }

    public void ajouter_etudiant(Etudiant etudiant)
    {
        liste_des_etudiants.add(etudiant);
        nombre_etudiants = nombre_etudiants + 1;
    }

}
