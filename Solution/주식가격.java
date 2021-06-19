import java.util.Stack;

// 주식가격
public class jusik {

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack s = new Stack();
        for(int k : prices) s.push(k);
        while(!s.isEmpty()) answer[s.size()-1] = sol((int)s.pop(),s.size(),prices);

        return answer;
    }

    public static int sol(int s,int size,int[] prices){
        int x = 0;
        for (int i=size; i<prices.length; i++){
            if(size!=i){
                x++;
                if(s>prices[i]) return x;
            }
        }
        return x;
    }
}
