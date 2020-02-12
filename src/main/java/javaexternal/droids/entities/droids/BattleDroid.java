package javaexternal.droids.entities.droids;

import javaexternal.droids.entities.attack.Attack;

public abstract class BattleDroid extends Droid  {

    private Attack attack;

    public BattleDroid(int energy, int health, int protection, String name) {
        super(energy, health, protection, name);
    }

    public int attack(){
        if(attack == null){
            System.out.println("No Weapon..cannot attack.");
            return 0;
        }

        setEnergy(getEnergy() - attack.getEnergyConsumption());
        return attack.attack();
    }

    protected void setAttack(Attack attack){
        this.attack = attack;
    }

}
