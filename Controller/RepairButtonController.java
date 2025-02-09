package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.View;
import Model.Armor;
import Model.ArmorDataBase;
public class RepairButtonController implements ActionListener{
    private View view;
    private ArmorDataBase model;
    RepairButtonController(View view,ArmorDataBase model){
        this.view = view;
        this.model = model;
    }

    public void actionPerformed(ActionEvent e) {
        String ArmorID = view.getArmorID();
        Armor armor = model.getArmorID(ArmorID);
        ArmorRepair(armor);
    }
    public void ArmorRepair(Armor armor){
        int beforeUpgrade = armor.getArmorDef();
        armor.RepairArmorDefence();
        view.setResult(" Armor has been repaired " + "upgrade defence from "+ beforeUpgrade + " to " +armor.getArmorDef());
        view.setRepairButtonInvisible();
    }
}
