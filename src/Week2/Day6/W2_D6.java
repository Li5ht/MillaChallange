package Week2.Day6;

import java.util.*;
import java.io.*;

public class W2_D6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numbers);

        int m = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int num;

        for (int i = 0; i < m; i++) {
            num = Integer.parseInt(st.nextToken());
            if(binarySearch(numbers, num)) System.out.println(1);
            else System.out.println(0);
        }
    }

    public static boolean binarySearch(int[] numbers, int num) {
        int start = 0;
        int end = numbers.length-1;
        int mid;

        while(start <= end) {
            mid = (start + end) / 2;
            if(numbers[mid] > num) {
                end = mid - 1;
            }
            else if(numbers[mid] < num) {
                start = mid + 1;
            }
            else {
                return true;
            }
        }
        return false;
    }

}
