package nl.leon.tournament;

import java.util.stream.Stream;

/**
 * @author : Leon Jongsma
 */
public enum Color {
    YELLOW(5)
    ,BLUE,RED;

    public static Stream<Color> stream() {
        return Stream.of(Color.values());
    }
}
