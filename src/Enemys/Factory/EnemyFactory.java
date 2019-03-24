package Enemys.Factory;

import Enemys.Enemy;

import java.util.HashMap;

public class EnemyFactory {

    private static HashMap<String, Enemy> pool=new HashMap<>();

    public static Enemy getEnemy(String monstername){
        Enemy enemy=null;
        if (pool.containsKey(monstername)){
            enemy=pool.get(monstername);
        }
        else{
            if (monstername.equals("AAA")){
                EnemyAFactory fa=new EnemyAFactory();
                enemy=fa.CreateEnemy();
            }
            if (monstername.equals("BBB")){
                EnemyBFactory fb=new EnemyBFactory();
                enemy=fb.CreateEnemy();
            }
            if (monstername.equals("CCC")){
                EnemyCFactory fc=new EnemyCFactory();
                enemy=fc.CreateEnemy();
            }
        }
        pool.put(monstername,enemy);
        return enemy;
    }

}
