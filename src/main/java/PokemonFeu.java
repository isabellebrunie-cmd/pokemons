public class PokemonFeu extends Animal implements Attaquant {

    public PokemonFeu(String nom, int niveau) {
        super(nom, niveau);
    }

    @Override
    public void attaquer(){
        System.out.println("Salamèche lance une attaque Flamme");
    }

    @Override
    public String toString() {
        return "PokemonFeu{" +
                "nom='" + nom + '\'' +
                ", niveau=" + niveau +
                '}';
    }
}
