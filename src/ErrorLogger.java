public class ErrorLogger extends Logger{

    @Override
    public void logMessage(int level){
        if (level == Logger.ERROR)
            System.out.println("THIS IS A ERROR MESSAGE.");

        else{
            System.out.println("Error doesn't handle.");
            if(nextLogger != null)
                nextLogger.logMessage(level);
        }
     }
}
