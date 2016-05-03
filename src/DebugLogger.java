public class DebugLogger extends Logger{

    @Override
    public void logMessage(int level){
        if (level == Logger.DEBUG)
            System.out.println("THIS IS A DEBUG MESSAGE.");

        else{
            System.out.println("Debug doesn't handle.");
            if(nextLogger != null)
                nextLogger.logMessage(level);
        }
     }
}
