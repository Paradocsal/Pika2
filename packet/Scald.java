package packet;

import ru.ifmo.se.pokemon.*;

public class Scald extends SpecialMove {

    public Scald() {
        super(Type.WATER, 80, 100);
    }

    double chance = Math.random();
    protected void applyOppEffects  (Pokemon p) {

        if (chance < 1) {
            p.addEffect(new Effect().condition(Status.BURN));
            //Effect e = new Effect().chance(0.3);
           // e.burn(p);
            //p.addEffect(e);
            p.addEffect(new Effect().stat(Stat.HP,  1).turns(5));
         }


    }




        protected String describe () {
            return ("Scald");

        }
    }
