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

    @Override
    public void useAtk() {
        System.out.println(this.Enemyname + "发起了普通攻击");
    }

    public static void main(String args[]){
        EnemyA a=new EnemyA();
        System.out.println(a.getAtk());

    }


}
