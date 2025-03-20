class Solution {
    int[] parent, minCost;
    public int find(int u)
	{
		if(parent[u]<0) return u;
		return parent[u] = find(parent[u]);
	}
	public int[] minimumCost(int n, int[][] edges, int[][] query) {
		parent = new int[n];
		minCost = new int[n];
		Arrays.fill(parent, -1);
		Arrays.fill(minCost, -1);
		for(int[] edge: edges)
		{
			int u = find(edge[0]), v = find(edge[1]), w = edge[2];
			if(u!=v)
			{
				minCost[u] &= minCost[v];
				parent[v] = u;
			}	
			minCost[u] &= w;
		}
		int res[] = new int[query.length];
		for(int i=0;i<query.length;i++)
		{
			int source = query[i][0], target = query[i][1];
			int absSourceRoot = find(source), absTargetRoot = find(target);
			if(absSourceRoot != absTargetRoot) res[i] = -1;
			else res[i] = minCost[absSourceRoot];
		}	
		return res;
	}
}