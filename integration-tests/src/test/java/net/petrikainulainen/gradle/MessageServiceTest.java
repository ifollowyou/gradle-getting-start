package net.petrikainulainen.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Petri Kainulainen
 */
public class MessageServiceTest {

    private MessageService messageService;

    @Before
    public void setUp() {
        System.out.println("准备测试。。");
        messageService = new MessageService();
    }

    @Test
    public void getMessage_ShouldReturnMessage() {
        assertEquals("Hello World!", messageService.getMessage());
    }
}
