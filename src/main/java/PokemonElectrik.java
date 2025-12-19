public class PokemonElectrik extends Animal implements Attaquant {

    public PokemonElectrik(String nom, int niveau) {
        super(nom, niveau);
    }

    @Override
    public void attaquer(){
            System.out.println("Pikachu lance une attaque Éclair");
    }

    @Override
    public String toString() {
        return "PokemonElectrik{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                '}';
    }
}
