package machines;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class road {
	  int startpoint, endpoint , roadsto , roadsback ;
	  public long length ;
	  public void setroad(int startpoint, int endpoint , int roadsto , int roadsback ) {
		  this.startpoint = startpoint ;
		  this.endpoint =  endpoint ;
		  this.roadsto = roadsto ;
		  this.roadsback = roadsback ;
		  this.length =  (long)sqrt( pow((double)( global.koordPer[startpoint].x - global.koordPer[endpoint].x)  , 2.0 ) + 
				  			   pow((double)(global.koordPer[startpoint].y - global.koordPer[endpoint].y)  , 2.0 ) );
	  }
  }