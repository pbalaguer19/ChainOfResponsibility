public class WarnLogger extends Logger{

    @Override
    public void logMessage(int level){
        if (level == Logger.WARNING)
            System.out.println("THIS IS A WARNING MESSAGE.");

        else{
            System.out.println("Warning doesn't handle.");
            if(nextLogger != null)
                nextLogger.logMessage(level);
        }
     }
}
