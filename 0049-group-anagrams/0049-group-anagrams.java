class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }

        Map<String, List<String>> freqStringMap = new HashMap<>();
        for(String str: strs){
            String freqString = getFrequencyString(str);

            if(freqStringMap.containsKey(freqString)){
                freqStringMap.get(freqString).add(str);
            }

            else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                freqStringMap.put(freqString, strList);
            }
        }

        return new ArrayList<>(freqStringMap.values());
    }

    private String getFrequencyString(String s){
        int[] freq= new int[26];

        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder sb= new StringBuilder();

        for(int i=0; i<26; i++){
            if(freq[i]>0){
                sb.append((char)('a'+i));
                sb.append(freq[i]);
            }
        }
        return sb.toString();
    }
}