import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main2869 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
			String[] temp = reader.readLine().split(" ");
			int A = Integer.parseInt(temp[0]);
			int res = (int) (Math.ceil((double) (Integer.parseInt(temp[2]) - A) / (double) (A - Integer.parseInt(temp[1]))) + 1);
			System.out.println(res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}