
public class addEvenNumsFS 
{
	public static void main(String[] args) 
	{
		int j = 1;
		int k = 1;
		int sum;
		int totalSum = 0;
		outerloop:
			while(true)
			{
				sum = j + k;
				j = k;
				k = sum;
				if(sum % 2 == 0)
				{
					totalSum += sum;
					if (totalSum > 4000000)
					{
						break outerloop;
					}
				}
			}
		System.out.println(totalSum);
	}
}