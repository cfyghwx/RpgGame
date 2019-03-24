package Enemys;

public class EnemyB extends Enemy{

    public EnemyB(){
        this.Enemyname="BBB";
        this.atk=300;
        this.def=10;
        this.hp=3300;
        this.mp=300;
    }

    @Override
    public int Attack() {
        return this.atk;
    }

    @Override
    public EnemyB clone(){
        EnemyB o = null;
        try {
            o = (EnemyB) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }

}
