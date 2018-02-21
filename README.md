# JavaStaticVariable2
static変数

## 処理
[JavaStaticVariable](https://github.com/xekid78/JavaStaticVariable)にstatic変数で消費税込みの価格を計算たものです。

## コード
```
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
```

## 出力結果  
```
リンゴの合計金額は1944円です。
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
