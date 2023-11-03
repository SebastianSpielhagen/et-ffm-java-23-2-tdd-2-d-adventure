package de.neuefische;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    //War NICHT Teil der Aufgabe. Hiermit könnt ihr aber x & y in PlayerCharacter static machen ohne das sich eure Tests gegenseitig manipulieren.
    @BeforeEach // -> Wird vor jedem Test ausgeführt
    void resetAllXY() {
        //Setze x & y wieder auf 0. Das macht jeden Test wieder erwartbar, da immer von x&y=0 ausgegangen wird.
        PlayerCharacter.x =0;
        PlayerCharacter.y =1;
    }

    @Test
    void getX_ShouldReturn0_WhenStart() {
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharacter.getX();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void getY_ShouldReturn0_WhenStart() {
        //GIVEN
        int expected = 0;
        //WHEN
        int actual = PlayerCharacter.getY();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_ShouldReturn1_WhenW() {
        //GIVEN
        String direction = "w";
        int expected = 1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }


    @Test
    void move_ShouldReturnMinus1_WhenS() {
        //GIVEN
        String direction = "s";
        int expected = -1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_ShouldReturn1_WhenD() {
        //GIVEN
        String direction = "d";
        int expected = 1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_ShouldReturnMinus1_WhenA() {
        //GIVEN
        String direction = "a";
        int expected = -1;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void move_ShouldReturn42_WhenInputIsNotWASD() {
        //GIVEN
        String direction = "z";
        int expected = 42;
        //WHEN
        int actual = PlayerCharacter.move(direction);
        //THEN
        assertEquals(expected, actual);
    }
    

}