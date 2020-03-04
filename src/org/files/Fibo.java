package org.files;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            int n1 = 100;
            int n2 = 250;
            int res = 0;

            if (n1 % 2 == 0) {
                n1 += 1;

                for (int i = n1; i < n2; i += 2) {
                    if (isPerfectSquare(5 * i * i + 4) || isPerfectSquare(5 * i * i - 4))
                        res = i;
                    System.out.print(res+"  ");
                }
            }
        } catch(Exception ignored) {
          //  System.out.println("0"+"   ");
        }
    }

    public static boolean isPerfectSquare(int num) {
        double sqrt = Math.sqrt(num);
        int x = (int)sqrt;
        return Math.pow(sqrt, 2) == Math.pow(x, 2);
	}

}
