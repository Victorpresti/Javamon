package br.com.victor.sudoPokemon.player;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    Player player;

    @BeforeEach
    void setUp(){
        player = new Player();
    }

    @Test
    void testPlayer(){
        Assertions.assertEquals(player, new Player());
    }

}
