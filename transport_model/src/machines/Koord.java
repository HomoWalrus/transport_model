package machines;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Koord {  //class with two koordinates 
    int x , y ;

    public void setkoord(int x , int y) {
      this.x = x ;
      this.y = y ;
    }
    public void setkoord( Koord a ) {
        this.x = a.x ;
        this.y = a.y ;
      }
    public boolean compare( Koord a ) {
     if ( this.x == a.x && this.y == a.y ) return true ;
     else return false ;
    }
    
    public long rast( Koord a) {
    	return (long)sqrt( pow((double)( this.x - a.x)  , 2.0 ) + pow((double)(this.y - a.y) , 2.0 ) );
    }
    
}
