import java.util.*;
class Bellamnford{

    public static class Edge{
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

    public static void createGraph(ArrayList<Edge> graph[])
    {
      
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));
        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1)); 

    }


    public static void bellamn(ArrayList<Edge> graph[],int src)
    {
        int dist[]=new int[graph.length];
        int V=graph.length;

        for(int i=0;i<graph.length;i++)
        {
            if(i != src)
               dist[i]=Integer.MAX_VALUE;
        }

        //main algo
        for(int i=0;i<V-1;i++)
        {
            for(int j=0;j<graph.length;j++)
            {
                for(int k=0;k<graph[j].size();k++)
                {
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;

                    if(dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v])
                    {
                        dist[v]=dist[u]+wt;
                    }
                }
            }
        }

        //print the ans
        for(int i=0;i<dist.length;i++)
        {
            System.out.print(dist[i]+" ");
        }
    }

    public static void main(String arg[])
    {
        int V=5;
        ArrayList<Edge> arr[]=new ArrayList[V];
        createGraph(arr);
        bellamn(arr,0);
    
    }
}