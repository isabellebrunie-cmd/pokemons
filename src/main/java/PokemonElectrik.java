public class PokemonElectrik extends Animal implements Attaquant, Soignant {

    public PokemonElectrik(String nom, int niveau, int pointDeVie) {
        super(nom, niveau, pointDeVie);
    }

    @Override
    public void attaquer(){
            System.out.println("Pikachu lance une attaque Éclair");
    }

    @Override
    public void soigner() {

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
