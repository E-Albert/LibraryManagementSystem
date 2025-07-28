import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            new File("logs").mkdirs();
            Logger logger = Logger.getLogger("");
            FileHandler fh = new FileHandler("logs/lms-app.json", true);
            fh.setFormatter(new JsonFormatter()); // use your custom formatter
            logger.addHandler(fh);
        } catch (Exception e) {
            System.out.println("Failed to set up file logging.");
        }


        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
        libraryManagementSystem.menu();
    }
}
