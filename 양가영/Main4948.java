import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4948 {
	static int[] isPrime = new int[246913];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            while (true) {
                int N = Integer.parseInt(reader.readLine());
                if (N == 0) break;
                int res = 0;
                if (N <= 2) {
                	System.out.println(1);
                	continue;
                }
                if (N % 2 == 0) {
                	for (int i=N+1; i < 2*N; i+=2) {
                		if (isPrime(i)) res++;
                	}
                } else {
                	for (int i=N+2; i < 2*N; i+=2) {
                		if (isPrime(i)) res++;
                	}
                }
                System.out.println(res);
           }
            
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isPrime(int num) {
		if (isPrime[num] != 0) return isPrime[num] == 1;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				isPrime[num] = -1;
				return false;
			}
		}
		isPrime[num] = 1;
		return true;
	}
}
