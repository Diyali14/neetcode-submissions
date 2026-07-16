class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       //List<List<String>> list = new ArrayList<>(); 
        int num=strs.length;
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<num;i++){
            char[] c1=strs[i].toCharArray();
            Arrays.sort(c1);
            String s1=new String(c1);
            //List<String> list = new ArrayList<>();
            if(map.containsKey(s1)){
              map.get(s1).add(strs[i]);  
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(s1, l);
            }
            
        }

        return new ArrayList<>(map.values());

             
            


    }
}
