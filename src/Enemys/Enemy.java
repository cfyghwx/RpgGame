package Enemys;

abstract public class Enemy implements Cloneable {
    int hp;

    int mp;

    int atk;

    int def;

    String Enemyname;

    abstract  public int Attack();
}
