package dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeleteMaxOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deleteNth(new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3));
	}
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		//Code here ;)
		ArrayList<Integer> sol=new ArrayList<Integer>();
		
		//get counts map and max value
		Map<Integer,Integer> initCountMap=returnCountMap(elements);
		//Map<Integer,Integer> maxMap=returnMaxValueMap(initCountMap);
		List<Integer> maxelement=returnMaxValueMap(initCountMap);
		System.out.println("Max-val:"+maxelement);
		
		//generate new list
		int count=maxelement.get(1);int value=maxelement.get(0);
		int added=0;
		for(int i:elements) {
			if(i==value) {
				System.out.println("i-"+i);
				added++;
			}
			System.out.println(i);
			if(added<=maxOccurrences) {
				System.out.println("Adding");
				sol.add(i);
			}
			if(added==count && i!=value) {
				sol.add(i);
			}
			
		}
		System.out.println("sol:"+sol);//[1, 1, 3, 3, 7, 2, 2, 2]
		return null;
	}
	public static Map<Integer,Integer> returnCountMap(int[] elements) {
		Map <Integer,Integer> countsMap=new HashMap<Integer,Integer>();
		for(int i:elements) {
			if(!countsMap.containsKey(i)) {
				countsMap.put(i,1);
			}else {
				countsMap.put(i, countsMap.get(i)+1);
			}
		}
		
		System.out.println("countMap-"+countsMap);
		return countsMap;
	}
	public static List<Integer> returnMaxValueMap(Map<Integer,Integer> map){
		//find max element in countsMap--we will not decrease the count only for that one
		ArrayList<Integer> returnList=new ArrayList<Integer>();
		int maxelement=0;int maxeleValue=0;
		for(int i:map.keySet()) {
			if(map.get(i)>maxeleValue) {
				maxeleValue=map.get(i);
				maxelement=i;
			}
		}
		returnList.add(maxelement);returnList.add(maxeleValue);
		return returnList;
	}

}
