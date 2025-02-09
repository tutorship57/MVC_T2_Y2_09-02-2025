package Model;

public class StralthArmorCheck implements ArmorCheck{
    public boolean QualityCheck(int armorDef) {
        if(armorDef < 50){
            return false ;
        }
        return true;
    }
}
