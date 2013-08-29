package machines;

public class global {
	public static koord [] koordPer = new koord [ 100 ] ;
	public static road [] roads  = new road [ 100 ];	//array of roads, for convenience
	public static int kolPer ;
	public static int kolDor ;
	public static long[][] cost = new long [100][100] ;//roads with edges //матрица смежности
}
