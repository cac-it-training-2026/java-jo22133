package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		// TODO:ここに実装

		int basePrice = 1200;
		int tickets = 3;

		int reducedPrice = basePrice - 200;

		int reducedatickets = --tickets;
		int totalPrice = reducedPrice * reducedatickets;
		double taxRate = 1.1;
		double TotalIthTax = totalPrice * taxRate;
		int totalIthTax = (int) TotalIthTax;

		System.out.println("購入可能枚数は" + reducedatickets + "枚です。");
		System.out.println("値下げ後の1枚あたりの料金は" + reducedPrice + "円です。");
		System.out.println("合計金額（税抜）は" + totalPrice + "です。");
		System.out.println("合計金額(税込)は" + totalIthTax + "です。");
	}
}
