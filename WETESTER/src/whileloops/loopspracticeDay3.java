package whileloops;

public class loopspracticeDay3 {
	
void callingforloop()
	
	{
		int n =5;
		for  (int i=0;i<=4;i++)
		{
		for (int j=4;j>=i;j--)
		{
			
				System.out.print(n);
		}
		n--;
		System.out.println();
		}
			
	}

	public static void main(String[] args) {
		loopspracticeDay3 L1 = new loopspracticeDay3();
		L1.callingforloop();
		System.out.println("Done...");

	}

}
