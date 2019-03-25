package Equipment.Weapon.imp;

import Equipment.Weapon.Weapon;

public class SL_gun extends Weapon {
    public SL_gun(){
        this.Atk = 200;
        this.name = "ÉÙÁÖ¹÷";
    }

    @Override
    public String toString() {
        return name;
    }
}
