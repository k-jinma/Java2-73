package lesson76;

import java.io.FileReader;

class GameLoader {

	public static void main(String[] args) {

		System.out.println(">>> ロード処理を開始します");

        // 【問題】
		// try - catch - catch - finally 構文を使って完成させてください。
        // 1. チェック例外(FileNotFoundException, InterruptedException)の処理がありません。
        // 2. 成功・失敗に関わらず処理の最後には必ず「>>> メモリを解放しました」と表示する
        // 

        System.out.println(">>> データを検索中...");
        FileReader reader = new FileReader("save.dat"); // チェック例外が発生する可能性あり

        System.out.println(">>> データの展開中(3秒待機)...");
        Thread.sleep(3000); // チェック例外が発生する可能性あり
        System.out.println(">>> ロード完了！");

	}

}
