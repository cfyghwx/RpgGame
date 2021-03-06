package People;

import Command.SkillCommand;
import Command.Invoker;
import Command.weaponCommand;
import Equipment.Clothes.Clothes;
import Equipment.Weapon.Weapon;
import Equipment.abstractFactory.fresh_factory;
import People.Career.Career;
import People.Career.emei;
import People.State.Health;
import People.State.State;
import People.State.binsi;
import Skill.Skill;

import java.util.List;

public class Role {

    private String Rolename;

    private int Currenthp=500;

    private int maxhp=500;

    private int mp=100;

    private int Atk=100;//攻击力

    private int def=100;//防御力

    private int exp=0;//经验值

    private int level=1;//等级

    private int strength=10;//力量

    private int intl=10;//智力

    private int speed=10;//敏捷

    private Career RoleCareer;

    private Weapon RoleWeapon;

    private Clothes RoleClothes;

    private List<Skill> RoleSkill;

    private State state;

    private static Role role;

    private Role(String username,Career usercareer){
        this.setRolename(username);
        this.setRoleCareer(usercareer);
        this.getRoleCareer().addshuxing(this);
        fresh_factory ff=new fresh_factory();
        this.setRoleWeapon(ff.CreateWeapon());
        this.setRoleClothes(ff.CreateClothes());
        this.setRoleSkill(usercareer.getSkilllistl());
        this.setState(new Health());
    }

    /**
     * 生成单例模式
     * @return
     */
    public static Role getRole(String username,Career c){
        if (role==null){
            role=new Role(username,c);
        }
        return role;
    }

    /**
     * 获取人物基础属性
     */
    public void getRolestats(){
        role.toString();
    }

    /**
     *人物升级
     * @return
     */
    public void levelup(){
        this.level++;
        this.setMaxhp(getMaxhp()+level*10);
        this.Currenthp=this.maxhp;
        this.setMp(getMp()+level*10);
        this.setAtk(getAtk()+level*5);
        this.setDef(getDef()+level*5);
        this.setStrength(getStrength()+level*3);
        this.setIntl(getIntl()+level*3);
        this.setSpeed(getSpeed()+level*3);
        System.out.println("你升级了！");
    }

    /**
     * 战斗胜利恢复全部血量
     */
    public void Victory(){
        this.setCurrenthp(this.getMaxhp());
        this.setExp(getExp()+50);
        if(this.getExp()>=100){
            this.setExp(this.getExp()%100);
            levelup();
        };
    }

    /**
     * 战斗
     */
    public int attack(Skill skill){
        Invoker invoker=new Invoker();
        if (skill.getName()=="普通攻击"){
            weaponCommand ws = new weaponCommand(getRoleWeapon());
            invoker.setCommand(ws);
        }else {
            SkillCommand sc=new SkillCommand(skill);
            invoker.setCommand(sc);
        }
        invoker.buttonWatPressed(this.Rolename);
        if (((double)this.getCurrenthp()/(double)this.getMaxhp())<0.5){
            this.setState(new binsi());
        }
        else{
            this.setState(new Health());
    }
        return this.getState().doATK(this)+skill.useSkill()+this.getRoleWeapon().getAtk()+5*
                this.getStrength()+6*this.getSpeed()+3*this.getIntl();
    }


    /**
     * 下面的都是setget方法
     * @return
     */

    public String getRolename() {
        return Rolename;
    }

    public void setRolename(String rolename) {
        Rolename = rolename;
    }

    public int getCurrenthp() {
        return Currenthp;
    }

    public void setCurrenthp(int currenthp) {
        Currenthp = currenthp;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAtk() {
        return Atk;
    }

    public void setAtk(int atk) {
        Atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntl() {
        return intl;
    }

    public void setIntl(int intl) {
        this.intl = intl;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Career getRoleCareer() {
        return RoleCareer;
    }

    public void setRoleCareer(Career roleCareer) {
        RoleCareer = roleCareer;
    }

    public Weapon getRoleWeapon() {
        return RoleWeapon;
    }

    public void setRoleWeapon(Weapon roleWeapon) {
        RoleWeapon = roleWeapon;
    }

    public Clothes getRoleClothes() {
        return RoleClothes;
    }

    public void setRoleClothes(Clothes roleClothes) {
        RoleClothes = roleClothes;
    }

    public List<Skill> getRoleSkill() {
        return RoleSkill;
    }

    public void setRoleSkill(List<Skill> roleSkill) {
        RoleSkill = roleSkill;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Role{" +
                "角色名称='" + Rolename + '\'' +
                ", 当前hp=" + Currenthp +
                ", 最大hp=" + maxhp +
                ", mp=" + mp +
                ", Atk=" + Atk +
                ", def=" + def +
                ", 经验值=" + exp +
                ", 等级=" + level +
                ", 力量=" + strength +
                ", 智力=" + intl +
                ", 速度=" + speed +
                ", 人物职业=" + RoleCareer +
                ", 人物武器=" + RoleWeapon +
                ", 人物衣服=" + RoleClothes +
                ", 技能=" + RoleSkill +
                ", 状态=" + state +
                '}';
    }
}
