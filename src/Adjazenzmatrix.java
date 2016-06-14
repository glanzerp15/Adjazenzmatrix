
public class Adjazenzmatrix {

	public static void main(String[] args) {
		
		int [] a = {1, 4, 3, 2};
		adjazenz(a);
	}
	
	public static void adjazenz(int [] a)
	{
		
		int [][] adj = new int [a.length][a.length];
		
		for(int i = 0; i < adj.length; i++)
		{
			for(int j = 0; j < adj[0].length; j++)
			{
				adj[i][j] = 0;
			}
		}

		for(int i = 0; i < adj.length - 1; i++)
		{
			adj[a[i] - 1][a[i + 1] -1] = 1;
		}
		
		for(int i = 0; i < a.length; i++)
		{
			adj[i][i] = 1;
		}
		

		for(int i = 0; i < adj.length; i++)
		{
			for(int j = 0; j <adj.length; j++)
			{
				if(adj[j][i] == 1)
				{
					for(int k = 0; k < adj.length; k++)
					{
						if(adj[i][k] == 1)
						{
							adj[j][k] = 1;
						}
					}
				}
			}
		}
		
		showAdj(adj);
	}
	
	public static void showAdj(int [][] a)
	{
		for(int i = 0; i <a.length; i++)
		{
			for(int j = 0; j < a[0].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

}
