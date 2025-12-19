import java.util.ArrayList;
import java.util.List;


public class Main {

    static void main(String[] args) {

        PokemonElectrik elec1 = new PokemonElectrik("Bouboule", 10);
        PokemonEau eau1 = new PokemonEau("Jet", 12);
        PokemonFeu feu1 = new PokemonFeu("Pyro", 15);

        List<Attaquant> typeAttaquant = new ArrayList<>();
        typeAttaquant.add(elec1);
        typeAttaquant.add(eau1);
        typeAttaquant.add(feu1);


        for (Attaquant a:typeAttaquant) {
            a.attaquer();
            System.out.println(a.toString());
        }







    }
}
