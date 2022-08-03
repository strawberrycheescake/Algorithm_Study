import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10250 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int T = Integer.parseInt(reader.readLine());
            for (int tc = 0; tc < T; tc++) {
                String[] temp = reader.readLine().split(" ");
                int H = Integer.parseInt(temp[0]);
                int W = Integer.parseInt(temp[1]);
                int N = Integer.parseInt(temp[2]);
                
                int roomN = ((int) Math.ceil((double)N/(double)H));
                int floor = N % H == 0 ? H : N % H;
                
                if (roomN < 10) System.out.println(floor + "0" + roomN);
                else System.out.println( floor + "" + roomN );
            }
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
