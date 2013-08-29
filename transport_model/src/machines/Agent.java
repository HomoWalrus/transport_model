package machines;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Agent {
	private Stack shortestpath = new Stack();
	private int speed;
	private int current;
	private int end;
	private koord curPos;
	
	public Agent(int sp, Stack shpath, int cur, int end, koord curPos){

		this.speed=sp;
		this.shortestpath=shpath;
		this.current=cur;
		this.end=end;
		this.curPos=curPos;
		}

		public static int getRandom(int[] array) {
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
		}

		public void setAgent(Agent agent){

		int i;
		int length=global.kolPer;
		int[] startarray=new int[length];
		int[] endarray=new int[length];
		int[] speedarray=new int[20];

		for(i=0;i<=length;i++)
		{
		startarray[i]=i;
		}

		for(i=0;i<=length;i++)
		{
		endarray[i]=i;
		}

		for(i=20;i<=40;i++)
		{
		speedarray[i]=i;
		}

		this.current=getRandom(startarray);
		this.end=getRandom(endarray);
		this.speed=getRandom(speedarray);

		}
	
	public koord getNewPosition(){
		koord nextPosition=new koord();
		if ( this.curPos.compare( global.koordPer[ this.current ]) == true ) {
			if ( this.end == this.current ) { 
				nextPosition.setkoord( -1 , -1 ); //возращает (-1 -1) если мы доехали 
				return nextPosition ;
				}
				this.current = (int)this.shortestpath.pop() ;
			}
			long tekdl = this.curPos.rast( global.koordPer[ this.current ] ) ;
		if ( tekdl <= this.speed ) {
			nextPosition.setkoord( global.koordPer[ this.current ] );//если до перекрестка мало появляемся там
		}
			else {
				double mnoz = this.speed / global.koordPer[ this.current ].rast( this.curPos ) ; //коэффиицент подобия
				int dx = (int)( ( global.koordPer[ this.current ].x - this.curPos.x ) * mnoz ) ;
				int dy = (int)( ( global.koordPer[ this.current ].x - this.curPos.x ) * mnoz ) ;
				this.curPos.x += dx ;
				this.curPos.y += dy ;
				nextPosition.setkoord( this.curPos.x , this.curPos.y );
			}
			return nextPosition;
	}
	
}
