public class EulerBernoulliTriangle {
	
	private int height;
	private long[][] elems;
	
	public EulerBernoulliTriangle(int h) {
		this.height = h;
		initialize();
		//printTriangle();
		System.out.println("The Euler numbers:\n" + getEulerNumbers());
		System.out.println("The Bernoulli numbers:\n" + getBernoulliNumbers());
	}
	
	private void initialize() {
		elems = new long[height][];
		elems[0] = new long[1];
		elems[0][0] = 1;
		int lodd, leven;
		for (int i = 1; i < height; i+=2) {
			lodd = i+1;
			leven = i+2;
			elems[i] = new long[lodd];
			elems[i+1] = new long[leven];
			elems[i][0] = 0;
			elems[i+1][leven - 1] = 0;
			for (int j = 1; j < lodd; j++) {
				elems[i][j] = elems[i-1][j-1] + elems[i][j-1];
			}
			for (int j = leven - 2; j >= 0; j--) {
				elems[i+1][j] = elems[i+1][j+1] + elems[i][j];
			}
		}		
	}
	
	public void printTriangle() {
		for (int i = 0; i < elems.length; i++) {
			for (int j = 0; j < elems[i].length; j++)
				System.out.print(elems[i][j] + " ");
			System.out.println();
		}
	}
	
	public long[] euler() { 
		long[] left = new long[(height-1) / 2];
		left[0] = 1;
		for (int i = 1; i<left.length; i++)
			left[i] = elems[2*i][0];
		return left;
	}
	
	public String getEulerNumbers() {
		String s = "";
		for(Long eul : euler())
			s += eul + "\n";
		return s + "That\'s " + euler().length + " Euler numbers\n" ;
	}
	
	public long[] bernoulli() {
		long[] right = new long[height / 2];
		right[0] = 1;
		for (int i = 1; i<right.length; i++) 
			right[i] = elems[2*i - 1][2*i - 1];
		return right;
	}

	public String getBernoulliNumbers() {
		String s = "";
		for(Long ber : bernoulli())
			s += ber + "\n";
		return s + "That\'s " + bernoulli().length + " Bernoulli numbers\n" ;
	}
	
	public static void main(String[] args) {
		assert args.length > 0;
		int i = 0;
		try { 
			i = Integer.parseInt(args[0]);
		} catch (NumberFormatException nfe) {
			System.out.println(nfe.toString() + " must be odd integer");
		} finally {
			if (i%2 != 1 || i == 1) {
				System.out.println("Enter an odd number greater than 2 only");
				System.exit(1);
			}
			System.out.println("The height of the triangle is " + i);
		}
		
		EulerBernoulliTriangle triangle = new EulerBernoulliTriangle(i);
	}
}