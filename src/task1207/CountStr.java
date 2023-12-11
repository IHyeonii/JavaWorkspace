package task1207;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountStr {
	// 03_단어 개수 세기
	public void countStr(String str) {
		String[] strArr = str.split("");

		int count = 0;
		List<String> arr = new ArrayList<>();

		// 공백을 포함 안 하려면?
		for (int i = 0; i < strArr.length; i++) {
			if (!strArr[i].equals(" ")) {
				count++;
				arr.add(strArr[i]);
			}
		}
		System.out.println("개수= " + count); // 12
		System.out.println(arr); // toString 안해줘도 출력됨
	}

	public void specificChar(String path, String fileNm) throws IOException { // 특정 문자 개수 세기
		File file = new File(path, fileNm);
		BufferedReader br = new BufferedReader(new FileReader(file));

		String ExWord = "종로구"; // 추출할 단어

		String reader = "";
		String header = br.readLine();
		int count = 0;

		while ((reader = br.readLine()) != null) {
			String[] arr = reader.split(",");
			// [1101053, 사직동, 서울특별시 종로구 사직동, 11, 11010, 서울특별시, 종로구] String이 배열로 한 줄씩 담겨
			// 이 한 줄이 i로 카운트
			
			/**
			 * break; 없으면 -> 배열 한 줄의 "종로구" 단어 모두 카운트해서 34개
			 * break; 있으면 -> 한 번만 카운트하고 if문 탈출 = 17개
			 * */

			for (int i = 0; i < arr.length; i++) {
				if (arr[i].contains(ExWord)) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		br.close();
	}
}
