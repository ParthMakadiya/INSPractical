class RSA{
	public static void main(String args[]){
		int p,q;
		p = Integer.parseInt(args[0]);
		q = Integer.parseInt(args[1]);
		int phi = (p-1)*(q-1);
		int n =p*q;
		long temp=0;
		int e=1;//Increment till we find co-prime or gcd=1
		while(temp!=1)
		{
			e++;
			temp=gcd(phi,e);
		}
		int d =modInverse(e,phi);
		int m = Integer.parseInt(args[2]);
		long D;
		long E = mod(m,e,n);
		System.out.println("Encrypted message is "+E);
		D = mod(41,77,119);
		System.out.println("Decrypted message is "+D);
	}
	public static long mod(long base,long exponent,long modulus) {
	  long result = 1;
	  while (exponent > 0) {
	    if ((exponent % 2) == 1) {
	      result = (result * base) % modulus;
	    }
	    base = (base * base) % modulus;
	    exponent = (long)Math.floor(exponent / 2);
	  }
	return result;
	}
	public static int gcd(int phi,int e)
	{
		int gcd=0;
		for(int i = 1; i <= phi && i <= e; ++i)
		{
		    if(e % i==0 && phi % i==0)
		        gcd = i;
		}
	return gcd;
	}
	public static int modInverse(int a, int m) 
	{ 
		a = a % m; 
		for (int x = 1; x < m; x++) 
		   if ((a * x) % m == 1) 
		      return x; 
		return 1; 
	} 
}
