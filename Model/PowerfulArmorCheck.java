package Model;

public class PowerfulArmorCheck implements ArmorCheck{

    public boolean QualityCheck(int armorDef) {
        if(armorDef < 70){
            return false ;
        }
        return true;
    }
}
    

