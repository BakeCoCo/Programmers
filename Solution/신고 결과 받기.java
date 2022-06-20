import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

            Map<String,Integer> idMap = new LinkedHashMap<>();
            Set<String> sTarget = new HashSet<>();
            Map<String,String> listMap = new LinkedHashMap<>();

            for(String s : id_list){
                idMap.put(s,0);
            }

            for(String val : report) {

                StringTokenizer st = new StringTokenizer(val," ");
                String id = st.nextToken();
                String ban = st.nextToken();

                if(!sTarget.contains(val)) {
                    sTarget.add(val);
                    String value = listMap.getOrDefault(ban,"");
                    if(value.equals("")){
                        listMap.put(ban,id);
                    }else{
                        listMap.put(ban,value+","+id);
                    }
                }
            }
            for(String keyBan : listMap.keySet()){
                String []spl = listMap.get(keyBan).split(",");
                if(spl.length >= k){
                    for(int i=0; i<spl.length; i++){
                        idMap.put(spl[i],idMap.get(spl[i])+1);
                    }
                }
            }

            int count = 0;
            for(int x : idMap.values()) {
                answer[count++] = x;
            }

            return answer;
    }
}
