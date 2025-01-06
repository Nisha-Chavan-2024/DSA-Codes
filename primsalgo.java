import java.util.*;

class PrimsAlgo{
    
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
    
    public static class Pair implements Comparable<Pair>
    {
        int v;
        int cost;
        
        Pair(int v,int cost)
        {
            this.v=v;
            this.cost=cost;
        }
        
        @Override
        public int compareTo(Pair p2)
        {
            return this.cost-p2.cost;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        
        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));
          
        graph[1].add(new Edge(1,3,40));
        graph[2].add(new Edge(2,3,50));
    }
    
    public static void prims(ArrayList<Edge> graph[],int src)
    {
        boolean visit[]=new boolean[graph.length];
        int total=0;
        PriorityQueue<Pair> q=new PriorityQueue<>();
        ArrayList<Integer> a=new ArrayList<>();
        q.add(new Pair(0,0));
        
        while(!q.isEmpty())
        {
            Pair cur=q.remove();
            if(!visit[cur.v])
            {
                visit[cur.v]=true;
                a.add(cur.v);
               // total+=cur.cost;
                
                //neibour
                for(int i=0;i<graph[cur.v].size();i++)
                {
                    Edge e=graph[cur.v].get(i);
                    int u=e.src;
                    int v=e.dest;
                    int wt=e.wt;
                    
                    q.add(new Pair(v,wt));
                }
            }
            
            
        }
        
        //System.out.println(total);
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }
    }
    
    public static void main(String arg[])
    {
        ArrayList<Edge> arr[]=new ArrayList[4];
        createGraph(arr);
        prims(arr,0);
    }
}