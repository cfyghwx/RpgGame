package Equipment.Clothes.imp;

import Equipment.Clothes.Clothes;

public class freshClothes extends Clothes {

    public freshClothes() {
        this.Def = 100;
        this.name = "���ַ���";
    }

    @Override
    public String toString() {
        return name;
    }

}
