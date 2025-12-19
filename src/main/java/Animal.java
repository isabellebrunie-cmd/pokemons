public abstract class Animal {
public String nom;
public int niveau;

    public Animal(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public void afficherInfos(){
        System.out.println(this.nom + " -- " + this.niveau);
    }

}
