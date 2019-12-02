package Pokemons;

import packet.SweetScent;
import ru.ifmo.se.pokemon.*;

public class Solgaleo extends Cosmoem {
    public Solgaleo(String name, int i){
        super(name, i);
        this.setStats(137,137,107,113,89,97);
        this.setType(Type.PSYCHIC,Type.STEEL);
        this.addMove(new SweetScent());

    }


}
