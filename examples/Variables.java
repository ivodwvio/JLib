package examples;

public class Variables {
	public static void main(String[] args) {
		// Create variables
		byte by = (byte)42;
		short s = (short)42;
		int i = 42;
		long l = 42L;
		float f = 42.0F;
		double d = 42.0;
		char c = 'A';
		boolean bo = true;
		// Output variables
		System.out.println(by);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bo);
	}
}

/*

byte		-128 to 127
short		-32 768 to 32 767
int			-2 147 483 648 to 2 147 483 647
long		-9 223 372 036 854 775 808 to 9 223 372 036 854 775 807
float		-3.4 x 10^38 to 3.4 x 10^38
double		-1.8 x 10^308 to 1.8 x 10^308
char		thousands of characters and symbols
boolean		true, false

*/
