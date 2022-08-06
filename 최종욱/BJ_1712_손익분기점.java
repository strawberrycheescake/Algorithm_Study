import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int produce = Integer.parseInt(st.nextToken());//생산 고정비용
		int cost = Integer.parseInt(st.nextToken()); //가변 비용
		int price = Integer.parseInt(st.nextToken()); // 노트북 가격
		int point = 0; //순익분기점
		
		if(cost >= price) {//가변비용이 노트북 가격 이상이면 손익분기점 도달 불가
			System.out.println(-1);
		}else {
			point = produce/(price - cost) + 1;//최초이익이 발생하는 판매량 계산
			System.out.println(point);
		}

	}

}
