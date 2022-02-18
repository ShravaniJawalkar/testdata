package threadpattern;
// Java implementation of the approach
import java.util.*;

class GFG
{

// To store the required answer
static int ans = 0;

// To store the graph
static Vector<Vector<Integer>> gr = new Vector<Vector<Integer>>();

// Function to add edges
static void Add_Edge(int u, int v)
{
	gr.get(u).add(v);
	gr.get(v).add(u);
}

// Dfs function
static void dfs(int child, int par, int color[])
{

	// When there is difference in colors
	if (color[child] != color[par])
		ans++;

	// For all it's child nodes
	for (int i = 0; i < gr.get(child).size(); i++)
	{
		if (gr.get(child).get(i) == par)
			continue;
		dfs(gr.get(child).get(i), child, color);
	}
}

// Driver code
public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("number");
	int n= sc.nextInt();
//	int k=n+2;
	for(int i = 0; i <= n; i++)
	gr.add(new Vector<Integer>());

	// Here zero is for parent of node 1
	int color[] = new int[n+1];
	System.out.println("Adding color");
	for(int i=0;i<color.length;i++)
	{	int f=sc.nextInt();
	color[i]=f;}


	// Adding edges in the graph
	/*
	 * Add_Edge(1, 2); Add_Edge(1, 3); Add_Edge(2, 4); Add_Edge(2, 5); Add_Edge(3,
	 * 6);
	 */
	System.out.println("Adding edge");
for(int i=1;i<=n;i++) {
	int x=sc.nextInt();
	int y=sc.nextInt();
	if(x<=n && y<=n) {
		Add_Edge(x,y);
	}
	else {
		System.out.println("no valid entry");
		break;
	}
}
	// Dfs call
	dfs(1, 0, color);

	// Required answer
	System.out.println( ans);
}
}


