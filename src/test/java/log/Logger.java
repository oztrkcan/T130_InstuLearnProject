package log;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static String logFile= "target/logged.log";

    public Logger() {
        this.logFile = logFile;
    }

    private static void log(String level, String message) {
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String logMessage = String.format("[%s] %s: %s", timeStamp, level, message);


        // File log
        try (FileWriter writer = new FileWriter(logFile, true)) {
            writer.write(logMessage + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Could not write to log file: " + e.getMessage());
        }
    }

    public static void info(String message) {
        log("INFO", message);
    }

    public static void debug(String message) {
        log("DEBUG", message);
    }

    public static void warn(String message) {
        log("WARN", message);
    }

    public static void error(String message) {
        log("ERROR", message);
    }
}

