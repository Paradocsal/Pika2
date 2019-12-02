package Pokemons;

import packet.WorkUp;
import ru.ifmo.se.pokemon.Type;

public class Gastrodon extends Shellos {
    public Gastrodon(String name, int i){
        super(name, i);
        this.setType(Type.WATER,Type.GROUND);
        this.setStats(111,83,68,92,82,39);
        this.addMove(new WorkUp());

    }

}
