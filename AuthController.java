
import java.util.ArrayList;

public class AuthController {
    
    private ArrayList<User> users = new ArrayList<>();
    private View view;
    private boolean run;

    public AuthController(View view) {
        this.view = view;
        this.run = true;
    }

    public void start() {
        while(this.run) {
            view.showMainMenu();
            int choice = view.askOption("selecciona una opcion: ");

            switch (choice) {
                case 1:
                    this.register();
                    break;
                case 2:
                    this.login();
                    break;
                case 3:
                    this.run = false;
                    break;
                default:
                    this.view.showMessage("Opcion invalida");
                    break;
            }
        }
    }

    public void register() {
        String username = this.view.askUsername();
        String password = this.view.askPassword();
        int role = this.view.askRole();

        // if(role == 1) {
        //     User a = new Admin(username, password);
        // } else if(role == 2) {
        //     User a = new RegularUser(username, password);
        // } else {
        //     User g = new Guest(username, password);
        // }

        User newUser;
        switch (role) {
            case 1 -> newUser = new Admin(username, password);
            case 2 -> newUser = new RegularUser(username, password);
            default -> newUser = new Guest(username, password);
        }
    }

    public void login() {
        System.out.println("seleccionaste login");
    }

}
