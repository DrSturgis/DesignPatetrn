import design.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s = Singleton.getSingleton();
        Singleton l = Singleton.getSingleton();

        System.out.println(s == l);
    }
}