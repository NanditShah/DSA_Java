package Grind75;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println("Ransom Note");
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;

        HashMap<Character,Integer> hMap = new HashMap<>();

        for(char magazineChar : magazine.toCharArray()){
            hMap.put(magazineChar,hMap.getOrDefault(magazineChar,0)+1);
        }

        for(char ransomChar : magazine.toCharArray()){
            if(!hMap.containsKey(ransomChar)) return false;
            if(hMap.get(ransomChar) == 1) hMap.remove(ransomChar);
            hMap.put(ransomChar,hMap.get(ransomChar)-1);
        }

        return true;
    }
}
