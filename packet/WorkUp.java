package packet;

import ru.ifmo.se.pokemon.*;

import static ru.ifmo.se.pokemon.Stat.ATTACK;

public class WorkUp extends StatusMove {
    public WorkUp(){super(Type.NORMAL,0,0);}
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.ATTACK, -1));
        p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, -1));

    }
    protected String describe(){
        return ("WorkUp");
    }
}
