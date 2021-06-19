import java.util.Arrays;
/*
 * 정렬 > 가장 큰 수
 * 입력한 int형 배열의 숫자를 정렬하여 가장 큰수를 뽑아내라
 *
 * 1. 입력을 받음
 * 2. 자릿수 별로 제일 큰 숫자인지 비교
 * 3. 입력
 *
 * 말로는 쉽네..
 * 이거는 시간초과 5개가 나온다.
 * 통과는 6개
 * */
public class veryBig {
    public static void main(String[] args) {
        String answer = "";
        int[] numbers = {3, 30, 34,5,9};
        double[] copy = new double[numbers.length];
        int[] numL = new int[numbers.length];
        int max = 0;
        for(int i=0; i<numbers.length; i++){
            int k = 1;
            copy[i] = numbers[i];
            while(copy[i]>=10){
                copy[i] /=10;
                k++;
            }
            copy[i] %= 10;
            numL[i] = k;
            if(max<numL[i]){
                max = numL[i];
            }
        }


        int min = 0;
        for(int i=0; i<numL.length-1; i++){
            for(int j=i+1; j<numL.length; j++){
                int x = Integer.parseInt(numbers[i]+""+numbers[j]);
                int y = Integer.parseInt(numbers[j]+""+numbers[i]);
                 if(x<y){
                     min = numbers[j];
                     numbers[j] = numbers[i];
                     numbers[i] = min;
                 }
            }
        }
        for(Integer z : numbers){
            answer += z;
        }
        System.out.println(answer);
    }
}


/* 조금 더 빨라지긴 했는데 그래도 시간초과 123 56 */

import java.util.Arrays;
/*
 * 정렬 > 가장 큰 수
 * 입력한 int형 배열의 숫자를 정렬하여 가장 큰수를 뽑아내라
 *
 * 1. 입력받은거 앞뒤랑 더해서 2개 비교
 * 2. 정렬
 * 3. 끝
 * 4. 근데 시간초과 
 * */

public class veryBig {
    public static void main(String[] args) {
        String answer = "";
        int[] numbers = {3,30,32,5,9};
        int min=0;
        for(int i = 0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(Integer.parseInt(numbers[i]+""+numbers[j])<Integer.parseInt(numbers[j]+""+numbers[i])){
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }

        for(Integer k : numbers)
            answer += k;

        System.out.println(answer);

        return ;
    }
}




import java.util.Arrays;
import java.util.Comparator;
/*
* 다른 사람의 코드
* Arrays.sort
* new Comparator<String>
* String값 두개를 비교 했을때 더 큰 순으로 정렬해주는...
* 왜 빠른건진 모르겟다.
*/

public class VeryBigNumber {
    public static String solution(int[] numbers) {
        String answer = "";
        int len = numbers.length;
        // 1. int형 배열을 String배열로 변환
        String[] strs = new String[len];
        for(int i=0;i<len;i++){
            strs[i] = Integer.toString(numbers[i]);
        }

        // 2. String 으로 정렬한다. (s1 + s2) , (s2 + s1)를 비교했을때 사전적으로 더 큰 순으로 정렬
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return ((s2+s1).compareTo(s1+s2));
            }
        });

        // 2-1. lamda식으로 표현
        Arrays.sort(strs, (s1, s2) -> (s2+s1).compareTo(s1+s2));

        // 예외케이스
        // 모두 0 인 경우
        if("0".equals(strs[0])){
            return "0";
        }
        for(String st : strs){
            answer += st;
        }
        return answer;
    }

}
