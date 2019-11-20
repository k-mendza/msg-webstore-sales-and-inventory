package msg.webstore.salesandinventory.service;

import msg.webstore.salesandinventory.MsgWebstoreSalesAndInventoryApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MsgServiceImpl implements MsgService {

    private static final Logger log = LoggerFactory.getLogger(MsgServiceImpl.class);
    private RabbitTemplate rabbitTemplate;

    @Autowired
    public MsgServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void sendMessage(String id) {
        Map<String, String> actionMap = new HashMap<>();
        actionMap.put("id", id);
        log.info("Sending the index request through queue message");
        rabbitTemplate.convertAndSend(MsgWebstoreSalesAndInventoryApplication.MESSAGE_QUEUE, actionMap);
    }
}
