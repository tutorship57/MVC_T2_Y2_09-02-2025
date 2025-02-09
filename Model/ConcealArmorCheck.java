package Model;

public class ConcealArmorCheck implements ArmorCheck{


    public boolean QualityCheck(int armorDef) {
        if(armorDef %10 == 3 || armorDef %10 == 7){
            return false ;
        }
        return true;
    }
}
