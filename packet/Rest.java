package packet;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest () { super(Type.PSYCHIC, 0, 100); }
    protected void applySelfEffects(Pokemon p){
        p.addEffect(new Effect().condition(Status.SLEEP).turns(2));
        p.addEffect(new Effect().stat(Stat.HP, (int) (p.getHP()-p.getStat(Stat.HP))).turns(1));


    }
    protected String describe(){
        return ("Rest");
    }

}
