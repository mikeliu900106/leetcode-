package org.example;

import java.util.*;

public class _02 {
    public static void main(String[] args) {
        String s= "weqasdasdqwefd";

        Map<Integer,List<Character>> map =new HashMap<>();
        for(int i =0; i<s.length(); i++){
            map.put(i,new ArrayList<>());
            map.get(i).add(s.charAt(i));
            for (int j=i+1; j<s.length(); j++){
                if(!map.get(i).contains(s.charAt(j))){
                    map.get(i).add(s.charAt(j));
                }else{
                    break;
                }
            }
        }
        int maxSize = 0;
        for (List<Character> list : map.values()) {
            if (list.size() > maxSize) {
                maxSize = list.size();
            }
        }
        return maxSize;
    }



}