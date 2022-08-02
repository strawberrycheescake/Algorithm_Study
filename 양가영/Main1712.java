import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1712 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] temp = reader.readLine().split(" ");
            int A = Integer.parseInt(temp[0]);
            int B = Integer.parseInt(temp[1]);
            int C = Integer.parseInt(temp[2]);
            if (C <= B) {
                System.out.println(-1);
                return;
            }
            int res = A / (C - B) + 1;
            System.out.println(res);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
