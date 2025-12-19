import java.util.ArrayList;
import java.util.List;


public class Main {

    static void main(String[] args) {

        Attaquant elec1 = new PokemonElectrik("pika", 10, 52, 6);
        Attaquant eau1 = new PokemonEau("Jet", 12, 67, 9);
        Attaquant feu1 = new PokemonFeu("Pyro", 15, 120, 25);

        PokemonElectrik e1 = (PokemonElectrik) elec1;
        e1.afficherInfos();

        List<Attaquant> pokedex = new ArrayList<>();
        pokedex.add(elec1);
        pokedex.add(eau1);
        pokedex.add(feu1);


        for (Attaquant p:pokedex) {
            //System.out.println(p.toString());
            if (p instanceof PokemonElectrik) {
                ((PokemonElectrik) p).afficherInfos();
            } else if (p instanceof PokemonFeu) {
                ((PokemonFeu) p).afficherInfos();
            } else if (p instanceof PokemonEau) {
                ((PokemonEau) p).afficherInfos();
            }
        }



        feu1.attaquer();
        eau1.attaquer();
        elec1.attaquer();

        System.out.println(((PokemonFeu) feu1).combattre(((PokemonEau) eau1)));
        System.out.println(((PokemonFeu) feu1).pointDeVie);



    }
}
