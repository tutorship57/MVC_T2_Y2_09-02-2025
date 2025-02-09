package Model;

public class Armor {
    String armorId;
    String armorType;
    int armorDef;
    ArmorCheck armorCheck;
    public Armor(String armorId, String armorType, int armorDef) {
        this.armorId = armorId;
        this.armorType = armorType;
        this.armorDef = armorDef;
        setArmorCheck(armorType); 
    }
    public void setArmorCheck(String armorType) { // เเปลง Code เพื่อเชคเงื่อนไขตาม ArmorType
        if(armorType.equals("Powerful")){
            armorCheck = new PowerfulArmorCheck();
        }
        if(armorType.equals("Conceal")){
            armorCheck = new ConcealArmorCheck();
        }
        if(armorType.equals("Stralth")){
            armorCheck = new StralthArmorCheck();
        }
    }
    
    public String getArmorId() {
        return armorId;
    }
    public String getArmorType() {
        return armorType;
    }
    public int getArmorDef() {
        return armorDef;
    }
    public boolean QualityCheck(){ // ตรวจสอบ คุณภาพของเกราะตามประเภทชุดเกราะ 
        return armorCheck.QualityCheck(armorDef);
    }
    public void RepairArmorDefence(){  // ปรับค่าพลังของชุดเกราะ ถ้าไม่ได้มาตรฐาน
        if(armorDef >75){ // ตรวจสอบเนื่องจากชุดเกราะ มีค่าสูงสุด100 
            armorDef = 100;
            return;
        }
        armorDef += 25 ;
    }
}
