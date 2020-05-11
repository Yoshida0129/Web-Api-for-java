import Controllers.UserController;
public class App {
    public static void main(String[] args) throws Exception {
        new UserController().createUser("test boy");
    }
}
