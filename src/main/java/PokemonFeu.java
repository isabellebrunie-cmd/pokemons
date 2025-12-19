public class PokemonFeu extends Pokemon implements Attaquant, Soignant {

    public PokemonFeu(String nom, int niveau, int pointDeVie, int pointDeDegat) {
        super(nom, niveau, pointDeVie, pointDeDegat);
    }

    @Override
    public void attaquer(){
        System.out.println("Salamèche lance une attaque Flamme");
    }

    @Override
    public void soigner() {
        this.pointDeVie += 10;
    }

    public int combattre(Pokemon p) {
        super.combattre(p);
        return p.pointDeVie;
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
