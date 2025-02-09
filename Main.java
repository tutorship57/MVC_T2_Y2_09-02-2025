import View.View;
import Model.ArmorDataBase;
import Controller.Controller;
public class Main {
    public static void main(String[] args) {
        View view = new View();
        ArmorDataBase model = new ArmorDataBase();
        Controller controller = new Controller(view, model);
        view.setVisible(true);
    }
}
