package Enemy;

public class EnemyC extends Enemy {

    public EnemyC(){
        this.atk=300;
        this.def=10;
        this.hp=3300;
        this.mp=300;
    }

    @Override
    public int Attack() {
        return this.atk;
    }
}
