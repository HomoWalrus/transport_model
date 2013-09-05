package machines;

public class Global {
	public static Koord [] koordPer = new Koord [ 100 ] ;
	public static Road [] roads  = new Road [ 100 ];	//array of roads, for convenience
	public static int kolPer ;
	public static int kolDor ;
	public static long[][] cost = new long [100][100] ;//roads with edges //матрица смежности
}
