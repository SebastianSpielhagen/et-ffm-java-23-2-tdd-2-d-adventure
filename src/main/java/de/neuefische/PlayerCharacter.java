package de.neuefische;

public class PlayerCharacter {

    public static int x = 0;
    public static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int move(String direction) {
        if (direction.equals("w")){
            y++;
            return getY();
        } else if (direction.equals("s")) {
            y--;
            return getY();
        } else if (direction.equals("a")) {
            x--;
            return getX();
        } else if (direction.equals("d")) {
            x++;
            return getX();
        }
        return 42;
    }
}
