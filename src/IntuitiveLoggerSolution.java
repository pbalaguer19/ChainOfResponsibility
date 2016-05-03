public class IntuitiveLoggerSolution{
  /*
   * Una possible solucio intuitiva del problema plantejat
   * sense utilitzar el patró de Cadena de Responsabilitats.
   */

   public static final int DEBUG = 1;
   public static final int INFO = 2;
   public static final int WARNING = 3;
   public static final int ERROR = 4;

   private int level;

   public IntuitiveLoggerSolution(int level){
     this.level = level;
   }

   public void logMessage(int level){
    //Solament escriurem si el Nivell és major del que hem indicat
    if (level >= this.level)
       writeMessage(level);
    }

    private void writeMessage(int level){
      switch (level) {
        case this.DEBUG:
            System.out.println("This is a DEBUG message");
            break;
        case this.INFO:
            System.out.println("This is a INFO message");
            break;
        case this.WARNING:
            System.out.println("This is a WARNING message");
            break;
        case this.ERROR:
            System.out.println("This is a ERROR message");
            break;
      }
    }
}
