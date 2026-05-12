
class Solution {
    public boolean isPalindrome(String str) {

        StringBuilder sb = new StringBuilder();
        char cha;
        for(int i = 0;i<=str.length()-1; i++){
            if(Character.isLetterOrDigit(str.charAt(i))){
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }
        String clean = sb.toString();
        System.out.println("I am clean : "+ clean);
        String reverse = sb.reverse().toString();
        System.out.println("I am reverse : "+ reverse);
        if(clean.equals(reverse)){
            return true;
        }else{
            return false;
        }
        
    }
}
