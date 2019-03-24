package Enemys;

public class EnemyC extends Enemy {

    public EnemyC(){
        this.Enemyname="CCC";
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
    public EnemyC clone(){
        EnemyC o = null;
        try {
            o = (EnemyC) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }
}
