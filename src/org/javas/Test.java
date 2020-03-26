package org.javas;

public class Test {

	public static void main(String[] args) {
	int a[]= {376749, 494425,
			541874 ,749112,
			934622, 923823,
			910760 ,29050,
			382688, 758133,
			754682,832882,
			145439, 248497,
			468459, 924729,
			213597 ,714949,
			299192 ,769357,
			872143 ,323282,
			478132, 760292,
			108132, 468592,
			357041 ,340363};
	
	System.out.println("Input Data \n"+a.length);
	int count=0;
	for(int b:a)
	{
		count=count+b;
	}

	System.out.println(count);
	}
}