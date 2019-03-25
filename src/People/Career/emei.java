package People.Career;

import People.Career.Career;
import People.Role;
import Skill.Skill;
import Skill.imp.EM1;
import Skill.imp.EM2;
import Skill.imp.EM3;

import java.util.ArrayList;
import java.util.List;

public class emei implements Career {

    private String Careername="��ü��";

    private int Atk=100;

    private int def=100;

    private int Strength=10;

    private int intl=20;

    private int speed=15;

    private List<Skill> skilllist=new ArrayList<>();

    public emei(){
        skilllist.add(new EM1());
        skilllist.add(new EM2());
        skilllist.add(new EM3());
    }

    @Override
    public List<Skill> getSkilllistl() {
        return skilllist;
    }

    @Override
    public Void getMpdescription() {
        System.out.println("�����ܸߵ����ɣ�ʹ�ö�ü��");
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
