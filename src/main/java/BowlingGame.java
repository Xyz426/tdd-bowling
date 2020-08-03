public class BowlingGame {

    public int calculateWhenExc(int[] arr_balls) throws RuntimeException {
        for (int i = 0; i < arr_balls.length; i++) {
            if (arr_balls[i] < 0 || arr_balls[i] > 10) {
                throw new RuntimeException("input balls is error");
            }
        }
        return 0;
    }

    public int calculateHitLessThan10(int[] arr_balls) {
        int totalScore = 0;
        for (int i = 0; i < arr_balls.length; i++) {
            totalScore += arr_balls[i];
        }

        return totalScore;
    }

    public int calculateAppearAllHit(int[][] arr_balls) {
        int totalScore = 0;
        int sum_line = 0;
        for (int i = 0; i < arr_balls.length; i++) {
            //   {2, 3}, {10,0}, {2, 4}, {6, 2}, {10,0}, {2, 2}, {5, 4}, {5, 2},{4,6},{2,3}
            sum_line = arr_balls[i][0] + arr_balls[i][1];

            totalScore += sum_line;
            if (sum_line == 10) {
                if (arr_balls[i][0] == 10) {
                    totalScore += arr_balls[i + 1][0] + arr_balls[i + 1][1];
                } else {
                    totalScore += arr_balls[i + 1][0];
                }
            }
        }
        return totalScore;
    }
}
