import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main11653 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
			int N = Integer.parseInt(reader.readLine());
			while (N != 1) {
				int i = 2;
				while (i <= Math.sqrt(N)) {
					if (N % i == 0) {
						System.out.println(i);
						N /= i;
						break;
					}
					i++;
				}
				if (i > Math.sqrt(N)) {
					System.out.println(N);
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}

