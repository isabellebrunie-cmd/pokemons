public class PokemonElectrik extends Pokemon implements Attaquant, Soignant {

    public PokemonElectrik(String nom, int niveau, int pointDeVie, int pointDeDegat) {
        super(nom, niveau, pointDeVie, pointDeDegat);
    }

    @Override
    public void attaquer(){
            System.out.println("Pikachu lance une attaque Éclair");
    }

    @Override
    public void soigner() {
        this.pointDeVie += 9;
    }

    @Override
    public String toString() {
        return "PokemonElectrik{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                ", pointDeVie=" + pointDeVie +
                '}';
    }
}
