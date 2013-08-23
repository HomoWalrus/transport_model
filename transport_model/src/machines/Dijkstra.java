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
    	
  
        int kolper = 66;	//колличество перекрестков
       // koord [] global.koordPer ;
       // global.koordPer = new koord [ kolper ] ;
        global.koordPer[ 0 ] = new koord();
        global.koordPer[ 1 ] = new koord();
        global.koordPer[ 2 ] = new koord();
        global.koordPer[ 3 ] = new koord();
        global.koordPer[ 4 ] = new koord();
        global.koordPer[ 5 ] = new koord();
        global.koordPer[ 6 ] = new koord();
        global.koordPer[ 7 ] = new koord();
        global.koordPer[ 8 ] = new koord();
        global.koordPer[ 9 ] = new koord();
        global.koordPer[ 10 ] = new koord();
        global.koordPer[ 11 ] = new koord();
        global.koordPer[ 12 ] = new koord();
        global.koordPer[ 13 ] = new koord();
        global.koordPer[ 14 ] = new koord();
        global.koordPer[ 15 ] = new koord();
        global.koordPer[ 16 ] = new koord();
        global.koordPer[ 17 ] = new koord();
        global.koordPer[ 18 ] = new koord();
        global.koordPer[ 19 ] = new koord();
        global.koordPer[ 20 ] = new koord();
        global.koordPer[ 21 ] = new koord();
        global.koordPer[ 22 ] = new koord();
        global.koordPer[ 23 ] = new koord();
        global.koordPer[ 24 ] = new koord();
        global.koordPer[ 25 ] = new koord();
        global.koordPer[ 26 ] = new koord();
        global.koordPer[ 27 ] = new koord();
        global.koordPer[ 28 ] = new koord();
        global.koordPer[ 29 ] = new koord();
        global.koordPer[ 30 ] = new koord();
        global.koordPer[ 31 ] = new koord();
        global.koordPer[ 32 ] = new koord();
        global.koordPer[ 33 ] = new koord();
        global.koordPer[ 34 ] = new koord();
        global.koordPer[ 35 ] = new koord();
        global.koordPer[ 36 ] = new koord();
        global.koordPer[ 37 ] = new koord();
        global.koordPer[ 38 ] = new koord();
        global.koordPer[ 39 ] = new koord();
        global.koordPer[ 40 ] = new koord();
        global.koordPer[ 41 ] = new koord();
        global.koordPer[ 42 ] = new koord();
        global.koordPer[ 43 ] = new koord();
        global.koordPer[ 44 ] = new koord();
        global.koordPer[ 45 ] = new koord();
        global.koordPer[ 46 ] = new koord();
        global.koordPer[ 47 ] = new koord();
        global.koordPer[ 48 ] = new koord();
        global.koordPer[ 49 ] = new koord();
        global.koordPer[ 50 ] = new koord();
        global.koordPer[ 51 ] = new koord();
        global.koordPer[ 52 ] = new koord();
        global.koordPer[ 53 ] = new koord();
        global.koordPer[ 54 ] = new koord();
        global.koordPer[ 55 ] = new koord();
        global.koordPer[ 56 ] = new koord();
        global.koordPer[ 57 ] = new koord();
        global.koordPer[ 58 ] = new koord();
        global.koordPer[ 59 ] = new koord();
        global.koordPer[ 60 ] = new koord();
        global.koordPer[ 61 ] = new koord();
        global.koordPer[ 62 ] = new koord();
        global.koordPer[ 63 ] = new koord();
        global.koordPer[ 64 ] = new koord();
        global.koordPer[ 65 ] = new koord();
        
        global.koordPer[ 0 ].setkoord( 2 , 38 ) ;
        global.koordPer[ 1 ].setkoord( 29 , 312 ) ;
        global.koordPer[ 2 ].setkoord( 33, 47 ) ;
        global.koordPer[ 3 ].setkoord( 117, 34 ) ;
        global.koordPer[ 4 ].setkoord( 118, 110 ) ;
        global.koordPer[ 5 ].setkoord( 170 , 118 ) ;
        global.koordPer[ 6 ].setkoord( 169 , 282 ) ;
        global.koordPer[ 7 ].setkoord( 230 , 294 ) ;
        global.koordPer[ 8 ].setkoord( 232 , 318 ) ;
        global.koordPer[ 9 ].setkoord( 254 , 339 ) ;
        global.koordPer[ 10 ].setkoord( 255 , 377 ) ;
        global.koordPer[ 11 ].setkoord( 286 , 118 ) ;
        global.koordPer[ 12 ].setkoord( 283 , 8 ) ;
        global.koordPer[ 13 ].setkoord( 380 , 120 ) ;
        global.koordPer[ 14 ].setkoord( 380 , 6 ) ;
        global.koordPer[ 15 ].setkoord( 534 , 119 ) ;
        global.koordPer[ 16 ].setkoord( 539 , 55 ) ;
        global.koordPer[ 17 ].setkoord( 573 , 51 ) ;
        global.koordPer[ 18 ].setkoord( 666 , 118 ) ;
        global.koordPer[ 19 ].setkoord( 674 , 5 ) ;
        global.koordPer[ 20 ].setkoord( 735 , 117 ) ;
        global.koordPer[ 21 ].setkoord( 794 , 118 ) ;
        global.koordPer[ 22 ].setkoord( 739 , 269 ) ;
        global.koordPer[ 23 ].setkoord( 796 , 272 ) ;
        global.koordPer[ 24 ].setkoord( 664 , 271 ) ;
        global.koordPer[ 25 ].setkoord( 665 , 195 ) ;
        global.koordPer[ 26 ].setkoord( 382 , 195 ) ;
        global.koordPer[ 27 ].setkoord( 387 , 325 ) ;
        global.koordPer[ 28 ].setkoord( 529 , 325 ) ;
        global.koordPer[ 30 ].setkoord( 594 , 325 ) ;
        global.koordPer[ 31 ].setkoord( 499 , 389 ) ;
        global.koordPer[ 32 ].setkoord( 496 , 410 ) ;
        global.koordPer[ 33 ].setkoord( 661 , 388 ) ;
        global.koordPer[ 34 ].setkoord( 730 , 325 ) ;
        global.koordPer[ 35 ].setkoord( 795 , 327 ) ;
        global.koordPer[ 36 ].setkoord( 732 , 393 ) ;
        global.koordPer[ 37 ].setkoord( 794 , 391 ) ;
        global.koordPer[ 38 ].setkoord( 735 , 485 ) ;
        global.koordPer[ 39 ].setkoord( 795 , 488 ) ;
        global.koordPer[ 40 ].setkoord( 662 , 556 ) ;
        global.koordPer[ 41 ].setkoord( 731 , 558 ) ;
        global.koordPer[ 42 ].setkoord( 734 , 525 ) ;
        global.koordPer[ 43 ].setkoord( 794 , 558 ) ;
        global.koordPer[ 44 ].setkoord( 534 , 556 ) ;
        global.koordPer[ 45 ].setkoord( 381 , 556 ) ;
        global.koordPer[ 46 ].setkoord( 116 , 563 ) ;
        global.koordPer[ 47 ].setkoord( 115 , 473 ) ;
        global.koordPer[ 48 ].setkoord( 43 , 561 ) ;
        global.koordPer[ 49 ].setkoord( 5 , 601 ) ;
        global.koordPer[ 50 ].setkoord( 34 , 629 ) ;
        global.koordPer[ 51 ].setkoord( 42 , 700 ) ;
        global.koordPer[ 52 ].setkoord( 1 , 685 ) ;
        global.koordPer[ 53 ].setkoord( 120 , 729 ) ;
        global.koordPer[ 54 ].setkoord( 120 , 766 ) ;
        global.koordPer[ 55 ].setkoord( 387 , 741 ) ;
        global.koordPer[ 56 ].setkoord( 388 , 769 ) ;
        global.koordPer[ 57 ].setkoord( 462 , 740 ) ;
        global.koordPer[ 58 ].setkoord( 462 , 770 ) ;
        global.koordPer[ 59 ].setkoord( 540 , 739 ) ;
        global.koordPer[ 60 ].setkoord( 538 , 768 ) ;
        global.koordPer[ 61 ].setkoord( 666 , 738 ) ;
        global.koordPer[ 62 ].setkoord( 665 , 769 ) ;
        global.koordPer[ 63 ].setkoord( 795 , 737 ) ;
        global.koordPer[ 64 ].setkoord( 665 , 634 ) ;
        global.koordPer[ 65 ].setkoord( 796 , 630 ) ;
        
         
        
        
        int koldor = 75 ;	//колличество перекрестков
        road [] roads ;
        roads = new road [koldor] ;//array of roads, for convenience
        roads[ 0 ] = new road() ;
        roads[ 1 ] = new road() ;
        roads[ 2 ] = new road() ;
        roads[ 3 ] = new road() ;
        roads[ 4 ] = new road() ;
        roads[ 5 ] = new road() ;
        roads[ 6 ] = new road() ;
        roads[ 7 ] = new road() ;
        roads[ 8 ] = new road() ;
        roads[ 9 ] = new road() ;
        roads[ 10 ] = new road() ;
        roads[ 11 ] = new road() ;
        roads[ 12 ] = new road() ;
        roads[ 13 ] = new road() ;
        roads[ 14 ] = new road() ;
        roads[ 15 ] = new road() ;
        roads[ 16 ] = new road() ;
        roads[ 17 ] = new road() ;
        roads[ 18 ] = new road() ;
        roads[ 19 ] = new road() ;
        roads[ 20 ] = new road() ;
        roads[ 21 ] = new road() ;
        roads[ 22 ] = new road() ;
        roads[ 23 ] = new road() ;
        roads[ 24 ] = new road() ;
        roads[ 25 ] = new road() ;
        roads[ 26 ] = new road() ;
        roads[ 27 ] = new road() ;
        roads[ 28 ] = new road() ;
        roads[ 29 ] = new road() ;
        roads[ 30 ] = new road() ;
        roads[ 31 ] = new road() ;
        roads[ 32 ] = new road() ;
        roads[ 33 ] = new road() ;
        roads[ 34 ] = new road() ;
        roads[ 35 ] = new road() ;
        roads[ 36 ] = new road() ;
        roads[ 37 ] = new road() ;
        roads[ 38 ] = new road() ;
        roads[ 39 ] = new road() ;
        roads[ 40 ] = new road() ;
        roads[ 41 ] = new road() ;
        roads[ 42 ] = new road() ;
        roads[ 43 ] = new road() ;
        roads[ 44 ] = new road() ;
        roads[ 45 ] = new road() ;
        roads[ 46 ] = new road() ;
        roads[ 47 ] = new road() ;
        roads[ 48 ] = new road() ;
        roads[ 49 ] = new road() ;
        roads[ 50 ] = new road() ;
        roads[ 51 ] = new road() ;
        roads[ 52 ] = new road() ;
        roads[ 53 ] = new road() ;
        roads[ 54 ] = new road() ;
        roads[ 55 ] = new road() ;
        roads[ 56 ] = new road() ;
        roads[ 57 ] = new road() ;
        roads[ 58 ] = new road() ;
        roads[ 59 ] = new road() ;
        roads[ 60 ] = new road() ;
        roads[ 61 ] = new road() ;
        roads[ 62 ] = new road() ;
        roads[ 63 ] = new road() ;
        roads[ 64 ] = new road() ;
        roads[ 65 ] = new road() ;
        roads[ 66 ] = new road() ;
        roads[ 67 ] = new road() ;
        roads[ 68 ] = new road() ;
        roads[ 69 ] = new road() ;
        roads[ 70 ] = new road() ;
        roads[ 71 ] = new road() ;
        roads[ 72 ] = new road() ;
        roads[ 73 ] = new road() ;
        roads[ 74 ] = new road() ;
        
        roads[ 0 ].setroad(0 , 2 , 1 , 1 ) ;
        roads[ 1 ].setroad( 1 , 2 , 1 , 1 ) ;
        roads[ 2 ].setroad( 2 , 3 , 1 , 1 ) ;
        roads[ 3 ].setroad( 3 , 4 , 1 , 1 ) ;
        roads[ 4 ].setroad( 4 , 5 , 1 , 1 ) ;
        roads[ 5 ].setroad( 4 , 47 , 1 , 1 ) ;
        roads[ 6 ].setroad( 5 , 6 , 1 , 1 ) ;
        roads[ 7 ].setroad( 5 , 11 , 1 , 1 ) ;
        roads[ 8 ].setroad( 6 , 7 , 1 , 1 ) ;
        roads[ 9 ].setroad( 7 , 8 , 1 , 1 ) ;
        roads[ 10 ].setroad( 8 , 9 , 1 , 1 ) ;
        roads[ 11 ].setroad( 9 , 10 , 1 , 1 ) ;
        roads[ 12 ].setroad( 11 , 12 , 1 , 1 ) ;
        roads[ 13 ].setroad( 11 , 13 , 1 , 1 ) ;
        roads[ 14 ].setroad( 13 , 14 , 1 , 1 ) ;
        roads[ 15 ].setroad( 13 , 15 , 1 , 1 ) ;
        roads[ 16 ].setroad( 13 , 26 , 1 , 1 ) ;
        roads[ 17 ].setroad( 15 , 16 , 1 , 1 ) ;
        roads[ 18 ].setroad( 15 , 18 , 1 , 1 ) ;
        roads[ 19 ].setroad( 16 , 17 , 1 , 1 ) ;
        roads[ 20 ].setroad( 18 , 19 , 1 , 1 ) ;
        roads[ 21 ].setroad( 18 , 20 , 1 , 1 ) ;
        roads[ 22 ].setroad( 18 , 25 , 1 , 1 ) ;
        roads[ 23 ].setroad( 20 , 21 , 1 , 1 ) ;
        roads[ 24 ].setroad( 20 , 22 , 1 , 1 ) ;
        roads[ 25 ].setroad( 22 , 23 , 1 , 1 ) ;
        roads[ 26 ].setroad( 22 , 24 , 1 , 1 ) ;
        roads[ 27 ].setroad( 24 , 25 , 1 , 1 ) ;
        roads[ 28 ].setroad( 24 , 33 , 1 , 1 ) ;
        roads[ 29 ].setroad( 24 , 34 , 1 , 1 ) ;
        roads[ 30 ].setroad( 25 , 26 , 1 , 1 ) ;
        roads[ 31 ].setroad( 26 , 27 , 1 , 1 ) ;
        roads[ 32 ].setroad( 27 , 28 , 1 , 1 ) ;
        roads[ 33 ].setroad( 27 , 45 , 1 , 1 ) ;
        roads[ 34 ].setroad( 28 , 29 , 1 , 1 ) ;
        roads[ 35 ].setroad( 28 , 30 , 1 , 1 ) ;
        roads[ 36 ].setroad( 30 , 31 , 1 , 1 ) ;
        roads[ 37 ].setroad( 30 , 33 , 1 , 1 ) ;
        roads[ 38 ].setroad( 30 , 44 , 1 , 1 ) ;
        roads[ 39 ].setroad( 31 , 32 , 1 , 1 ) ;
        roads[ 40 ].setroad( 33 , 36 , 1 , 1 ) ;
        roads[ 41 ].setroad( 33 , 40 , 1 , 1 ) ;
        roads[ 42 ].setroad( 34 , 35 , 1 , 1 ) ;
        roads[ 43 ].setroad( 36 , 37 , 1 , 1 ) ;
        roads[ 44 ].setroad( 36 , 38 , 1 , 1 ) ;
        roads[ 45 ].setroad( 38 , 39 , 1 , 1 ) ;
        roads[ 46 ].setroad( 40 , 41 , 1 , 1 ) ;
        roads[ 47 ].setroad( 40 , 44 , 1 , 1 ) ;
        roads[ 48 ].setroad( 40 , 64 , 1 , 1 ) ;
        roads[ 49 ].setroad( 41 , 42 , 1 , 1 ) ;
        roads[ 50 ].setroad( 41 , 43 , 1 , 1 ) ;
        roads[ 51 ].setroad( 44 , 45 , 1 , 1 ) ;
        roads[ 52 ].setroad( 45 , 46 , 1 , 1 ) ;
        roads[ 53 ].setroad( 45 , 55 , 1 , 1 ) ;
        roads[ 54 ].setroad( 46, 47 , 1 , 1 ) ;
        roads[ 55 ].setroad( 46 , 48 , 1 , 1 ) ;
        roads[ 56 ].setroad( 46 , 53 , 1 , 1 ) ;
        roads[ 57 ].setroad( 47 , 48 , 1 , 1 ) ;
        roads[ 58 ].setroad( 48 , 49 , 1 , 1 ) ;
        roads[ 59 ].setroad( 48 , 50 , 1 , 1 ) ;
        roads[ 60 ].setroad( 50 , 51 , 1 , 1 ) ;
        roads[ 61 ].setroad( 51 , 52 , 1 , 1 ) ;
        roads[ 62 ].setroad( 51 , 53 , 1 , 1 ) ;
        roads[ 63 ].setroad( 53 , 54 , 1 , 1 ) ;
        roads[ 64 ].setroad( 53 , 55 , 1 , 1 ) ;
        roads[ 65 ].setroad( 55 , 56 , 1 , 1 ) ;
        roads[ 66 ].setroad( 55 , 57 , 1 , 1 ) ;
        roads[ 67 ].setroad( 57 , 58 , 1 , 1 ) ;
        roads[ 68 ].setroad( 57 , 59 , 1 , 1 ) ;
        roads[ 69 ].setroad( 59 , 60 , 1 , 1 ) ;
        roads[ 70 ].setroad( 59 , 61 , 1 , 1 ) ;
        roads[ 71 ].setroad( 61 , 62 , 1 , 1 ) ;
        roads[ 72 ].setroad( 61 , 63 , 1 , 1 ) ;
        roads[ 73 ].setroad( 61 , 64 , 1 , 1 ) ;
        roads[ 74 ].setroad( 64 , 65 , 1 , 1 ) ;
        
        
        
        
        //int koldor = 75 ;	//колличество перекрестков
        //road [] roads ;
        //roads = new road [koldor]
    /*double*/long[][] /*roads*/cost ;//roads with edges //матрица смежности
    cost = new /*double*/long[ kolper ][ kolper ] ;
    
    for ( int i = 0 ; i < kolper ; i++ ) //fill array cost "0"
    	for ( int j = 0 ; j < kolper ; j++ ) {
    		cost[ i ][ j ] = 0/*.0*/ ;
    	}
    for ( int i = 0 ; i < koldor ; i++){
    	if ( roads[ i ].roadsto != 0 ) cost[ roads[ i ].startpoint ][ roads[ i ].endpoint ] = (long)roads[ i ].length ;
    	if ( roads[ i ].roadsback != 0 ) cost[ roads[ i ].endpoint ][ roads[ i ].startpoint ] = (long)roads[ i ].length ;
    }
    
    
    int n = cost.length ; //n = 75
    List<Edge>[] edges = new List[n]; //create list of edges
    for (int i = 0; i < n; i++) {
      edges[i] = new ArrayList<Edge>();  //create it
      for (int j = 0; j < n; j++) {
        if (cost[i][j] != 0) {
          edges[i].add(new Edge(j, cost[i][j]));// add edge in list
        }
      }
    }
    /*double*/long[] dist = new /*double*/long[n];
    int[] pred = new int[n];
    shortestPaths(edges, 0, dist, pred);
    
    for (int i = 0 ; i < kolper ; i++ ){
    	System.out.println(i +" " + dist[i] +" "+pred[i]) ;
    	for (int j = 0 ; j < kolper ; j++ ){
    		//System.out.print(cost [i][j] + " ");
    	}
    	//System.out.println();
    }
   /* System.out.println(dist[0]);
    System.out.println(dist[1]);
    System.out.println(dist[2]);
    System.out.println(pred[0]);
    System.out.println(pred[1]);
    System.out.println(pred[2]);*/
    //System.out.println( 13785875 >>> 32);
    int end = 60;
    Stack shortestpath = new Stack();
    shortestpath.push(end) ;
    	int rab = (int)shortestpath.peek() ;
    	while ( rab != 0 ) 
    	{
    		shortestpath.push(pred[rab]) ;
    		rab = (int)shortestpath.peek() ;
    	}
    	System.out.print( shortestpath.pop() ) ;
    	while ( shortestpath.empty() == false ){
    		System.out.print( " -> " + shortestpath.pop() ) ;
    	}
   }
}