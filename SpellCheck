import java.util.Arrays;

public class spellcheck2 {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        if(cacheSize==0) return cities.length*5;
        String[] k = new String[cacheSize];
        for(int i=0; i<cities.length; i++){
            if(Arrays.asList(cities).contains(k)){
                System.out.println(cities[i]+"shi");
                answer++;
            }else{
                answer +=5;
            }
            k[i%cacheSize]=cities[i];
        }
        return answer;
    }
}
