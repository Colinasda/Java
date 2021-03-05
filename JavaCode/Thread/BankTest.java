package Thread;

//懒汉式，同步操作

public class BankTest {
}

class Bank{
    private Bank(){};

    private static Bank instance = null;

    public static synchronized Bank getInstance(){
        if(instance == null){
            instance = new Bank();
        }
        return instance;
    }
}