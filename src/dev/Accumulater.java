package dev;

public class Accumulater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(accum("ZpglnRxqenU"));
	}
	public static String accum(String s) {
		//"A-Bb-Ccc-Dddd"
		//RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
		//String output=((Character)s.charAt(0)).toString().toUpperCase();
		String output="";int index=0;
		//System.out.println(s.split(""));
		for(String st:s.split("")) {
			//System.out.println("in for loop");
			//System.out.println(st+"-"+s.indexOf(st)+"-"+s.length());
			output+=(appendChar(st,index));
			index++;
			//output=s.indexOf(st)!=s.length()-1 ? output+="-" :output;
		}
		System.out.println(output.lastIndexOf("-"));
		return output.substring(0, output.lastIndexOf("-"));
	     
	 }
	public static String appendChar(String str,int index) {
		//System.out.println("str-"+str+"-"+index);
		String appendedString = str.toUpperCase();
		for(int i=0;i<=index-1;i++) {
			//System.out.println("in append for loop");
			appendedString+= str.toLowerCase();
		}
		//System.out.println("appended:"+appendedString);
		return appendedString+"-";
	}

}
