package com.head.first.adventuregame.characters;

import com.head.first.adventuregame.weapons.Weapon;

public abstract class Character {
    
    protected Weapon weapon;

    public Character(Weapon weapon) {
        this.weapon = weapon;
    }

    public final Weapon getWeapon() {
        return weapon;
    }

    public final void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public final void useWeapon() {
        this.weapon.attack();
    }
}
