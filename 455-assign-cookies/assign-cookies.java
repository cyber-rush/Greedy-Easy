class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        ArrayList<Integer> greed = new ArrayList();
        ArrayList<Integer> cookies = new ArrayList();
        
        for(int i = 0;i<g.length;i++){
            greed.add(g[i]);
        }
        for(int i = 0;i<s.length;i++){
            cookies.add(s[i]);
        }
        Collections.sort(greed,(a,b) -> (b - a));
        Collections.sort(cookies,(a,b) -> (b - a));
        int cnt = 0;
        int i = 0;
        int j = 0;
        
        while(i < greed.size() && j < cookies.size()){
            if(cookies.get(j) >= greed.get(i)){
                cnt++;
                j++;
            }
            i++;
        }
        return cnt;
    }
}