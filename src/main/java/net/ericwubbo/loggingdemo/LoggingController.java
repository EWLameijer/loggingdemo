package net.ericwubbo.loggingdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.*;

@RestController
public class LoggingController {

    java.util.logging.Logger nativeLogger = java.util.logging.Logger.getLogger("net.ericwubbo.loggingdemo;");

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping
    public String index() {

        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        nativeLogger.finest("A (native) FINEST Message");
        nativeLogger.finer("A (native) FINER Message");
        nativeLogger.fine("A (native) FINE Message");
        nativeLogger.config("A (native) CONFIG Message");
        nativeLogger.info("An (native) INFO Message");
        nativeLogger.warning("A (native) WARNING Message");
        nativeLogger.severe("A (native) SEVERE Message");

        return "Howdy! Check out the Logs to see the output...";
    }
}
