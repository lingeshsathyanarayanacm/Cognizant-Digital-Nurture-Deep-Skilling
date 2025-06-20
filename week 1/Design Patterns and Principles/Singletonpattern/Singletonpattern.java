class Logger{
    private static Logger instance;
    private Logger(){

    }
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String msg){
        System.out.println("log message: "+msg);
    }
}
public class Singletonpattern {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if(logger1==logger2){
            System.out.println("both logger is same...");
        }
        else{
            System.out.println("Both loggers are different");
        }
        logger1.log("This is a log message.");
        logger2.log("This is another log message.");
    }
}