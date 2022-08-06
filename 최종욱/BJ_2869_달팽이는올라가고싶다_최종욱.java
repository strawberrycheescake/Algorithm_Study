package gwangju;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2869_달팽이는올라가고싶다_최종욱 {	
	static int tree;
	static int up;
	static int down;
	static int round = 0;
	static int value = 0;
	

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		up = Integer.parseInt(st.nextToken());
		down = Integer.parseInt(st.nextToken());
		tree = Integer.parseInt(st.nextToken());
		
	
		//(A-B)*X + A >= V == X >= (V-A)/(A-B)
		if((tree-up)%(up-down) == 0) { //0으로 딱 떨어질  때
			round = (tree-up)/(up-down)+1;
		}else {                        //0이 아닌 값이 나올 때
			round = (tree-up)/(up-down)+2;
		}
		
		System.out.println(round);
		
	}

}
