public class InfoLogger extends Logger{

    @Override
    public void logMessage(int level){
        if (level == Logger.INFO)
            System.out.println("THIS IS A INFO MESSAGE.");

        else{
            System.out.println("Info doesn't handle.");
            if(nextLogger != null)
                nextLogger.logMessage(level);
        }
     }
}
