package machines;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Road {
	  int startpoint, endpoint , roadsto , roadsback ;
	  public long length ;
	  public void setroad(int startpoint, int endpoint , int roadsto , int roadsback ) {
		  this.startpoint = startpoint ;
		  this.endpoint =  endpoint ;
		  this.roadsto = roadsto ;
		  this.roadsback = roadsback ;
		  this.length =  Global.koordPer[ startpoint ].rast( Global.koordPer[ endpoint ] ) ;
	  }
  }