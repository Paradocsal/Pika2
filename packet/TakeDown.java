package packet;

import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove {
    public TakeDown(){super(Type.NORMAL,90,85);}
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.HP,(int) (p.getStat(Stat.SPECIAL_ATTACK)/4)));
    };
    protected String describe () {
        return ("TakeDown");

    }



}
