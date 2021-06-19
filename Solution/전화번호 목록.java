/* 해시 */
/*
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려한다.
119,97674223,1195524421 = false
123,456,789 = true
12,123,1234 = false
phone_book의 길이는 1~1,000,000입니다.
각 전화번호의 길이는 1~20입니다.
같은 번호가 중복해서 들어있지 않다.
*/

/* 효율성 2개 통과 못함 */
import java.util.Arrays;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        int j=0;
        for(String k : phone_book){
        for(int i=0; i<phone_book.length; i++){
            if(j!=i){
            if(phone_book[i].startsWith(k)){
                return false;
            }
            }
        }
            j++;
        }
        return true;
    }
}

/* 다른사람 답 이것도 효율성 두개 통과못함 */
class Solution {
    public boolean solution(String[] phoneBook) {
       for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
            }
        }
        return true;
    }
}


/* 통과 한것 */
public static boolean solution2(String[] phone_book) {
    boolean answer = true;
    Arrays.sort(phone_book);
    int j=1;
    for(int i=0; i<phone_book.length-1; i++){
        if(phone_book[j].startsWith(phone_book[i])){
            return false;
        }
        j++;
    }
    return true;
}
