package br.com.victor.sudoPokemon.pokemon;

import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.bug.BugEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.dark.DarkEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.dragon.DragonEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.electric.ElectricEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.fairy.FairyEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.fighting.FightingEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.fire.FireEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.flying.FlyingEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ghost.GhostEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.grass.GrassEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ground.GroundEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.ice.IceEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.normal.NormalEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.poison.PoisonEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.psychic.PsychicEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.rock.RockEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.steel.SteelEffectiveness;
import br.com.victor.sudoPokemon.pokemon.strengthsWeaknesses.water.WaterEffectiveness;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.List;

/*
This class generates every single Pokemon based on Generation
 */
@Log
public class PokemonGenerator {

    private final List<Pokemon> generationOne = new ArrayList<>();
    private final List<Pokemon> generationTwo = new ArrayList<>();
    private final List<Pokemon> generationThree = new ArrayList<>();
    private final List<Pokemon> generationFour = new ArrayList<>();
    private final List<Pokemon> generationFive = new ArrayList<>();
    private final List<Pokemon> generationSix = new ArrayList<>();
    private final List<List<Pokemon>> generatedPokemon = new ArrayList<>();

    /*
    You can choose which generations you wanna generate
     */
    public List<List<Pokemon>> generatePokemon(int gen){
        switch (gen){
            case 0:
                log.info("Generating every generation of Pokemon");
                generatedPokemon.add(generateGenOne());
                log.info("Succesfully generated");
                break;
            case 1:
                log.info("Generating Gen 1");
                generatedPokemon.add(generateGenOne());
                log.info("Succesfully generated");
                break;
        }
        return generatedPokemon;
    }

    private final BugEffectiveness bug = new BugEffectiveness();
    private final DarkEffectiveness dark = new DarkEffectiveness();
    private final DragonEffectiveness dragon = new DragonEffectiveness();
    private final ElectricEffectiveness electric = new ElectricEffectiveness();
    private final FairyEffectiveness fairy = new FairyEffectiveness();
    private final FightingEffectiveness fighting = new FightingEffectiveness();
    private final FireEffectiveness fire = new FireEffectiveness();
    private final FlyingEffectiveness flying = new FlyingEffectiveness();
    private final GhostEffectiveness ghost = new GhostEffectiveness();
    private final GrassEffectiveness grass = new GrassEffectiveness();
    private final GroundEffectiveness ground = new GroundEffectiveness();
    private final IceEffectiveness ice = new IceEffectiveness();
    private final NormalEffectiveness normal = new NormalEffectiveness();
    private final PoisonEffectiveness poison = new PoisonEffectiveness();
    private final PsychicEffectiveness psychic = new PsychicEffectiveness();
    private final RockEffectiveness rock = new RockEffectiveness();
    private final SteelEffectiveness steel = new SteelEffectiveness();
    private final WaterEffectiveness water = new WaterEffectiveness();

    private List<Pokemon> generateGenOne(){
        generationOne.add(new Pokemon(1, "Bulbasaur", Type.GRASS, Type.POISON, grass.grassPoison(), new Stats(1, 45, 49, 49, 65, 65, 45)));
        generationOne.add(new Pokemon(2, "Ivysaur", Type.GRASS, Type.POISON, grass.grassPoison(), new Stats(1, 60, 62, 63, 80, 80, 60)));
        generationOne.add(new Pokemon(3, "Venusaur", Type.GRASS, Type.POISON, grass.grassPoison(), new Stats(1, 80, 82, 83, 100, 100, 80)));
        generationOne.add(new Pokemon(4, "Charmander", Type.FIRE, fire.fire(), new Stats(1, 39, 52, 43, 60, 50, 65)));
        generationOne.add(new Pokemon(5, "Charmeleon", Type.FIRE, fire.fire(), new Stats(1, 58, 64, 58, 80, 65, 80)));
        generationOne.add(new Pokemon(6, "Charizard", Type.FIRE, Type.FLYING, fire.fireFlying(), new Stats(1, 78, 84, 78, 109, 85, 100)));
        generationOne.add(new Pokemon(7, "Squirtle", Type.WATER, water.water(), new Stats(1, 44, 48, 65, 50, 64, 43)));
        generationOne.add(new Pokemon(8, "Wartortle", Type.WATER, water.water(), new Stats(1, 59, 63, 80, 65, 80, 58)));
        generationOne.add(new Pokemon(9, "Blastoise", Type.WATER, water.water(), new Stats(1, 79, 83, 100, 85, 105, 78)));
        generationOne.add(new Pokemon(10, "Caterpie", Type.BUG, bug.bug(), new Stats(1, 45, 30, 35, 20, 20, 45)));
        generationOne.add(new Pokemon(11, "Metapod", Type.BUG, bug.bug(), new Stats(1, 50, 20, 55, 25, 25, 30)));
        generationOne.add(new Pokemon(12, "Buterfree", Type.BUG, Type.FLYING, bug.bugFlying(), new Stats(1, 60, 45, 50, 90, 80, 70)));
        generationOne.add(new Pokemon(13, "Weedle", Type.BUG, Type.POISON, bug.bugPoison(), new Stats(1, 40, 35, 30, 20, 20, 50)));
        generationOne.add(new Pokemon(14, "Kakuna", Type.BUG, Type.POISON, bug.bugPoison(), new Stats(1, 45, 25, 50, 25, 25, 35)));
        generationOne.add(new Pokemon(15, "Beedrill", Type.BUG, Type.POISON, bug.bugPoison(), new Stats(1, 65, 90, 40, 45, 80, 75)));
        generationOne.add(new Pokemon(16, "Pidgey", Type.NORMAL, Type.FLYING, flying.flyingNormal(), new Stats(1, 40, 45, 40, 35, 35, 56)));
        generationOne.add(new Pokemon(17, "Pidgeotto", Type.NORMAL, Type.FLYING, flying.flyingNormal(), new Stats(1, 63, 60, 55, 50, 50, 71)));
        generationOne.add(new Pokemon(18, "Pidgeot", Type.NORMAL, Type.FLYING, flying.flyingNormal(), new Stats(1, 83, 80, 75, 70, 70, 101)));
        generationOne.add(new Pokemon(19, "Rattata", Type.NORMAL, normal.normal(), new Stats(1, 30, 56, 35, 25, 35, 72)));
        generationOne.add(new Pokemon(20, "Raticate", Type.NORMAL, normal.normal(), new Stats(1, 55, 81, 60, 50, 70, 97)));
        generationOne.add(new Pokemon(21, "Spearow", Type.NORMAL, Type.FLYING, flying.flyingNormal(), new Stats(1, 40, 60, 30, 31, 31, 70)));
        generationOne.add(new Pokemon(22, "Fearow", Type.NORMAL, Type.FLYING, flying.flyingNormal(), new Stats(1, 65, 90, 65, 61, 61, 100)));
        generationOne.add(new Pokemon(23, "Ekans", Type.POISON, poison.poison(), new Stats(1, 35, 60, 44, 40, 54, 55)));
        generationOne.add(new Pokemon(24, "Arbok", Type.POISON, poison.poison(), new Stats(1, 60, 95, 69, 65, 79, 80)));
        generationOne.add(new Pokemon(25, "Pikachu", Type.ELECTRIC, electric.electric(), new Stats(1, 35, 55, 40, 50, 50, 90)));
        generationOne.add(new Pokemon(26, "Raichu", Type.ELECTRIC, electric.electric(), new Stats(1, 60, 90, 55, 90, 80, 110)));
        generationOne.add(new Pokemon(27, "Sandshrew", Type.GROUND, ground.ground(), new Stats(1, 50, 75, 85, 20, 30, 40)));
        generationOne.add(new Pokemon(28, "Sandslash", Type.GROUND, ground.ground(), new Stats(1, 75, 100, 110, 45, 55, 65)));
        generationOne.add(new Pokemon(29, "NidoranFe", Type.POISON, poison.poison(), new Stats(1, 55, 47, 50, 40, 40, 41)));
        generationOne.add(new Pokemon(30, "Nidorina", Type.POISON, poison.poison(), new Stats(1, 70, 62, 67, 55, 55, 56)));
        generationOne.add(new Pokemon(31, "Nidoqueen", Type.POISON, Type.GROUND, poison.poisonGround(), new Stats(1, 90, 92, 87, 75, 85, 76)));
        generationOne.add(new Pokemon(32, "Nidoran", Type.POISON, poison.poison(), new Stats(1, 46, 57, 40, 40, 40, 50)));
        generationOne.add(new Pokemon(33, "Nidorino", Type.POISON, poison.poison(), new Stats(1, 61, 72, 57, 55, 55, 65)));
        generationOne.add(new Pokemon(34, "Nidoking", Type.POISON, Type.GROUND, poison.poisonGround(), new Stats(1, 81, 102, 77, 85, 75, 85)));
        generationOne.add(new Pokemon(35, "Clefairy", Type.FAIRY, fairy.fairy(), new Stats(1, 70, 45, 48, 60, 65, 35)));
        generationOne.add(new Pokemon(36, "Clefable", Type.FAIRY, fairy.fairy(), new Stats(1, 95, 70, 73, 95, 90, 60)));
        generationOne.add(new Pokemon(37, "Vulpix", Type.FIRE, fire.fire(), new Stats(1, 38, 41, 40, 50, 65, 65)));
        generationOne.add(new Pokemon(38, "Ninetales", Type.FIRE, fire.fire(), new Stats(1, 73, 76, 75, 81, 100, 100)));
        generationOne.add(new Pokemon(39, "Jigglypuff", Type.NORMAL, Type.FAIRY, normal.normalFairy(), new Stats(1, 115, 45, 20, 45, 25, 20)));
        generationOne.add(new Pokemon(40, "Wigglytuff", Type.NORMAL, Type.FAIRY, normal.normalFairy(), new Stats(1, 140, 70, 45, 85, 50, 45)));
        generationOne.add(new Pokemon(41, "Zubat", Type.POISON, Type.FLYING, poison.poisonFlying(), new Stats(1, 40, 45, 35, 30, 40, 55)));
        generationOne.add(new Pokemon(42, "Golbat", Type.POISON, Type.FLYING,poison.poisonFlying(), new Stats(1, 75, 80, 70, 65, 75, 90)));
        generationOne.add(new Pokemon(43, "Oddish", Type.GRASS, Type.POISON, grass.grassPoison(), new Stats(1, 45, 50, 55, 75, 65, 30)));
        generationOne.add(new Pokemon(44, "Gloom", Type.GRASS, Type.POISON, grass.grassPoison(), new Stats(1, 60, 65, 70, 85, 75, 40)));
        generationOne.add(new Pokemon(45, "Vileplume", Type.GRASS, Type.POISON, grass.grassPoison(), new Stats(1, 75, 80, 85, 110, 90, 50)));
        generationOne.add(new Pokemon(46, "Paras", Type.BUG, Type.GRASS, bug.bugGrass(), new Stats(1, 35, 70, 55, 45, 55, 25)));
        generationOne.add(new Pokemon(47, "Parasect", Type.BUG, Type.GRASS, bug.bugGrass(), new Stats(1, 60, 95, 80, 60, 80, 30)));
        generationOne.add(new Pokemon(48, "Venonat", Type.BUG, Type.POISON, bug.bugPoison(), new Stats(1, 60, 55, 50, 40, 55, 45)));
        generationOne.add(new Pokemon(49, "Venomoth", Type.BUG, Type.POISON, bug.bugPoison(), new Stats(1, 70, 65, 60, 90, 75, 90)));
        generationOne.add(new Pokemon(50, "Digglet", Type.GROUND, ground.ground(), new Stats(1, 10, 55, 25, 35, 45, 95)));
        generationOne.add(new Pokemon(51, "Dugtrio", Type.GROUND, ground.ground(), new Stats(1, 35, 100, 50, 50, 70, 120)));
        generationOne.add(new Pokemon(52, "Meowth", Type.NORMAL, normal.normal(), new Stats(1, 40, 45, 35, 40, 40, 90)));
        generationOne.add(new Pokemon(53, "Persian", Type.NORMAL, normal.normal(), new Stats(1, 65, 70, 60, 65, 65, 115)));
        generationOne.add(new Pokemon(54, "Psyduck", Type.WATER, water.water(), new Stats(1, 50, 52, 48, 65, 50, 55)));
        generationOne.add(new Pokemon(55, "Golduck", Type.WATER, water.water(), new Stats(1, 80, 82, 78, 95, 80, 85)));
        generationOne.add(new Pokemon(56, "Mankey", Type.FIGHTING, fighting.fighting(), new Stats(1, 40, 80, 35, 35, 45, 70)));
        generationOne.add(new Pokemon(57, "Primeape", Type.FIGHTING, fighting.fighting(), new Stats(1, 65, 105, 60, 60, 70, 95)));
        generationOne.add(new Pokemon(58, "Growlithe", Type.FIRE, fire.fire(), new Stats(1, 55, 70, 45, 70, 50, 60)));
        generationOne.add(new Pokemon(59, "Arcanine", Type.FIRE, fire.fire(), new Stats(1, 90, 110, 80, 100, 80, 95)));
        generationOne.add(new Pokemon(60, "Poliwag", Type.WATER, water.water(), new Stats(1, 40, 50, 40, 40, 40, 90)));
        generationOne.add(new Pokemon(61, "Poliwhirl", Type.WATER, water.water(), new Stats(1, 65, 65, 65, 50, 50, 90)));
        generationOne.add(new Pokemon(62, "Poliwrath", Type.WATER, Type.FIGHTING, water.waterFighting(), new Stats(1, 90, 95, 95, 70, 90, 70)));
        generationOne.add(new Pokemon(63, "Abra", Type.PSYCHIC, psychic.psychic(), new Stats(1, 25, 20, 15, 105, 55, 90)));
        generationOne.add(new Pokemon(64, "Kadabra", Type.PSYCHIC, psychic.psychic(), new Stats(1, 40, 35, 30, 120, 70, 105)));
        generationOne.add(new Pokemon(65, "Alakazam", Type.PSYCHIC, psychic.psychic(), new Stats(1, 55, 50, 45, 135, 95, 120)));
        generationOne.add(new Pokemon(66, "Machop", Type.FIGHTING, fighting.fighting(), new Stats(1, 70, 80, 50, 35, 35, 35)));
        generationOne.add(new Pokemon(67, "Machoke", Type.FIGHTING, fighting.fighting(), new Stats(1, 80, 100, 70, 50, 60, 45)));
        generationOne.add(new Pokemon(68, "Machamp", Type.FIGHTING, fighting.fighting(), new Stats(1, 90, 130, 80, 65, 85, 55)));
        generationOne.add(new Pokemon(69, "Bellsprout", Type.GRASS, Type.POISON, grass.grassPoison(), new Stats(1, 50, 75, 35, 70, 30, 40)));
        generationOne.add(new Pokemon(70, "Weepinbell", Type.GRASS, Type.POISON, grass.grassPoison(), new Stats(1, 65, 90, 50, 85, 45, 55)));
        generationOne.add(new Pokemon(71, "Victreebel", Type.GRASS, Type.POISON, grass.grassPoison(), new Stats(1, 80, 105, 65, 100, 70, 70)));
        generationOne.add(new Pokemon(72, "Tentacool", Type.WATER, Type.POISON, water.waterPoison(), new Stats(1, 40, 40, 35, 50, 100, 70)));
        generationOne.add(new Pokemon(73, "Tentacruel", Type.WATER, Type.POISON, water.waterPoison(), new Stats(1, 80, 70, 65, 80, 120, 100)));
        generationOne.add(new Pokemon(74, "Geodude", Type.ROCK, Type.GROUND, rock.rockGround(), new Stats(1, 40, 80, 100, 30, 30, 20)));
        generationOne.add(new Pokemon(75, "Graveler", Type.ROCK, Type.GROUND, rock.rockGround(), new Stats(1, 55, 95, 115, 45, 45, 35)));
        generationOne.add(new Pokemon(76, "Golem", Type.ROCK, Type.GROUND, rock.rockGround(), new Stats(1, 80, 120, 130, 55, 65, 45)));
        generationOne.add(new Pokemon(77, "Ponyta", Type.FIRE, fire.fire(), new Stats(1, 50, 85, 55, 65, 65, 90)));
        generationOne.add(new Pokemon(78, "Rapidash", Type.FIRE, fire.fire(), new Stats(1, 65, 100, 70, 80, 80, 105)));
        generationOne.add(new Pokemon(79, "Slowpoke", Type.WATER, Type.PSYCHIC, water.waterPsychic(), new Stats(1, 90, 65, 65, 40, 40, 15)));
        generationOne.add(new Pokemon(80, "Slowbro", Type.WATER, Type.PSYCHIC, water.waterPsychic(), new Stats(1, 95, 75, 100, 100, 80, 30)));
        generationOne.add(new Pokemon(81, "Magnemite", Type.ELECTRIC, Type.STEEL, electric.electricSteel(), new Stats(1, 25, 35, 70, 95, 55, 45)));
        generationOne.add(new Pokemon(82, "Magneton", Type.ELECTRIC, Type.STEEL, electric.electricSteel(), new Stats(1, 50, 60, 95, 120, 70, 70)));
        generationOne.add(new Pokemon(83, "Farfetch'd", Type.NORMAL, Type.FLYING, flying.flyingNormal(), new Stats(1, 52, 90, 55, 58, 62, 60)));
        generationOne.add(new Pokemon(84, "Doduo", Type.NORMAL, Type.FLYING, flying.flyingNormal(), new Stats(1, 35, 85, 45, 35, 35, 75)));
        generationOne.add(new Pokemon(85, "Dodrio", Type.NORMAL, Type.FLYING, flying.flyingNormal(), new Stats(1, 60, 110, 70, 60, 60, 110)));
        generationOne.add(new Pokemon(86, "Seel", Type.WATER, water.water(), new Stats(1, 65, 45, 55, 45, 70, 45)));
        generationOne.add(new Pokemon(87, "Dewgong", Type.WATER, Type.ICE, water.waterIce(), new Stats(1, 90, 70, 80, 70, 95, 70)));
        generationOne.add(new Pokemon(88, "Grimer", Type.POISON, poison.poison(), new Stats(1, 80, 80, 50, 40, 50, 25)));
        generationOne.add(new Pokemon(89, "Muk", Type.POISON, poison.poison(), new Stats(1, 105, 105, 75, 65, 100, 50)));
        generationOne.add(new Pokemon(90, "Shellder", Type.WATER, water.water(), new Stats(1, 30, 65, 100, 45, 25, 40)));
        generationOne.add(new Pokemon(91, "Cloyster", Type.WATER, Type.ICE, water.waterIce(), new Stats(1, 50, 95, 180, 85, 45, 70)));
        generationOne.add(new Pokemon(92, "Gastly", Type.GHOST, Type.POISON, ghost.ghostPoison(), new Stats(1, 30, 35, 30, 100, 35, 80)));
        generationOne.add(new Pokemon(93, "Haunter", Type.GHOST, Type.POISON, ghost.ghostPoison(), new Stats(1, 45, 50, 45, 115, 55, 95)));
        generationOne.add(new Pokemon(94, "Gengar", Type.GHOST, Type.POISON, ghost.ghostPoison(), new Stats(1, 60, 65, 60, 130, 75, 110)));
        generationOne.add(new Pokemon(95, "Onix", Type.ROCK, Type.GROUND, rock.rockGround(), new Stats(1, 35, 45, 160, 30, 45, 70)));
        generationOne.add(new Pokemon(96, "Drowzee", Type.PSYCHIC, psychic.psychic(), new Stats(1, 60, 48, 45, 43, 90, 42)));
        generationOne.add(new Pokemon(97, "Hypno", Type.PSYCHIC, psychic.psychic(), new Stats(1, 85, 73, 70, 73, 115, 67)));
        generationOne.add(new Pokemon(98, "Krabby", Type.WATER, water.water(), new Stats(1, 30, 105, 90, 25, 25, 50)));
        generationOne.add(new Pokemon(99, "Kingler", Type.WATER, water.water(), new Stats(1, 55, 130, 115, 50, 50, 75)));
        generationOne.add(new Pokemon(100, "Voltorb", Type.ELECTRIC, electric.electric(), new Stats(1, 40, 30, 50, 55, 55, 100)));
        generationOne.add(new Pokemon(101, "Electrode", Type.ELECTRIC, electric.electric(), new Stats(1, 60, 50, 70, 80, 80, 150)));
        generationOne.add(new Pokemon(102, "Exeggcute", Type.GRASS, Type.PSYCHIC, grass.grassPsychic(), new Stats(1, 60, 40, 80, 60, 45, 40)));
        generationOne.add(new Pokemon(103, "Exeggutor", Type.GRASS, Type.PSYCHIC, grass.grassPsychic(), new Stats(1, 95, 95, 85, 125, 75, 55)));
        generationOne.add(new Pokemon(104, "Cubone", Type.GROUND, ground.ground(), new Stats(1, 50, 50, 95, 40, 50, 35)));
        generationOne.add(new Pokemon(105, "Marowak", Type.GROUND, ground.ground(), new Stats(1, 60, 80, 110, 50, 80, 45)));
        generationOne.add(new Pokemon(106, "Hitmonlee", Type.FIGHTING, fighting.fighting(), new Stats(1, 50, 120, 53, 35, 110, 87)));
        generationOne.add(new Pokemon(107, "Hitmonchan", Type.FIGHTING, fighting.fighting(), new Stats(1, 50, 105, 79, 35, 110, 76)));
        generationOne.add(new Pokemon(108, "Lickitung", Type.NORMAL, normal.normal(), new Stats(1, 90, 55, 75, 60, 75, 30)));
        generationOne.add(new Pokemon(109, "Koffing", Type.POISON, poison.poison(), new Stats(1, 40, 65, 95, 60, 45, 35)));
        generationOne.add(new Pokemon(110, "Weezing", Type.POISON, poison.poison(), new Stats(1, 65, 90, 120, 85, 70, 60)));
        generationOne.add(new Pokemon(111, "Rhyhorn", Type.ROCK, Type.GROUND, rock.rockGround(), new Stats(1, 80, 85, 95, 30, 30, 25)));
        generationOne.add(new Pokemon(112, "Rhydon", Type.ROCK, Type.GROUND, rock.rockGround(), new Stats(1, 105, 130, 120, 45, 45, 40)));
        generationOne.add(new Pokemon(113, "Chansey", Type.NORMAL, normal.normal(), new Stats(1, 250, 5, 5, 35, 105, 50)));
        generationOne.add(new Pokemon(114, "Tangela", Type.GRASS, grass.grass(), new Stats(1, 65, 55, 115, 100, 40, 60)));
        generationOne.add(new Pokemon(115, "Kangaskhan", Type.NORMAL, normal.normal(), new Stats(1, 105, 95, 80, 40, 80, 90)));
        generationOne.add(new Pokemon(116, "Horsea", Type.WATER, water.water(), new Stats(1, 30, 40, 70, 70, 25, 60)));
        generationOne.add(new Pokemon(117, "Seadra", Type.WATER, water.water(), new Stats(1, 55, 65, 95, 95, 45, 85)));
        generationOne.add(new Pokemon(118, "Goldeen", Type.WATER, water.water(), new Stats(1, 45, 67, 60, 35, 50, 63)));
        generationOne.add(new Pokemon(119, "Seaking", Type.WATER, water.water(), new Stats(1, 80, 92, 65, 65, 80, 68)));
        generationOne.add(new Pokemon(120, "Staryu", Type.WATER, water.water(), new Stats(1, 30, 45, 55, 70, 55, 85)));
        generationOne.add(new Pokemon(121, "Starmie", Type.WATER, Type.PSYCHIC, water.waterPsychic(), new Stats(1, 60, 75, 85, 100, 85, 115)));
        generationOne.add(new Pokemon(122, "Mr. Mime", Type.PSYCHIC, Type.FAIRY, psychic.psychicFairy(), new Stats(1, 40, 45, 65, 100, 120, 90)));
        generationOne.add(new Pokemon(123, "Scyther", Type.BUG, Type.FLYING, bug.bugFlying(), new Stats(1, 70, 110, 80, 55, 80, 105)));
        generationOne.add(new Pokemon(124, "Jinx", Type.ICE, Type.PSYCHIC, ice.icePsychic(), new Stats(1, 65, 50, 35, 115, 95, 95)));
        generationOne.add(new Pokemon(125, "Electabuzz", Type.ELECTRIC, electric.electric(), new Stats(1, 65, 83, 57, 95, 85, 105)));
        generationOne.add(new Pokemon(126, "Magmar", Type.FIRE, fire.fire(), new Stats(1, 65, 95, 57, 100, 85, 93)));
        generationOne.add(new Pokemon(127, "Pinsir", Type.BUG, bug.bug(), new Stats(1, 65, 125, 100, 55, 70, 85)));
        generationOne.add(new Pokemon(128, "Tauros", Type.NORMAL, normal.normal(), new Stats(1, 75, 100, 95, 40, 70, 110)));
        generationOne.add(new Pokemon(129, "Magikarp", Type.WATER, water.water(), new Stats(1, 20, 10, 55, 15, 20, 80)));
        generationOne.add(new Pokemon(130, "Gyarados", Type.WATER, Type.FLYING, water.waterFlying(), new Stats(1, 95, 125, 79, 60, 100, 81)));
        generationOne.add(new Pokemon(131, "Lapras", Type.WATER, Type.ICE, water.waterIce(), new Stats(1, 130, 85, 80, 85, 95, 60)));
        generationOne.add(new Pokemon(132, "Ditto", Type.NORMAL, normal.normal(), new Stats(1, 48, 48, 48, 48, 48, 48)));
        generationOne.add(new Pokemon(133, "Eevee", Type.NORMAL, normal.normal(), new Stats(1, 55, 55, 50, 45, 65, 55)));
        generationOne.add(new Pokemon(134, "Vaporeon", Type.WATER, water.water(), new Stats(1, 65, 65, 60, 110, 95, 65)));
        generationOne.add(new Pokemon(135, "Jolteon", Type.ELECTRIC, electric.electric(), new Stats(1, 65, 65, 60, 110, 95, 130)));
        generationOne.add(new Pokemon(136, "Flareon", Type.FIRE, fire.fire(), new Stats(1, 65, 130, 60, 95, 110, 65)));
        generationOne.add(new Pokemon(137, "Poryon", Type.NORMAL, normal.normal(), new Stats(1, 65, 60, 70, 85, 75, 40)));
        generationOne.add(new Pokemon(138, "Omanyte", Type.ROCK, Type.WATER, rock.rockWater(), new Stats(1, 35, 40, 100, 90, 55, 35)));
        generationOne.add(new Pokemon(139, "Omastar", Type.ROCK, Type.WATER, rock.rockWater(), new Stats(1, 70, 60, 125, 115, 70, 55)));
        generationOne.add(new Pokemon(140, "Kabuto", Type.ROCK, Type.WATER, rock.rockWater(), new Stats(1, 30, 80, 90, 55, 45, 55)));
        generationOne.add(new Pokemon(141, "Kabutops", Type.ROCK, Type.WATER, rock.rockWater(), new Stats(1, 60, 115, 105, 65, 70, 80)));
        generationOne.add(new Pokemon(142, "Aerodactyl", Type.ROCK, Type.FLYING, rock.rockFlying(), new Stats(1, 80, 105, 65, 60, 75, 130)));
        generationOne.add(new Pokemon(143, "Snorlax", Type.NORMAL, normal.normal(), new Stats(1, 160, 110, 65, 65, 110, 30)));
        generationOne.add(new Pokemon(144, "Articuno", Type.ICE, Type.FLYING, ice.iceFlying(), new Stats(1, 90, 85, 100, 95, 125, 85)));
        generationOne.add(new Pokemon(145, "Zapdos", Type.ELECTRIC, Type.FLYING, electric.electricFlying(), new Stats(1, 90, 90, 85, 125, 90, 100)));
        generationOne.add(new Pokemon(146, "Moltres", Type.FIRE, Type.FLYING, fire.fireFlying(), new Stats(1, 90, 100, 90, 125, 85, 90)));
        generationOne.add(new Pokemon(147, "Dratini", Type.DRAGON, dragon.dragon(), new Stats(1, 40, 64, 45, 50, 50, 50)));
        generationOne.add(new Pokemon(148, "Dragonair", Type.DRAGON, dragon.dragon(), new Stats(1, 61, 84, 65, 70, 70, 70)));
        generationOne.add(new Pokemon(149, "Dragonite", Type.DRAGON, Type.FLYING, dragon.dragonFlying(), new Stats(1, 90, 134, 95, 100, 100, 80)));
        generationOne.add(new Pokemon(150, "Mewtwo", Type.PSYCHIC, psychic.psychic(), new Stats(1, 106, 110, 90, 154, 100, 130)));
        generationOne.add(new Pokemon(151, "Mew", Type.PSYCHIC, psychic.psychic(), new Stats(1, 100, 100, 100, 100, 100, 100)));

        return generationOne;

    }
}
