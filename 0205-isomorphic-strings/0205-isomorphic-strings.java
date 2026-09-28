class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> Smap = new HashMap<>();
        HashMap<Character, Character> Tmap = new HashMap<>();

        for(int i = 0;i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(Smap.containsKey(a) && Smap.get(a) != b){
                return false;
            }
            if(Tmap.containsKey(b) && Tmap.get(b) != a){
                return false;
            }

            Smap.put(a,b);
            Tmap.put(b,a);
        }

        return true;
    }
}