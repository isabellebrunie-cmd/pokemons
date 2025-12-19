public abstract class Animal {
public String nom;
public int niveau;
public int pointDeVie;

    public Animal(String nom, int niveau, int pointDeVie) {
        this.nom = nom;
        this.niveau = niveau;
        this.pointDeVie = pointDeVie;
    }

    public void afficherInfos(){
        System.out.println(this.nom + " -- " + this.niveau + " -- " + this.pointDeVie);
    }

}
