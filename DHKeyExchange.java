class DHKeyExchange{
	public static void main(String args[]){
		long p,alpha;
		long alice_private,bob_private;
		p=Integer.parseInt(args[0]);
		alpha=alpha(p);
		System.out.println("Value of alpha is "+alpha);
		alice_private=Integer.parseInt(args[1]);
		bob_private=Integer.parseInt(args[2]);
		long alice_public = mod(alpha,alice_private,p);
		long bob_public = mod(alpha,bob_private,p);
		System.out.println("Public Key of Alice is "+alice_public);
		System.out.println("Public key of Bob is "+bob_public);
		long Kab = mod(bob_public,alice_private,p);
		long Kba = mod(alice_public,bob_private,p);
		System.out.println("Shared Secret key for alice is "+Kab);
		System.out.println("Shared Sectet key for bob is "+Kba);		
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
	public static long alpha(long p){
		long temp,returnvalue=0;
		int flag=0;
		for(int i=2;i<p;i++)
		{
			for(int j=1;j<=p-2;j++)
			{
				temp = mod(i,j,p);	
				if(temp>1 & temp<p)
					flag++;
				else
				{
					break;
				}
			}
			if(flag==p-2)
			{	
				returnvalue=i;
				break;	
			}
			else
			{
				flag=0;
			}
				
		}
		return returnvalue;
	}
}