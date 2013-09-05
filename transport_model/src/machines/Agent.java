package machines;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class Agent {
	public Stack shortestpath = new Stack();
	public int speed;
	public int current;
	public int end;
	public Koord curPos;

	public Agent(int sp, Stack shpath, int cur, int end, Koord curPos) {

		this.speed = sp;
		this.shortestpath = shpath;
		this.current = cur;
		this.end = end;
		this.curPos = curPos;

	}

	public static int getRandom(int[] array) {
		int rnd = new Random().nextInt(array.length);
		return array[rnd];
	}

	public void setAgent(/* Agent agent */) {

		int i;
		int length = Global.kolPer;
		int[] startarray = new int[length];
		int[] endarray = new int[length];
		int[] speedarray = new int[21];

		for (i = 0; i < length; i++) {
			startarray[i] = i;
		}

		for (i = 0; i < length; i++) {
			endarray[i] = i;
		}

		for (i = 0; i <= 20; i++) {
			speedarray[i] = i + 20;
		}

		this.current = getRandom(startarray);
		this.end = getRandom(endarray);
		this.speed = getRandom(speedarray);
		this.curPos.setkoord(Global.koordPer[current]);

		int n = Global.cost.length; //
		List<Edge>[] edges = new List[n]; // create list of edges
		for (i = 0; i < n; i++) {
			edges[i] = new ArrayList<Edge>(); // create it
			for (int j = 0; j < n; j++) {
				if (Global.cost[i][j] != 0) {
					edges[i].add(new Edge(j, Global.cost[i][j]));// add edge in
																	// list
				}
			}
		}
		long[] dist = new long[n];
		int[] pred = new int[n];
		Dijkstra.shortestPaths(edges, this.current, dist, pred);
		this.shortestpath.push(this.end);
		int rab = (int) shortestpath.peek();
		while (rab != this.current) {
			this.shortestpath.push(pred[rab]);
			rab = (int) this.shortestpath.peek();
		}

	}

	public Koord getNewPosition() {
		Koord nextPosition = new Koord();
		if (this.curPos.compare(Global.koordPer[this.current]) == true) {
			if (this.end == this.current) {
				nextPosition.setkoord(-1, -1); // возращает (-1 -1) если мы
				System.out.println("#1end"); // доехали
				return nextPosition;
			}
				this.current = (int) this.shortestpath.pop();// берем следующую
															// вершину из стека
			
		}
		long tekdl = this.curPos.rast(Global.koordPer[this.current]);
		if (tekdl <= this.speed) {
			nextPosition.setkoord(Global.koordPer[this.current]);// если до
			// перекрестка
			// мало
			// появляемся
			// там
			System.out.println("#5 new versh = " + this.current);
			return nextPosition;
		} else {

			double mnoz = (double) this.speed
					/ (double) Global.koordPer[this.current].rast(this.curPos); // коэффиицент
																				// подобия
			double dx = ((double) (Global.koordPer[this.current].x - this.curPos.x) * mnoz);
			double dy = ((double) (Global.koordPer[this.current].y - this.curPos.y) * mnoz);
			this.curPos.x += (int) dx;
			this.curPos.y += (int) dy;
			nextPosition.setkoord(this.curPos.x, this.curPos.y);
			System.out.println("#4 kreis ");
			return nextPosition;
		}
	}

}
