package Model;

import java.util.ArrayList;
import java.lang.Math;
public class ArmorDataBase {
    ArrayList<Armor> ArmorDataBase ;
    int PowerfulCount = 0;
    int ConcealCount = 0;
    int StralthCount = 0;
    public ArmorDataBase(){
        ArmorDataBase = new ArrayList<>();
        addArmor();
    }

    private void addArmor(){
        for (int i = 0; i < 50; i++) {
            int randomDef = (int)(Math.random() * 100);
            if(PowerfulCount <10){
                ArmorDataBase.add(new Armor("10000"+i,"Powerful",randomDef));
                System.out.println("10000"+i + " Powerfularmor Create " + "this is value of Defence rate" + randomDef);
                PowerfulCount++;
            }else if(ConcealCount < 20) {
                ArmorDataBase.add(new Armor("2000"+i,"Conceal",randomDef));
                System.out.println("2000"+i + " Conceal armorCreate " + "this is value of Defence rate" + randomDef);
                ConcealCount++;
            }else{
                ArmorDataBase.add(new Armor("3000"+i,"Stralth",randomDef));
                System.out.println("3000"+i + " Stralth armorCreate " + "this is value of Defence rate" + randomDef);
                StralthCount++;
            }
        }
        
    }
    public Armor getArmorID(String ArmorID){
        for (int i = 0; i < ArmorDataBase.size(); i++) {
            if(ArmorDataBase.get(i).armorId.equals(ArmorID)){
                return ArmorDataBase.get(i);
            }
        }
        return null;
    }
}
