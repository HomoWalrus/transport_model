package machines;

import java.util.*;

public class Dijkstra {

  public static void shortestPaths(List<Edge>[] edges, int s, double[] prio, int[] pred) {
    Arrays.fill(pred, -1);  				  //заполняем массив pred -1; это массив показывающий предыдущию вершину в пути
    Arrays.fill(prio, 2147483647.0);	  //заполняем массив макс интами(просто большими числами)
    prio[s] = 0.0;							  //ставим путь до нашей вершины 0
    PriorityQueue<Long> q = new PriorityQueue<Long>(); // сделаем приоритетную очередь из double's
    q.add((long) s);		//добавляем в нее s
    while (!q.isEmpty()) {
      double cur = q.remove();
      int curu = (int) cur;
    //  if ((int)cur >>> 32 != (int)prio[curu])
       // continue;
      for (Edge e : edges[curu]) {
        int v = e.t;
        double nprio = prio[curu] + e.cost;
        if (prio[v] > nprio) {
          prio[v] = nprio;
          pred[v] = curu;
          q.add(((long) nprio << 32) + v);
        }
      }
    }
  }

  static class Edge { //класс "ребро"
    int t, cost;

    public Edge(int t, int cost) {
      this.t = t;
      this.cost = cost;
    }
  }
  
  static class koord {  //простенький класс с двумя координатами
	    int x , y ;

	    public koord(int x , int y) {
	      this.x = x ;
	      this.y = y ;
	    }
	  }

  // ы
  
    public static void main(String[] args) {
    	
  
    int[][] /*roads*/cost = {   { 0, 1, 0 }, 
    					{ 0, 0, 1 }, 
    					{ 1, 1, 0 } };//массив дорог цифра длина ребра
  //   kolper = cost.length;	//колличество перекрестков
//koord [] koordPer ;
    //koordPer = new koord [kolper] ;
    //koordPer[ 0 ] = koord( 100 , 100 ) ;
    //koordPer[ 1 ] = koord( 200 , 100 ) ;
    //koordPer[ 2 ] = koord( 150 , 200 ) ;
   
    //решил делать без этого
    // int kolperekr = roads.length ;
    //int kolversh = 0 ;
    //for ( int i = 0 ; i < kolperekr ; i++  ) {	//считаем количество вершин в рабочем графе
    	//for ( int j = 0 ; j < kolperekr ; j++  ) {
    		//kolversh += roads[i][j] * 2 ;
    		//}
   // }
    
    //System.out.println( kolversh );
    	
   // int [][] cost ;/* = { { 0, 3, 2 }, { 0, 0, -2 }, { 0, 0, 0 } } ; */  //массив 12*12 //делаем прям по массиву роадс
    //cost = new int [ kolversh ][ kolversh ] ;
    //for ( int i = 0 ; i < kolversh ; i++ ){}
    
    
    int n = cost.length ; //n = 3
    List<Edge>[] edges = new List[n]; //массив листов-ребер
    for (int i = 0; i < n; i++) {
      edges[i] = new ArrayList<Edge>();  //создали ребро i
      for (int j = 0; j < n; j++) {
        if (cost[i][j] != 0) {
          edges[i].add(new Edge(j, cost[i][j]));// Если есть путь, создаем ребро в лист
        }
      }
    }
    double[] dist = new double[n];
    int[] pred = new int[n];
    shortestPaths(edges, 0, dist, pred);
    System.out.println(dist[0]);
    System.out.println(dist[1]);
    System.out.println(dist[2]);
    System.out.println(pred[0]);
    System.out.println(pred[1]);
    System.out.println(pred[2]);
    //System.out.println( 13785875 >>> 32);
  }
}