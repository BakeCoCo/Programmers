import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        answer = mar2(participant, completion);
        return answer;
    }
    public static String mar1(String[] a, String[] b){
        String x="";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();
        for(String q : a){
            if(hm.containsKey(q)){
               hm.put(q,hm.get(q)+1);
            }else{
               hm.put(q,0);
            }
        }
        for(String q : b){
            if(hm2.containsKey(q)){
               hm2.put(q,hm2.get(q)+1);
            }else{
               hm2.put(q,0);
            }
        }
        for(String q : hm.keySet()){
            if(hm2.containsKey(q)){
               if(hm.get(q)!=hm2.get(q)){
                   return q;
               }
            }else{
               return q;
            }
        }
        return x;
    }
    
    public static String mar2(String[] a, String[] b){
        String k ="";
        Arrays.sort(b);
        Arrays.sort(a);
        int j=0;
        for(int i=0; i<a.length; i++){
            if(i==a.length-1){
                return a[i];
            }
            if(!a[i].equals(b[j])){
                return a[j];
            }
            j++;
        }
        return k;
    }
}
