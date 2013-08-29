package machines;

import java.util.*;	//колличество перекрестков
//import static java.lang.Math.* ;

public class Dijkstra {

  public static void shortestPaths(List<Edge>[] edges, int s, /*double*/long[] prio, int[] pred) {
    Arrays.fill(pred, -1);  				  //fill array pred -1
    Arrays.fill(prio, 2147483647/*.0*/);	  //fill array prio maxintami
    prio[s] = 0/*.0*/;							  //put 0 in start point
    PriorityQueue<Long> q = new PriorityQueue<Long>(); // create queue with priority
    q.add((long) s);		//add start point in queue
    while (!q.isEmpty()) {
      long cur = q.remove();
      int curu = (int) cur;
      if (/*(int)*/cur >>> 32 != /*(int)*/prio[curu])
        continue;
      for (Edge e : edges[curu]) {
        int v = e.t;
        /*double*/long nprio = prio[curu] + e.cost;
        if (prio[v] > nprio) {
          prio[v] = nprio;
          pred[v] = curu;
          q.add(((long) nprio << 32) + v);
        }
      }
    }
  }

    // ы
  
    public static void main(String[] args) {
    	
  
        
        maps used = new maps() ;
        used.mapinfo( 3 );
        
    
    
    int n = global.cost.length ; //
    List<Edge>[] edges = new List[n]; //create list of edges
    for (int i = 0; i < n; i++) {
      edges[i] = new ArrayList<Edge>();  //create it
      for (int j = 0; j < n; j++) {
        if (global.cost[i][j] != 0) {
          edges[i].add(new Edge(j, global.cost[i][j]));// add edge in list
        }
      }
    }
    long[] dist = new long[n];
    int[] pred = new int[n];
    int start = 81 ;
    shortestPaths(edges, start , dist, pred);
    //вывод    
    int end = 28 ;
    Stack shortestpath = new Stack();
    shortestpath.push(end) ;
    	int rab = (int)shortestpath.peek() ;
    	while ( rab != start ) 
    	{
    		shortestpath.push(pred[rab]) ;
    		rab = (int)shortestpath.peek() ;
    	}
    	
    	System.out.print( shortestpath.pop() ) ; //вывод пути
    	while ( shortestpath.empty() == false ){
    		System.out.print( " -> " + shortestpath.pop() ) ;
    	}
   }
}