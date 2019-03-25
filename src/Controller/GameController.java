package Controller;

import Equipment.Clothes.imp.freshClothes;
import Equipment.Clothes.imp.superiorClothes;
import Equipment.Weapon.imp.EM_Chi;
import Equipment.Weapon.imp.SL_gun;
import Equipment.Weapon.imp.TM_Biao;
import Equipment.Weapon.imp.freshWeapon;
import Filter.Filter1;
import Filter.Filter2;
import People.Career.emei;
import People.Career.shaolin;
import People.Career.tangmen;
import People.Role;

import java.util.Scanner;

public class GameController {

    public void gogame(){
        System.out.println("欢迎您来到本游戏，请输入你的名字");
        Scanner i=new Scanner(System.in);
        String username=i.nextLine();
        while (checkmgc(username)){
            System.out.println("您输入的id包含敏感词，请重新输入");
            username=i.nextLine();
        }
        System.out.println("输入成功");
        Role r=getrole(username,i);
        while (r==null){
            r=getrole(username,i);
        }
        int t=1;
        while (t==1){
            selectaction(r,i);
        }


    }
    public boolean checkmgc(String name){
        Filter1 f1=new Filter1();
        Filter2 f2=new Filter2();
        return f1.hasanyMGC(name)||f2.hasanyMGC(name);

    }

    public Role getrole(String username,Scanner scan){
        System.out.println("选择职业：1.少林派，2.峨眉派，3.唐门");
        String flag=scan.nextLine();
        Role r=null;
        switch (flag){
            case "1":
                r=Role.getRole(username,new shaolin());
                System.out.println("恭喜您加入"+r.getRoleCareer().toString());
                break;
            case "2":
                r=Role.getRole(username,new emei());
                System.out.println("恭喜您加入"+r.getRoleCareer().toString());
                break;
            case "3":
                r=Role.getRole(username,new tangmen());
                System.out.println("恭喜您加入"+r.getRoleCareer().toString());
                break;
            default:
                System.out.println("输入无效请从新选择");
        }
        return r;
    }

    public int selectaction(Role r,Scanner scanner){
        int flag=1;
        System.out.println("请输入数字代表你要做的行动：1.外出逛逛,2.查看人物状态，3.更换新手装备，4" +
                "更换新手防具，5.更换门派武器，6.更换门派防具，7.锻造武器,8.退出");
        String i =scanner.nextLine();
        switch (i){
            case "1":
                System.out.println("111");
                break;
            case "2":
                System.out.println(r.toString());
                break;
            case "3":
                freshWeapon fw=new freshWeapon();
                r.setRoleWeapon(fw);
                System.out.println("更换成功,当前武器"+r.getRoleWeapon().toString()+"，当前武器攻击力"+r.getRoleWeapon().getAtk());

                break;
            case "4":
                r.setRoleClothes(new freshClothes());
                System.out.println("更换成功,当前防具"+r.getRoleClothes().toString()+"，当前防具防御力"+r.getRoleClothes().getDef());
                break;
            case "5":
                if (r.getRoleCareer().toString().equals("少林派")){
                    r.setRoleWeapon(new SL_gun());
                }
                if (r.getRoleCareer().toString().equals("峨眉派")){
                    r.setRoleWeapon(new EM_Chi());
                }
                if (r.getRoleCareer().toString().equals("唐门")){
                    r.setRoleWeapon(new TM_Biao());
                }
                System.out.println("更换成功,当前武器"+r.getRoleWeapon().toString()+"，当前武器攻击力"+r.getRoleWeapon().getAtk());
                break;
            case "6":
                r.setRoleClothes(new superiorClothes());
                System.out.println("更换成功,当前防具"+r.getRoleClothes().toString()+"，当前防具防御力"+r.getRoleClothes().getDef());
                break;
            case "7":
                r.getRoleWeapon().levelup();
                System.out.println("锻造成功，当前武器攻击力"+r.getRoleWeapon().getAtk());
                break;
            default:
                flag =0;

        }
        return flag;
    }

}
