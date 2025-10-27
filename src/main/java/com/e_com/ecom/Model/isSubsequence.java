package com.e_com.ecom.Model;

class isSubsequence {
    static void main() {
        System.out.println(isSubsequence("axc","ahbgdc"));
    }
    static boolean isSubsequence(String s, String t) {
        int sptr=0;
        int tptr=0;
        while(sptr<s.length()&&tptr<t.length()){
            if(s.charAt(sptr)==t.charAt(tptr)){
                sptr++;
                tptr++;
            }
            else{
                tptr++;
            }

        }
        if(sptr==s.length()) return true;
        else return false;
    }
}
