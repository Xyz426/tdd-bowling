import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BowlingGameTest {

    BowlingGame bowlingGame = new BowlingGame();

    @Test
    void should_throw_exception_when_input_negative_or_More_than_10(){
        //Given
        int arr_balls[] = {1,2,3,4,5,-1,6,3,21,1};

        assertThrows(RuntimeException.class,()->{
            bowlingGame.calculateWhenExc(arr_balls);
        });
    }

    @Test
    void should_get_score_when_any_hit_less_than_10(){
        //Given
        int arr_balls[] = {0,1,2,3,4,5,6,7,8,9};

        //when
        int totalScore = bowlingGame.calculateHitLessThan10(arr_balls);

        //then
        assertEquals(45,totalScore);
    }
}
