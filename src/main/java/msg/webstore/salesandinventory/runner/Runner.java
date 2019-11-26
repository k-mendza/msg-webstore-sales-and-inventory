package msg.webstore.salesandinventory.runner;

import msg.webstore.salesandinventory.service.MsgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Runner.class);

    @Autowired
    private MsgService msgService;

    @Override
    public void run(String... args) {
        log.info("Runner started");
        msgService.sendMessage("1", "Kate");
        msgService.sendMessage("2", "John");
        msgService.sendMessage("3", "Marry");
        msgService.sendMessage("4", "Frank");
        msgService.sendMessage("5", "Steve");
    }
}
