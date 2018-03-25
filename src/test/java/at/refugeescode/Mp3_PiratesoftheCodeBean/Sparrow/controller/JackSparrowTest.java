package at.refugeescode.Mp3_PiratesoftheCodeBean.Sparrow.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class JackSparrowTest {

    @Autowired
    private JackSparrow jackSparrow;

    @Test
    void findCursedCoin() {
        String message = jackSparrow.findCursedCoin();
        assertEquals("I found it!", message);
    }
}