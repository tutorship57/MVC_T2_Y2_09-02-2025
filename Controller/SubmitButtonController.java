package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.View;
import Model.Armor;
import Model.ArmorDataBase;
public class SubmitButtonController implements ActionListener {
    private View view;
    private ArmorDataBase model;
    public SubmitButtonController(View view,ArmorDataBase model) {
        this.view = view;
        this.model = model;
    }
    public void actionPerformed(ActionEvent e) {
        String ArmorID = view.getArmorID();
        if(!isValidArmorID(ArmorID)){ // เช็ครูปเเบบของ Input ว่าตรงตามเงื่อนไขเบื้องต้นไหม
            view.setResult(ArmorID + " is not a valid Armor ID");
            return ;
        }
        Armor armor = model.getArmorID(ArmorID);
        if(armor == null){// ตรวจสอบว่า ArmorID มีอยู่ในฐานข้อมูลหรือไม่
            view.setResult(ArmorID + "no ArmorID exists");
            return ;
        }
        if(!armor.QualityCheck()){// ตรวจสอบ Quality ของ Armor ที่ไม่ได้มาตรฐาน
            view.setResult(" This Armor is not Ready to use ");
            view.setRepairButtonVisible(); // เเสดงปุ่ม Repair ให้เพื่อซ่อมชุดเกราะ
            return ;
        }
        view.setResult(" This Armor is Ready to use ");

    }
    public boolean isValidArmorID(String ArmorID){ 
        return ArmorID.length() == 6 && ArmorID.matches("[1-9]\\d*");
    }
}
