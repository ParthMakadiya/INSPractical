class RailfenceCipher
{
	public static void main(String args[])
	{
		String plaintext=args[0];
		int length=plaintext.length();
		StringBuffer ciphertext=new StringBuffer();
		StringBuffer decryption=new StringBuffer();
		int count=0;
		for(int i=0;i<length;i++)
		{
			if(i%2==0)
			{
				ciphertext.append(plaintext.charAt(i));
				i++;
				count++;
			}
		
		}
		for(int i=0;i<length;i++)
		{
			if(i%2!=0)
			{
				ciphertext.append(plaintext.charAt(i));
				i++;
			}
		}
		System.out.println("Cipher text is");
		System.out.println(ciphertext);
		System.out.println("Decryption is");
		for(int i=0;i<(length/2)+1;i++)
		{
			decryption.append(ciphertext.charAt(i));
			if(count<length)
			{
				decryption.append(ciphertext.charAt(count));
				count++;
			}
		}
		System.out.println(decryption);
	}
}

