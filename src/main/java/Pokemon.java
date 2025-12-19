public abstract class Pokemon {
public String nom;
public int niveau;
public int pointDeVie;

    public Pokemon(String nom, int niveau, int pointDeVie) {
        this.nom = nom;
        this.niveau = niveau;
        this.pointDeVie = pointDeVie;
    }

    public void afficherInfos(){
        System.out.println(this.nom + " -- " + this.niveau + " -- " + this.pointDeVie);
    }

}
