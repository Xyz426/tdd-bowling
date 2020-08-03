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
            bowlingGame.calculate(arr_balls);
        });
    }

}
