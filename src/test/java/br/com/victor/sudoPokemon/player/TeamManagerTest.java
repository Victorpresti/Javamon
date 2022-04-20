package br.com.victor.sudoPokemon.player;

import br.com.victor.sudoPokemon.pokemon.Pokemon;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TeamManagerTest {

    TeamManager tm;

    @BeforeEach
    void setUp(){
        tm = new TeamManager();
    }

    @Test
    void testAdd(){
        List<Pokemon> team = new ArrayList<>();
        tm.add(new Pokemon(), team);
        Assertions.assertFalse(team.isEmpty());
    }

    @Test
    void testAddUpTo6(){
        List<Pokemon> team = new ArrayList<>();
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        Assertions.assertEquals(6, team.size());
    }

    @Test
    void testAddLimit(){
        List<Pokemon> team = new ArrayList<>();
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        tm.add(new Pokemon(), team);
        Assertions.assertEquals(6, team.size());
    }

    @Test
    void testRemove(){
        List<Pokemon> team = new ArrayList<>();
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon();
        tm.add(p1, team);
        tm.add(p2, team);
        Assertions.assertEquals(2, team.size());
        tm.remove(p1, team);
        Assertions.assertEquals(1, team.size());
    }

    @Test
    void testTryingToRemoveOnlyPokemon(){
        List<Pokemon> team = new ArrayList<>();
        Pokemon p1 = new Pokemon();
        tm.add(p1, team);
        Assertions.assertEquals(1, team.size());
        tm.remove(p1, team);
        Assertions.assertEquals(1, team.size());
        Assertions.assertTrue(team.contains(p1));
    }
}
