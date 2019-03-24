package Enemy;

public class EnemyA extends Enemy{

    public EnemyA(){
        this.atk=100;
        this.def=30;
        this.hp=300;
        this.mp=300;
    }

    @Override
    public int Attack() {
        return this.atk;
    }

    public static void main(String args[]){
        EnemyA a=new EnemyA();
        System.out.println(a.Attack());
    }
}
