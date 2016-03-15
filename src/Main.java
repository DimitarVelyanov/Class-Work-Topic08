public class Main {
	public static void f1(int a, int b) {
		System.out.println(a + b);
	}

	public static int f2(int a, int b) {
		return a + b;
	}

	public static void f3(int array[]) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void f3(String text) {
		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		/*
		 *Задача 1
		*/
		f1(1, 2);

		/*
		 *Задача 2
		*/
		System.out.println(f2(3, 4));

		/*
		 *Задача 3
		*/
		f3(new int[] { 1, 2, 3, 4, 5 });

		/*
		 *Задача 4
		*/
		f3("Hello!");
	}
}