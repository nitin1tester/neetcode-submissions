class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArrForS = s.toCharArray();
        char[] charArrForT = t.toCharArray();
        Arrays.sort(charArrForS);
        Arrays.sort(charArrForT);
        if(Arrays.equals(charArrForS,charArrForT)){
        return true; }
        else{
            return false;
        }
    }
}
