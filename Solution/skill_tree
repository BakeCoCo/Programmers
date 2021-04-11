public class skilTree {
    public static int skilTree(String skil, String[] tree){
        int answer = 0;
        int x,y;
        boolean tf;
        for(int i=0; i<tree.length; i++){
            tf= true;
            x = -2; y = -2;
            for(int j=0; j<skil.length(); j++){
                x = tree[i].indexOf(skil.charAt(j));
                if(y == -1 && x != -1){
                    tf=false;
                    break;
                }

                if(x != -1 && x <= y){
                    tf = false;
                    break;
                }
                y = x;
            }
            if(tf) answer++;
        }
        return answer;
    }
}
