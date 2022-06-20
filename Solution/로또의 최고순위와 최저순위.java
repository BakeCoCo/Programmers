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
            int count1 = 0;
            int count2 = 0;

            Map<Integer,Integer> map1 = new HashMap<>();
            Map<Integer,Integer> map2 = new HashMap<>();

            for(int i=0; i<lottos.length; i++){
                if(lottos[i]==0) count1++;
                map1.put(lottos[i],0);
                map2.put(win_nums[i],0);
            }
            for(int k : map2.keySet()){
                map2.put(k,map1.getOrDefault(k,-1)+1);
                if(map2.get(k)>0){
                    count2++;
                }
            }

            answer[0] = result[count1+count2];
            answer[1] = result[count2];

            return answer;
        }
    }
}
