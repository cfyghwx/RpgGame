package People.Career;

import People.Career.Career;
import People.Role;
import Skill.Skill;

import java.util.List;

public class emei implements Career {

    private String Careername="峨眉派";

    private int Atk=100;

    private int def=100;

    private int Strength=10;

    private int intl=20;

    private int speed=15;

    private List<Skill> skilllistl;

    public emei(){
        // TODO: 2019/3/24 把技能加进去
    }


    public List<Skill> getSkilllistl() {
        return skilllistl;
    }

    @Override
    public Void getMpdescription() {
        System.out.println("智力很高的门派，使用峨眉刺");
        return null;
    }

    @Override
    public Role addshuxing(Role role) {
        role.setAtk(role.getAtk()+this.Atk);
        role.setDef(role.getDef()+this.def);
        role.setStrength(role.getStrength()+this.Strength);
        role.setIntl(role.getIntl()+this.intl);
        role.setSpeed(role.getSpeed()+this.speed);
        return role;
    }

    @Override
    public String toString() {
        return Careername;
    }
}
