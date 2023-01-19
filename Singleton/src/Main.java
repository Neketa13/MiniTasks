public class Main {
    public static void main(String[] args) throws Exception {
        Singleton connection = Singleton.getInstance();
        System.out.println(connection);
    }
}