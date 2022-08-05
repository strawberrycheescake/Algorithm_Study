package gwangju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2941_크로아티알파벳_최종욱 {	
	static int count;
	static String word;
	static String Croatia[] = {"c=","c-","dz=","d-","lj","nj","s=","z="}; //제시된 크로아티아 알파펫 배열 저장

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		word = bf.readLine();
		count = 0;//크로아티아 알파벳을 샐 변수 
		
		for(int i = 0; i < Croatia.length; i++) {//크로아티아 알파벳 배열의 길이만큼 반복하면서 문자에 존재하는지 확인
		
			if(word.contains(Croatia[i])) {//존재하면 count +1, 비슷한 단어 중복 count방지 및 제시되지않은 알파벳 확인을 위해 배열 값 변경
				count+=1;
				word =word.replace(Croatia[i], "0");
			}
				
		}
		int alphabet = word.length() - count;//제시되지 않은 알파벳 수
		
		count += alphabet;	//크로아티아 알파벳 수
		
		System.out.println(count);
		
		
	}

}
