package design.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        //Instanciado somente por dentro da classe, não é possivel utilizar new Singleton

    }

    public static Singleton getSingleton(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}