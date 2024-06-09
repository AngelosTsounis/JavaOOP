package gr.aueb.cf.oopProjects.chapter14HW;

public class Logger {
  private static final Logger INSTANCE = new Logger();

  private Logger() {}

    public static Logger getInstance() {
      return INSTANCE;
    }

    public void logMessage() {
        System.out.println("This is the Logger message");
    }
}
