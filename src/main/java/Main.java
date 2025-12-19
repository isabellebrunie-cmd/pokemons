import java.util.ArrayList;
import java.util.List;


public class Main {

    static void main(String[] args) {

        PokemonElectrik elec1 = new PokemonElectrik("Bouboule", 10, 52);
        PokemonEau eau1 = new PokemonEau("Jet", 12, 67);
        PokemonFeu feu1 = new PokemonFeu("Pyro", 15, 120);

        List<Pokemon> pokedex = new ArrayList<>();
        pokedex.add(elec1);
        pokedex.add(eau1);
        pokedex.add(feu1);


        for (Pokemon p:pokedex) {
            System.out.println(p.toString());
        }


        feu1.attaquer();
        eau1.attaquer();
        elec1.attaquer();


    }
}
