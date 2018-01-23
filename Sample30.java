/**
 *
 * @author xekid78
 *
 */
public class Sample30 {

	public static void main(String[] args) {
		int total = Item3.gokei(120, 15);
		System.out.println("リンゴの合計金額は" + total + "円です。");

	}

}

class Item3 {
	private static double tax = 1.08;

	public  static int gokei(int tanka, int kosu) {
		return (int)(tanka * kosu * tax);
	}

}
