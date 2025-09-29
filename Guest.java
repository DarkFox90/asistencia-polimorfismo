public class Guest extends User {
      public Guest(String username, String password) {
        super(username, password);
    }

    @Override
    public String getMenu() {
        return """
                === Guest MENU ===
                1. Register
                2. salir
                """; 
    }
}
