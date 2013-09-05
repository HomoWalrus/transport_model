package machines;

import java.util.*; //колличество перекрестков
//import static java.lang.Math.* ;

public class Dijkstra {

	public static void shortestPaths(List<Edge>[] edges, int s, /* double */
			long[] prio, int[] pred) {
		Arrays.fill(pred, -1); // fill array pred -1
		Arrays.fill(prio, 2147483647); // fill array prio maxintami
		prio[s] = 0; // put 0 in start point
		PriorityQueue<Long> q = new PriorityQueue<Long>(); // create queue with
															// priority
		q.add((long) s); // add start point in queue
		while (!q.isEmpty()) {
			long cur = q.remove();
			int curu = (int) cur;
			if (/* (int) */cur >>> 32 != /* (int) */prio[curu])
				continue;
			for (Edge e : edges[curu]) {
				int v = e.t;
				long nprio = prio[curu] + e.cost;
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

		Maps used = new Maps();
		used.mapinfo(3);
		Stack l = new Stack();
		// Agent machine ;
		Agent machine = new Agent(10, l, 1, 20, Global.koordPer[1]);
		machine.setAgent();
		System.out.println("start=" + machine.current + " end=" + machine.end
				+ " speed=" + machine.speed + " x=" + machine.curPos.x + " y="
				+ machine.curPos.y);
		Koord tekkoor = new Koord(), prov = new Koord();
		prov.setkoord(-1, -1);

		while ((tekkoor.compare(prov)) != true) {
			tekkoor.setkoord(machine.getNewPosition());
			machine.curPos.setkoord(tekkoor);
			System.out.println("x=" + tekkoor.x + " y=" + tekkoor.y + " to "
					+ machine.current + " ");
		}
	}
}