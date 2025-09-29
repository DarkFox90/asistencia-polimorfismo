public class Main {
    public static void main(String[] args) {
         
        View vista = new View();
        AuthController controller = new AuthController(vista);

        controller.start();

        
    }
}