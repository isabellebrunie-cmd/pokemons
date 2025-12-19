public class PokemonEau extends Animal implements Attaquant, Soignant {

    public PokemonEau(String nom, int niveau, int pointDeVie) {
        super(nom, niveau, pointDeVie);
    }

    @Override
    public void attaquer(){
        System.out.println("Carapuce lance une attaque Pistolet à eau");
    }

    @Override
    public void soigner() {

    }

    @Override
    public String toString() {
        return "PokemonEau{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                ", pointDeVie=" + pointDeVie +
                '}';
    }
}
