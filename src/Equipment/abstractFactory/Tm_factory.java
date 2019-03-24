package Equipment.abstractFactory;

import Equipment.Clothes.Clothes;
import Equipment.Clothes.imp.superiorClothes;
import Equipment.Weapon.Weapon;
import Equipment.Weapon.imp.TM_Biao;

public class Tm_factory implements AbstractFactory{
    @Override
    public Weapon CreateWeapon() {
        return new TM_Biao();
    }

    @Override
    public Clothes CreateClothes() {
        return new superiorClothes();
    }
}
