package Equipment.abstractFactory;

import Equipment.Clothes.Clothes;
import Equipment.Clothes.imp.superiorClothes;
import Equipment.Weapon.Weapon;
import Equipment.Weapon.imp.EM_Chi;

public class Em_factory implements AbstractFactory{
    @Override
    public Weapon CreateWeapon() {
        return new EM_Chi();
    }

    @Override
    public Clothes CreateClothes() {
        return new superiorClothes();
    }
}
