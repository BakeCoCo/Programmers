public class programers86051 {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,6,7,8,0};
        Solution sol = new Solution();
        int answer = sol.solution(numbers);
        System.out.println(answer);
    }

    static class Solution {
        public int solution(int[] numbers){
            int answer = 45;

            for(int x : numbers){
                answer -= x;
            }

            return answer;
        }
    }
}
