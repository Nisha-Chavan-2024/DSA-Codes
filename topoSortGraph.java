import java.util.*;

class GraphDemo {
    static class Edge {
        int src;
        int dist;

        Edge(int src, int dist) {
            this.src = src;
            this.dist = dist;
        }
    }

    public static void creategraph(ArrayList<Edge> graph[]) {
        int V = 7;

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        boolean visit[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!visit[i]) {
                topSortUtil(graph, i, s, visit);
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> graph[], int cur, Stack<Integer> s, boolean visit[]) {
        visit[cur] = true;

        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);
            if (!visit[e.dist]) {
                topSortUtil(graph, e.dist, s, visit);
            }
        }

        s.push(cur); // Push the node onto the stack after exploring all its neighbors
    }

    public static void main(String arg[]) {
        int v = 7;
        ArrayList<Edge> arr[] = new ArrayList[v];
        creategraph(arr);
        topSort(arr);
    }
}
