package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.View;
public class ClearButtonController implements ActionListener {
    View view;
    public ClearButtonController(View view) {
        this.view = view;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        view.setArmorIDtoDefault();
        view.setResult("");
    }
}
