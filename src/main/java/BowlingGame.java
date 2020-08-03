public class BowlingGame {

    public int calculateScore(int[][] arr_balls){
        calculateWhenExc(arr_balls);

        int totalScore = 0;
        int sum_line = 0;
        for (int i = 0; i < arr_balls.length; i++) {

            //避免越界，第11轮只扔了一次的情况
            if(i > 9 && arr_balls[i][0] != 10){
                totalScore += arr_balls[i][0];
                break;
            }

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


    public void calculateWhenExc(int[][] arr_balls) throws RuntimeException {
        if(arr_balls == null || arr_balls.length > 11)
            throw new RuntimeException("input balls is error");

        for (int i = 0; i < arr_balls.length; i++) {
            if(arr_balls.length > 9){
                break;
            }
            if (arr_balls[i][0] < 0 || arr_balls[i][0] > 10
                || arr_balls[i+1][1] < 0 || arr_balls[i][1] > 10) {
                throw new RuntimeException("input balls is error");
            }
        }
    }
}
