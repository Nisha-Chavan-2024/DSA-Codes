import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class GraphDemo
{
    static class Edge{
        int src;
        int dist;
        int wt;

        Edge(int src,int dist,int wt)
        {
            this.src=src;
            this.dist=dist;
            this.wt=wt;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[])
    {
        int V=7;
       // ArrayList<Edge> graph[]=new ArrayList[V];

        for(int i=0;i<V;i++)
        {
            graph[i]=new ArrayList<>();
        }

        //for 0
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        //for 1
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));
       

        //for 2
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //for 3
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //for 4
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        //for 5
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        //for 6
        graph[6].add(new Edge(6,5,1));

    }

    public static void BFS(ArrayList<Edge> graph[])
    {
        Queue<Integer> q=new LinkedList<>();

        boolean visit[]=new boolean[graph.length];
        q.add(0);  //add root

        while(!q.isEmpty())
        {
            int cur=q.remove(); //remove from queue

            if(!visit[cur])  // check visited or not
            {
                visit[cur]=true;  //if not make visited
                System.out.println(cur+" ");//print the node

                //add the neibour of node to queue
                for(int i=0;i<graph[cur].size();i++)
                {
                    Edge e = graph[cur].get(i);
                    q.add(e.dist);
                }


            }
        }


    }

    public static void DFS(ArrayList<Edge> graph[],int cur,boolean[] visited)
    {
        
        System.out.println(cur+" ");
       
        visited[cur]=true;

        for(int i=0;i<graph[cur].size();i++)
        {
            Edge e= graph[cur].get(i);
            if(!visited[e.dist])
            {
                DFS(graph,e.dist,visited);
            }

        }
    }

    //has path
    public static  boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean visit[])
    {
        if(src == dest)
         return true;

        visit[src]=true;
        
        for(int i=0;i<graph[src].size();i++)
        {
            Edge e = graph[src].get(i);

            if(!visit[e.dist] && hasPath(graph,e.dist,dest,visit))
               return  true;
        }

        return false;
    }
    public static void main(String arg[])
    {
        int v=7;
       ArrayList<Edge> arr[]=new ArrayList[v];
       creategraph(arr);
	   BFS(arr);
       //DFS(arr,0,new boolean[v]);
        //boolean ans=hasPath(arr,0,5,new boolean[v]);       
        //System.out.println(ans);

        

    }
}
