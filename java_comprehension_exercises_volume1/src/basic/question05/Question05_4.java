package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_4 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数学の試験結果を入力してください。");
		String str = reader.readLine();
		int math = Integer.parseInt(str);

		System.out.println("国語の試験結果の点数を入力してください。");
		String string = reader.readLine();
		int japanese = Integer.parseInt(string);

		if (math >= 60 && japanese >= 60) {
			System.out.println("数学と国語ともに合格です。");

		} else if (math >= 60 || japanese >= 60) {
			System.out.println("数学、国語どちらかが合格です。");

		} else {
			System.out.println("どちらも不合格です。");
		}

	}
}
