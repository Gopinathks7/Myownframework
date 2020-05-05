package org.one;

public class RepeatedWords {

	public static void main(String[] args) {
	String name="gopinath from bangalore gopinath Bangalore Bangalore";
	name=name.toLowerCase();
	String words[]=name.split(" ");
int count=0;
for(int i=0;i<words.length-1;i++)
{
	 for(int j=i+1;j<words.length;j++)
	 {
		 count=1;
		 if(words[i].equals(words[j]))
		 {
			count++;
			words[j]="0";
		 }
	 }
	 if(count>1&&words[i]!="0")
	 
		 System.out.println(words[i]);
	 
}
	}

}
