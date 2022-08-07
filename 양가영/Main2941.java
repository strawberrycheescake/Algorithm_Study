import java.util.Scanner;

public class Main2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        int n = str.length;
        int i = 0;
        int count = 0;
        while (i < n - 2) {
            if (str[i] == 's' || str[i] == 'z') {
                if (str[i + 1] == '=') i++;
            } else if (str[i] == 'l' || str[i] == 'n') {
                if (str[i + 1] == 'j') i++;
            } else if (str[i] == 'c') {
                if (str[i + 1] == '-' || str[i + 1] == '=') i++;
            } else if (str[i] == 'd') {
                if (str[i + 1] == 'z' && str[i + 2] == '=') i+=2;
                else if (str[i+1] == '-') i++;
            }
            count++;
            i++;
        }
        if (i == n - 1) count++;
        else if (i == n - 2) {
            if (str[i+1] == '=' || str[i+1] == '-' || (str[i+1] == 'j' && (str[i] == 'n' || str[i] == 'l'))) count++;
            else count += 2;
        }
        System.out.println(count);
    }
}