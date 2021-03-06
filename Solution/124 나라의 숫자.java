//연습문제 > 124 나라
/*
* 124 나라에는 자연수만 존재합니다.
* 124 나라에는 모든 수를 표현할 때 1,2,4 만 사용합니다.
* 10진법
* 1,2,3,4,5 = 1,2,4,11,12
* 6,7,8,9,10 = 14,21,22,24,41
* 자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해주세요.
* n은 500,000,000이하의 자연수 입니다.*/
/* 효율성에서 탈락 */
class Solution {
    public String solution(int n) {
        String answer ="";
        int k = 0;
        while(n>0){
            k = n%3;
            n = n/3;
            if(k==0){
                n -= 1;
                k=4;
            }
            answer = k+answer;
        }
        return answer;
    }
}

class Solution {
    public String solution(int n) {
        String answer = "";
        String k[] = {"4","1","2"};
        while(n>0){
            answer = k[n%3]+answer;
            n = (n-1)/3;
        }
        return answer;
    }
}
