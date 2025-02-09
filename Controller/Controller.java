package Controller;

import Model.Armor;
import Model.ArmorDataBase;
import View.View;

public class Controller {
    View view;
    ArmorDataBase model;
    public Controller(View view,ArmorDataBase model) {
        this.view = view;
        this.model = model;
        view.addSubmitButtonListener(new SubmitButtonController(view, model));
        view.addClearButtonListener(new ClearButtonController(view));
        view.addRepairButtonListener(new RepairButtonController(view, model));
    }

}
