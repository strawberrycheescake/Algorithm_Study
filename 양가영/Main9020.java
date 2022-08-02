import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main9020 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
			int T = Integer.parseInt(reader.readLine());
			for (int tc = 0; tc < T; tc++) {
				int N = Integer.parseInt(reader.readLine());
				if (N == 4) {
					System.out.println("2 2");
					continue;
				}
				int l = N / 2;
				int r = N / 2;
				int t = 0;
				if (l % 2 == 0) t++;
				while (!isPrime(l - t) || !isPrime(r + t)) t+=2;
				l-=t;
				r+=t;
				System.out.println(l + " " + r);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    public static boolean isPrime(int num) {
    	for (int i = 2; i <= Math.sqrt(num); i++) {
    		if (num % i == 0) return false;
    	}
    	return true;
    }
}

