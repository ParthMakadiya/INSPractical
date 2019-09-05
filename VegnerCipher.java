class VegnerCipher
{
	public static void main(String args[])
	{
		String plaintext=args[0];
		String key=args[1];
		String alphabet="ABCDFGHIJKLMNOPQRSTUVWXYZ";
		plaintext=plaintext.toUpperCase();
		key=key.toUpperCase();
		int keylength=key.length();
		int plaintextLength=plaintext.length();
		char ciphertext[]=new char[plaintextLength];
		int j=0;
		for(int i=0;i<plaintextLength;i++)
		{
			if(j>=keylength)
			{
				j=0;
			}
			int result=plaintext.codePointAt(i)+alphabet.indexOf(key.charAt(j));
			j++;
			if(result>90)
			{
				result=result-26;
			}
			else
			{
				ciphertext[i]=(char)result;
			}
		}
		System.out.print("cipher text is :");
		for(int i=0;i<plaintextLength;i++)
		{
			
			System.out.print(ciphertext[i]);
		}
	}
}
			

