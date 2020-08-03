public class BowlingGame {

    public int calculateWhenExc(int[] arr_balls) throws RuntimeException {
        for (int i = 0; i < arr_balls.length; i++) {
            if (arr_balls[i] < 0 || arr_balls[i] > 10) {
                throw new RuntimeException("input balls is error");
            }
        }
        return 0;
    }

    public int calculateHitLessThan10(int[] arr_balls){
        int totalScore = 0;
        for (int i = 0; i <arr_balls.length; i++) {
            totalScore += arr_balls[i];
        }

        return totalScore;
    }
}
