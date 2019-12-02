import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {





        Battle b = new Battle();
        b.addAlly(new Shellos("Shell",1));
        b.addAlly(new Cosmoem("Cosmo",1));
        b.addFoe(new Gastrodon("Gast", 1));
        b.addFoe(new Tapu("Tap",1));
        b.addAlly(new Solgaleo("Leo",1));
        b.addFoe(new Nihilego("Lego",1));

        b.go();




    }
}
