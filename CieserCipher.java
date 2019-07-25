class CieserCipher
{
	public static void main(String args[])
	{
		String msg=args[0];
		System.out.println("original message is " +args[0]);
		int length=msg.length();
		char message[]=msg.toCharArray();
		char cipher[]=new char[length];
		char decrypt[]=new char[length];
		int key=Integer.parseInt(args[1]);
		
		System.out.print("encrypted message is ");
		for(int i=0;i<length;i++)
		{
			int temp1=(int)message[i];
			int intermediate=temp1+key;
			if(temp1==32)
			{
				cipher[i]=(char)temp1;
			}
			else if(intermediate>90)
			{
				int flag=intermediate-90;
				cipher[i]=(char)(64+flag);
			}
			else
			{
				cipher[i]=(char)intermediate;
			}
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(cipher[i]);
		}
		
		System.out.println();
		System.out.print("Decrypted message is ");
		for(int i=0;i<length;i++)
		{
			int temp2=(int)cipher[i];
			int decrypt1=temp2-key;
			if(temp2==32)
			{
				decrypt[i]=(char)temp2;
			}
			else if(decrypt1<65)
			{
				decrypt1=decrypt1+26;
				decrypt[i]=(char)decrypt1;
			}
			else
			{
				decrypt[i]=(char)decrypt1;
			}
		}
		for(int i=0;i<length;i++)
		{
			System.out.print(decrypt[i]);
		}
	}
}