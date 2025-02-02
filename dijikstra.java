import java.util.*;

class Solution
{
    
static class Edge{
    int src;
    int dest;
    int wt;
    
    Edge(int src,int dest,int wt)
    {
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }
}

static class Pair implements Comparable<Pair>
{
    int n;
    int distance;
    
    Pair(int n,int distance)
    {
        this.n=n;
        this.distance=distance;
    }
    
    @Override
    public int compareTo(Pair p2)
    {
        return this.distance-p2.distance;
    }
}
    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));
        
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,5,1));
         
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
        
    }
    
    
    public static void dijikstra(ArrayList<Edge> graph[],int src)
    {
        int dist[]=new int[graph.length];
        boolean visit[]=new boolean[graph.length];
        
        for(int i=0;i<graph.length;i++)
        {
            if(i != src)
            {
                dist[i]=Integer.MAX_VALUE;
            }
        }
        
        PriorityQueue<Pair> qp=new PriorityQueue<>();
        qp.add(new Pair(src,0));
        
        while(!qp.isEmpty())
        {
            Pair cur=qp.remove();
            
            if(!visit[cur.n])
            {
                visit[cur.n]=true;
                for(int i=0;i<graph[cur.n].size();i++)
                {
                    Edge e=graph[cur.n].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    
                    
                    if(dist[u] + wt < dist[v])
                    {
                        dist[v]=dist[u] + wt;
                        qp.add(new Pair(v,dist[v]));
                    }
                }
            }
        }
        
        for(int i=0;i<dist.length;i++)
        {
            System.out.print(dist[i]+" ");
        }
    }
    
    
    public static void main(String arg[])
    { 
        ArrayList<Edge> arr[]=new ArrayList[6];
        createGraph(arr);
        dijikstra(arr,0);
        
        
        
    }
}