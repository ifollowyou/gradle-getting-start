package net.petrikainulainen.gradle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Petri Kainulainen
 */
public class HelloWorld {

    private static final Logger log = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        MessageService messageService = new MessageService();

        String message = messageService.getMessage();
        log.info("Received message: " + message);
    }
}
