package dev;

import java.util.HashMap;
import java.util.Map;

public class Isogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is Isogram:"+isIsogram("moOse"));
	}
	public static boolean isIsogram(String str) {
		System.out.println(str);
		boolean result=false;
		boolean flagIso=false;
		Map<String,Integer> countMap=new HashMap<String,Integer>();
		if(str.isEmpty()) {
			result=true;
		}
		
		for(int i=0;i<str.length();i++) {
			String ch=((Character)str.charAt(i)).toString().toLowerCase();
			if(!countMap.containsKey(ch)){
				countMap.put(ch, 1);
			}else {
				countMap.put(ch, countMap.get(ch)+1);
				flagIso=true;
			}
		}
		
		
		if(flagIso) {
			result=false;
		}else {
			result=true;
		}
		System.out.println(str+"--"+result);
		return result;
	}

}
