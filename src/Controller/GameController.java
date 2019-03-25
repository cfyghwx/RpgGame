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
        System.out.println("��ӭ����������Ϸ���������������");
        Scanner i=new Scanner(System.in);
        String username=i.nextLine();
        while (checkmgc(username)){
            System.out.println("�������id�������дʣ�����������");
            username=i.nextLine();
        }
        System.out.println("����ɹ�");
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
        System.out.println("ѡ��ְҵ��1.�����ɣ�2.��ü�ɣ�3.����");
        String flag=scan.nextLine();
        Role r=null;
        switch (flag){
            case "1":
                r=Role.getRole(username,new shaolin());
                System.out.println("��ϲ������"+r.getRoleCareer().toString());
                break;
            case "2":
                r=Role.getRole(username,new emei());
                System.out.println("��ϲ������"+r.getRoleCareer().toString());
                break;
            case "3":
                r=Role.getRole(username,new tangmen());
                System.out.println("��ϲ������"+r.getRoleCareer().toString());
                break;
            default:
                System.out.println("������Ч�����ѡ��");
        }
        return r;
    }

    public int selectaction(Role r,Scanner scanner){
        int flag=1;
        System.out.println("���������ִ�����Ҫ�����ж���1.������,2.�鿴����״̬��3.��������װ����4" +
                "�������ַ��ߣ�5.��������������6.�������ɷ��ߣ�7.��������,8.�˳�");
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
                System.out.println("�����ɹ�,��ǰ����"+r.getRoleWeapon().toString()+"����ǰ����������"+r.getRoleWeapon().getAtk());

                break;
            case "4":
                r.setRoleClothes(new freshClothes());
                System.out.println("�����ɹ�,��ǰ����"+r.getRoleClothes().toString()+"����ǰ���߷�����"+r.getRoleClothes().getDef());
                break;
            case "5":
                if (r.getRoleCareer().toString().equals("������")){
                    r.setRoleWeapon(new SL_gun());
                }
                if (r.getRoleCareer().toString().equals("��ü��")){
                    r.setRoleWeapon(new EM_Chi());
                }
                if (r.getRoleCareer().toString().equals("����")){
                    r.setRoleWeapon(new TM_Biao());
                }
                System.out.println("�����ɹ�,��ǰ����"+r.getRoleWeapon().toString()+"����ǰ����������"+r.getRoleWeapon().getAtk());
                break;
            case "6":
                r.setRoleClothes(new superiorClothes());
                System.out.println("�����ɹ�,��ǰ����"+r.getRoleClothes().toString()+"����ǰ���߷�����"+r.getRoleClothes().getDef());
                break;
            case "7":
                r.getRoleWeapon().levelup();
                System.out.println("����ɹ�����ǰ����������"+r.getRoleWeapon().getAtk());
                break;
            default:
                flag =0;

        }
        return flag;
    }

}
