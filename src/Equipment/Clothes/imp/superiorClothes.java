package Equipment.Clothes.imp;

import Equipment.Clothes.Clothes;

public class superiorClothes extends Clothes {
    public superiorClothes() {
        this.Def = 200;
        this.name = "�߼�����";
    }

    @Override
    public String toString() {
        return name;
    }
}
