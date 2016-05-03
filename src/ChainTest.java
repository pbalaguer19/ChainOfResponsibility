public class ChainTest{

   private static Logger getChainOfLoggers(){

      Logger errorLogger = new ErrorLogger();
      Logger warnLogger = new WarnLogger();
      Logger infoLogger = new InfoLogger();
      Logger debugLogger = new DebugLogger();

      errorLogger.setNextLogger(warnLogger);
      warnLogger.setNextLogger(infoLogger);
      infoLogger.setNextLogger(debugLogger);

      return errorLogger;
   }

   public static void main(String[] args) {
      Logger loggerChain = getChainOfLoggers();

      System.out.println("***** TEST 1: DEBUG *****");
      loggerChain.logMessage(Logger.DEBUG);

      System.out.println();
      System.out.println("***** TEST 2: INFO *****");
      loggerChain.logMessage(Logger.INFO);

      System.out.println();
      System.out.println("***** TEST 3: WARN *****");
      loggerChain.logMessage(Logger.WARNING);

      System.out.println();
      System.out.println("***** TEST 4: ERROR *****");
      loggerChain.logMessage(Logger.ERROR);
   }
}
