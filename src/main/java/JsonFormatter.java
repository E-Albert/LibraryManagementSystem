import java.util.logging.*;
import java.util.Date;

public class JsonFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return String.format(
                "{ \"timestamp\": \"%1$tF %1$tT\", \"level\": \"%2$s\", \"logger\": \"%3$s\", \"message\": \"%4$s\" }%n",
                new Date(record.getMillis()),
                record.getLevel().getName(),
                record.getLoggerName(),
                record.getMessage().replace("\"", "\\\"")
        );
    }
}
