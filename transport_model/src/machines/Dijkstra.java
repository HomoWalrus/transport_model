package machines;

import java.util.*;

public class Dijkstra {

  public static void shortestPaths(List<Edge>[] edges, int s, double[] prio, int[] pred) {
    Arrays.fill(pred, -1);  				  //��������� ������ pred -1; ��� ������ ������������ ���������� ������� � ����
    Arrays.fill(prio, 2147483647.0);	  //��������� ������ ���� ������(������ �������� �������)
    prio[s] = 0.0;							  //������ ���� �� ����� ������� 0
    PriorityQueue<Long> q = new PriorityQueue<Long>(); // ������� ������������ ������� �� double's
    q.add((long) s);		//��������� � ��� s
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

  static class Edge { //����� "�����"
    int t, cost;

    public Edge(int t, int cost) {
      this.t = t;
      this.cost = cost;
    }
  }
  
  static class koord {  //����������� ����� � ����� ������������
	    int x , y ;

	    public koord(int x , int y) {
	      this.x = x ;
	      this.y = y ;
	    }
	  }

  // �
  
    public static void main(String[] args) {
    	
  
    int[][] /*roads*/cost = {   { 0, 1, 0 }, 
    					{ 0, 0, 1 }, 
    					{ 1, 1, 0 } };//������ ����� ����� ����� �����
  //   kolper = cost.length;	//����������� ������������
//koord [] koordPer ;
    //koordPer = new koord [kolper] ;
    //koordPer[ 0 ] = koord( 100 , 100 ) ;
    //koordPer[ 1 ] = koord( 200 , 100 ) ;
    //koordPer[ 2 ] = koord( 150 , 200 ) ;
   
    //����� ������ ��� �����
    // int kolperekr = roads.length ;
    //int kolversh = 0 ;
    //for ( int i = 0 ; i < kolperekr ; i++  ) {	//������� ���������� ������ � ������� �����
    	//for ( int j = 0 ; j < kolperekr ; j++  ) {
    		//kolversh += roads[i][j] * 2 ;
    		//}
   // }
    
    //System.out.println( kolversh );
    	
   // int [][] cost ;/* = { { 0, 3, 2 }, { 0, 0, -2 }, { 0, 0, 0 } } ; */  //������ 12*12 //������ ���� �� ������� �����
    //cost = new int [ kolversh ][ kolversh ] ;
    //for ( int i = 0 ; i < kolversh ; i++ ){}
    
    
    int n = cost.length ; //n = 3
    List<Edge>[] edges = new List[n]; //������ ������-�����
    for (int i = 0; i < n; i++) {
      edges[i] = new ArrayList<Edge>();  //������� ����� i
      for (int j = 0; j < n; j++) {
        if (cost[i][j] != 0) {
          edges[i].add(new Edge(j, cost[i][j]));// ���� ���� ����, ������� ����� � ����
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