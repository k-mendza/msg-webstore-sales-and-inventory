package msg.webstore.salesandinventory.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MsgListener {

    private static final Logger log = LogManager.getLogger(MsgListener.class);

    private void receiveMessage(Map<String, String> message) {
        log.info("Received msg: " + message);
    }
}
