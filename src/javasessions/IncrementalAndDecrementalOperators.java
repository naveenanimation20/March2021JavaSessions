package javasessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {

		
		//1. post increment ++
		int a = 1;
		int b = a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c = -98;
		int d = c++;
		System.out.println(c);//-97
		System.out.println(d);//-98
		
		//2. pre increment: ++
		int m = 1;
		int n = ++m; 
		System.out.println(m);//2
		System.out.println(n);//2
		
		int h = 2;
		System.out.println(h++);//2 , h = 3
		System.out.println(h);//3
		
		int g = 2;
		System.out.println(++g);//3
		System.out.println(g);//3
		
		//3. post decrement: --
		int x = 2;
		int y = x--;
		System.out.println(x);//1
		System.out.println(y);//2
		
		int f1 = -999;
		int f2 = f1--;
		System.out.println(f1);//-1000
		System.out.println(f2);//-999
		
		//4. pre decrement:
		int g1 = 2;
		int g2 = --g1;
		System.out.println(g1);//1
		System.out.println(g2);//1
		
		double d1 = 1.1;
		double d2 = d1++;
		
		System.out.println(d1);
		System.out.println(d2);
				
		
	}

}
