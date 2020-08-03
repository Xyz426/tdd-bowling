public class BowlingGame {

    public int calculate(int[] arr_balls) throws RuntimeException {
        for (int i = 0; i < arr_balls.length; i++) {
            if (arr_balls[i] < 0 || arr_balls[i] > 10) {
                throw new RuntimeException("input balls is error");
            }
        }
        return 0;
    }
}
