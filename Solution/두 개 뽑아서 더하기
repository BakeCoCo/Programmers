import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i!=j){
                    int c = numbers[i]+numbers[j];
                    if(!arr.contains(c)){
                        arr.add(c);
                    }
                }
            }
        }
        int size=0;
        int[] answer = new int[arr.size()];
        for(int k : arr){
            answer[size++] = k;
        }
        Arrays.sort(answer);
        return answer;
    }
}
