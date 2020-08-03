import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BowlingGameTest {

    BowlingGame bowlingGame = new BowlingGame();

    @Test
    void should_get_score(){
        int[][]arr_balls = {{2, 3}, {10,0}, {2, 4}, {6, 2}, {10,0}, {2, 2}, {5, 4}, {5, 2},{4,6},{10,0},{4,3}};

        int totalScore = bowlingGame.calculateScore(arr_balls);
        assertEquals(totalScore,110);

        int[][]array_balls = {{2, 3}, {10,0}, {2, 4}, {6, 2}, {10,0}, {2, 2}, {5, 4}, {5, 2},{4,6},{1,9},{4}};
        totalScore = bowlingGame.calculateScore(array_balls);
        assertEquals(totalScore,98);
    }
}
