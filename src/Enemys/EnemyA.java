package Enemys;

public class EnemyA extends Enemy{

    public EnemyA(){
        this.Enemyname="AAA";
        this.atk=100;
        this.def=30;
        this.hp=300;
        this.mp=300;
    }

    @Override
    public int Attack() {
        return this.atk;
    }

    @Override
    public EnemyA clone(){
        EnemyA o = null;
        try {
             o = (EnemyA) super.clone();
        } catch (CloneNotSupportedException e) {
             System.out.println(e.toString());
        }
        return o;
    }


    public static void main(String args[]){
        EnemyA a=new EnemyA();
        EnemyA b=a.clone();
        System.out.println(b.Attack());

    }
}
