public abstract class Pokemon {
public String nom;
public int niveau;
public int pointDeVie;
public int pointDeDegat;

    public Pokemon(String nom, int niveau, int pointDeVie, int pointDeDegat) {
        this.nom = nom;
        this.niveau = niveau;
        this.pointDeVie = pointDeVie;
        this.pointDeDegat = pointDeDegat;
    }

    public void afficherInfos(){
        System.out.println("Nom : " + this.nom + " -- Niv. : " + this.niveau + " -- PV : " + this.pointDeVie + " -- Dégât : " + this.pointDeDegat);
    }

    public int getPointDeDegat() {
        return pointDeDegat;
    }

    public void setPointDeDegat(int pointDeDegat) {
        this.pointDeDegat = pointDeDegat;
    }

    public int getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int combattre(Pokemon p) {
        p.pointDeVie -= 15;
        this.pointDeVie -= 15;
        return p.pointDeVie ;
    }

}
