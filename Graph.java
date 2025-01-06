import java.util.ArrayList;


class GraphDemo
{
    static class Edge{
        int src;
        int dist;
       // int wt;

        Edge(int src,int dist)
        {
            this.src=src;
            this.dist=dist;
            //this.wt=wt;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[])
    {
        int V=6;
       // ArrayList<Edge> graph[]=new ArrayList[V];

        for(int i=0;i<V;i++)
        {
            graph[i]=new ArrayList<>();
        }

        //for 0
       // graph[0].add(new Edge(0,1,1));
       // graph[0].add(new Edge(0,2,1));

        //for 1
        // graph[1].add(new Edge(1,0,1));
        // graph[1].add(new Edge(1,3,1));
       

        // //for 2
        // graph[2].add(new Edge(2,0,1));
        // graph[2].add(new Edge(2,4,1));

        // //for 3
        // graph[3].add(new Edge(3,1,1));
        // graph[3].add(new Edge(3,4,1));
        // graph[3].add(new Edge(3,5,1));

        // //for 4
        // graph[4].add(new Edge(4,2,1));
        // graph[4].add(new Edge(4,3,1));
        // graph[4].add(new Edge(4,5,1));

        // //for 5
        // graph[5].add(new Edge(5,3,1));
        // graph[5].add(new Edge(5,4,1));
        // graph[5].add(new Edge(5,6,1));

        // //for 6
        // graph[6].add(new Edge(6,5,1));




        //topological sort
        // graph[2].add(new Edge(2, 3));
        // graph[3].add(new Edge(3, 1));
        // graph[4].add(new Edge(4, 0));
        // graph[4].add(new Edge(4, 1));
        // graph[5].add(new Edge(5, 0));
        // graph[5].add(new Edge(5, 2));



        //cycle detection in directed graph
        // graph[0].add(new Edge(0,1));
        // graph[0].add(new Edge(0,2));
        // graph[1].add(new Edge(1,3));
        // graph[2].add(new Edge(2,3));
      //  graph[3].add(new Edge(3,0));


        //topological sorting using the BFS
        // graph[0].add(new Edge(0,3));
        // graph[2].add(new Edge(2,3));
        // graph[3].add(new Edge(3,1));
        // graph[4].add(new Edge(4,0));
        // graph[4].add(new Edge(4,1));
        // graph[5].add(new Edge(5,0));
        // graph[5].add(new Edge(5,2));


        //find all possible path from source to destination
        graph[0].add(new Edge(0,3));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));


    }






    // public static void BFS(ArrayList<Edge> graph[])
    // {
    //     Queue<Integer> q=new LinkedList<>();

    //     boolean visit[]=new boolean[graph.length];
    //     q.add(0);  //add root

    //     while(!q.isEmpty())
    //     {
    //         int cur=q.remove(); //remove from queue

    //         if(!visit[cur])  // check visited or not
    //         {
    //             visit[cur]=true;  //if not make visited
    //             System.out.println(cur+" ");//print the node

    //             //add the neibour of node to queue
    //             for(int i=0;i<graph[cur].size();i++)
    //             {
    //                 Edge e = graph[cur].get(i);
    //                 q.add(e.dist);
    //             }


    //         }
    //     }


    // }

    // public static void topSort(ArrayList<Edge> graph[]) {
    //     boolean visit[] = new boolean[graph.length];
    //     Stack<Integer> s = new Stack<>();

    //     for (int i = 0; i < graph.length; i++) {
    //         if (!visit[i]) {
    //             topSortUtil(graph, i, s, visit);
    //         }
    //     }

    //     while (!s.isEmpty()) {
    //         System.out.print(s.pop() + " ");
    //     }
    // }

    // public static void topSortUtil(ArrayList<Edge> graph[], int cur, Stack<Integer> s, boolean visit[]) {
    //     visit[cur] = true;

    //     for (int i = 0; i < graph[cur].size(); i++) {
    //         Edge e = graph[cur].get(i);
    //         if (!visit[e.dist]) {
    //             topSortUtil(graph, e.dist, s, visit);
    //         }
    //     }

    //     s.push(cur); // Push the node onto the stack after exploring all its neighbors
    // }

    // public static void DFS(ArrayList<Edge> graph[],int cur,boolean[] visited)
    // {
        
    //     System.out.println(cur+" ");
       
    //     visited[cur]=true;

    //     for(int i=0;i<graph[cur].size();i++)
    //     {
    //         Edge e= graph[cur].get(i);
    //         if(!visited[e.dist])
    //         {
    //             DFS(graph,e.dist,visited);
    //         }

    //     }
    // }

    // //has path
    // public static  boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean visit[])
    // {
    //     if(src == dest)
    //      return true;

    //     visit[src]=true;
        
    //     for(int i=0;i<graph[src].size();i++)
    //     {
    //         Edge e = graph[src].get(i);

    //         if(!visit[e.dist] && hasPath(graph,e.dist,dest,visit))
    //            return  true;
    //     }

    //     return false;
    // }





    //find the cycle is present or not in cyclic graph using 

    // public static boolean dfscycle(ArrayList<Edge> graph[])
    // {
    //     boolean visit[]=new boolean[graph.length];
    //     boolean stack[]=new boolean[graph.length];

    //     for(int i=0;i<graph.length;i++)
    //     {
    //         if(!visit[i])
    //         {
    //             if(dfsutil(graph,stack,i,visit))
    //             {
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    // }

    // public static boolean dfsutil(ArrayList<Edge> graph[],boolean st[],int cur,boolean visit[])
    // {
    //     st[cur]=true;
    //     visit[cur]=true;

    //     for(int i=0;i<graph[cur].size();i++)
    //     {
    //         Edge e=graph[cur].get(i);

    //         if(st[e.dist] == true)
    //         {
    //             return true;
    //         }

    //         if(!visit[cur] && dfsutil(graph,st,e.dist,visit))
    //         {
    //             return true;
    //         }
    //     }

    //     st[cur]=false;
    //     return false;

    // }



    //Topological sorting using the BFS

    // public static void calindeg(ArrayList<Edge> graph[],int indeg[])
    // {
    //     for(int i=0;i<graph.length;i++)
    //     {
    //         for(int j=0;j<graph[i].size();i++)
    //         {
    //             Edge e=graph[i].get(i);
    //             indeg[e.dist]++;
    //         }
    //     }
    // }

    // public static void bfssort(ArrayList<Edge> graph[])
    // {
    //     int indeg[]=new int[graph.length];
    //      calindeg(graph,indeg);
    //      Queue<Integer> q=new LinkedList<>();

    //      for(int i=0;i<graph.length;i++)
    //      {
    //         if(indeg[i] == 0)
    //         {
    //             q.add(i);
    //         }
    //      }

    //      while(!q.isEmpty())
    //      {
    //         int cur=q.remove();
    //         System.out.print(cur+" ");

    //         for(int i=0;i<graph[cur].size();i++)
    //         {
    //             Edge e=graph[cur].get(i);
    //             indeg[e.dist]--;
    //             if(indeg[e.dist] == 0)
    //             {
    //                 q.add(i);
    //             }
    //         }
    //      }
    // }


    //find the all the possible path from the dsrc to destination
    public static void utilpath(ArrayList<Edge> graph[],int src,int dest,String path)
    {
        if(src == dest)
        {
          System.out.print(path+dest);
          return;
        }
          

        for(int i=0;i<graph[src].size();i++)
        {
            Edge e=graph[src].get(i);
            utilpath(graph,e.dist,dest,path+src);
        }  
    }
   

    public static void main(String arg[])
    {
        int v=6;
       ArrayList<Edge> arr[]=new ArrayList[v];
       creategraph(arr);
       utilpath(arr,5,1,"");
     //  bfssort(arr);
       //System.out.print(dfscycle(arr));
	//   BFS(arr);
       //DFS(arr,0,new boolean[v]);
        //boolean ans=hasPath(arr,0,5,new boolean[v]);       
        //System.out.println(ans);

        //topSort(arr);

    }
}
