import java.util.*;

public class programers42888 {
    public static void main(String[] args) {

        String[] record = {
                "Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"
        };

        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(record)));
    }

    static class Solution{
        public String[] solution(String[] record){
            String[] status = {"님이 들어왔습니다.","님이 나갔습니다."};

            Map<Integer, String> map = new LinkedHashMap<>();
            Map<String, String> idMap = new HashMap<>();

            for(int i=0; i<record.length; i++){
                String[] txt = record[i].split(" ");
                if("Enter".equals(txt[0])){
                    idMap.put(txt[1],txt[2]);
                }else if("Change".equals(txt[0])){
                    idMap.put(txt[1],txt[2]);
                }
            }

            for(int i=0; i<record.length; i++){
                String[] txt = record[i].split(" ");

                if("Enter".equals(txt[0])){
                    map.put(i,idMap.get(txt[1])+status[0]);

                }else if("Leave".equals(txt[0])){
                    map.put(i,idMap.get(txt[1])+status[1]);
                }
            }
            String answer[] = new String[map.size()];
            int x = 0;
            for(String k : map.values()){
                answer[x++] = k;
            }
            return answer;
        }
    }

}
