import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class programers77484 {
    public static void main(String[] args) {
        int []lotto = {44, 1, 0, 0, 31, 25};
        int []win = {31, 10, 45, 1, 6, 19};

        Solution solution = new Solution();

        int[] sol = solution.solution(lotto,win);

        System.out.println(Arrays.toString(sol));
    }

    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];
            int[] result = {6,6,5,4,3,2,1};

            int c1 = 0;
            int c2 = 0;
            for(int i=0; i<lottos.length; i++){
                if(lottos[i]==0) c1++;
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        c2++;
                    }
                }
            }

            answer[0] = result[c1+c2];
            answer[1] = result[c2];

            return answer;
        }
    }
}
