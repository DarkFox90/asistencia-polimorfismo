public class RegularUser extends User{

     public RegularUser(String username, String password) {
        super(username, password);
    }

    @Override
    public String getMenu() {
        return """
                === usuario MENU ===
                1. Reporte de Ventas
                2. Reporte de compras
                3. Salir
                """; 
    }
}
