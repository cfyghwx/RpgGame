package Equipment.Weapon.imp;

import Equipment.Weapon.Weapon;

public class freshWeapon extends Weapon {

    public freshWeapon(){
        this.name = "ĞÂÊÖÎäÆ÷";
        this.Atk = 100;
    }

    @Override
    public String toString() {
        return name;
    }
}
