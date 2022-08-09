import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int res = 0;
        for (int i = 0; i < N; i++) {
            boolean[] alps = new boolean [123];
            String word = br.readLine();
            int len = word.length();
            for (int j = 0; j < len; j++) {
                char c = word.charAt(j);
                if (alps[c]) {
                    res++;
                    break;
                }
                alps[c] = true;
                while (++j < len && word.charAt(j) == c);
                j--;
            }
        }
        res = N - res;
        System.out.println(res);
    }
}
