package Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SocialHandleTest {

    private SocialHandle socialHandle;

    @BeforeEach
    public void setUp() {
        socialHandle = new SocialHandle();
    }

    @Test
    public void createHandleTest() {
        String handle = socialHandle.createHandle("hello123");
        assertEquals("@hello123", handle, "Handle should be prefixed with '@' and be lowercase.");
    }

    @Test
    public void checkHandleLessThan9CharactersTest() {
        String handle = socialHandle.createHandle("short");
        assertEquals("@short", handle, "Handle should be created as '@short' for input 'short'.");
    }
    @Test
    public void addHandleTest() {
        socialHandle.addHandle("hello123");
        socialHandle.addHandle("hello123");
        assertEquals(1, socialHandle.getHandles().size(), "The handle should only be added once.");
    }

    @Test
    public void removeHandleTest() {
        socialHandle.addHandle("goodbye123");
        socialHandle.removeHandle("goodbye123");
        assertEquals(0, socialHandle.getHandles().size(), "The handle should be removed.");
    }
}