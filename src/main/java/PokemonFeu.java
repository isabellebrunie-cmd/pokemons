public class PokemonFeu extends Animal implements Attaquant, Soignant {

    public PokemonFeu(String nom, int niveau, int pointDeVie) {
        super(nom, niveau, pointDeVie);
    }

    @Override
    public void attaquer(){
        System.out.println("Salamèche lance une attaque Flamme");
    }

    @Override
    public void soigner() {
    }

    @Override
    public String toString() {
        return "PokemonFeu{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                ", pointDeVie=" + pointDeVie +
                '}';
    }
}
