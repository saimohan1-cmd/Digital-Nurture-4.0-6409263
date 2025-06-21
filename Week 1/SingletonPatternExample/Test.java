package SingletonPatternExample;

class Logger {
    private static Logger log;
    private Logger(){
        System.out.println("Instance created");
    }
    public static Logger getInstance(){
        if(log == null){
            log = new Logger();
        }
        return log;
    }
    public void msg(String user){
        System.out.println("Welcome " + user);
    }
}
public class Test{
    public static void main(String[] args) {
        Logger user1 = Logger.getInstance();
        Logger user2 = Logger.getInstance();
        if(user1 == user2){
            System.out.println("Only one instance is created");
        }
        else{
            System.out.println("Two instances are created");
        }

    }
}
