public class PokemonEau extends Animal implements Attaquant {

    public PokemonEau(String nom, int niveau) {
        super(nom, niveau);
    }

    @Override
    public void attaquer(){
        System.out.println("Carapuce lance une attaque Pistolet à eau");
    }

    @Override
    public String toString() {
        return "PokemonEau{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                '}';
    }
}
