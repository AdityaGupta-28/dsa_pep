import java.util.*;


public class graphformation {
    

    public void main(String[] args){
      int n;   /// No. of vertices
      int m;    /// No. of edges 
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter no. of vertices");
      n = sc.nextInt();
      System.out.println("Enter no. of Edges");
      m = sc.nextInt();
      Map<Integer,List<Integer>>adjList =  new HashMap<>();
     System.out.println("Enter edges (u,v)");

      for(int i=0;i<n;i++){
        int u,v;
       
        u = sc.nextInt();
        v = sc.nextInt();
        
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
      }
       for(int node : adjList.keySet()){
        System.out.print(node +" -> ");
        for(int x: adjList.get(node)){
            System.out.print(x+ " ");
        }
        System.out.println();
       }
      
      
    }
}
