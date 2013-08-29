package machines;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Agent {
	
	private koord nextPosition=new koord();
	private int speed;
	private Stack shortestpath = new Stack();
	private int current;
	private int  end;
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
	public koord getNewPosition(Agent agent){
				
			return this.nextPosition;
	}
	
	
}
