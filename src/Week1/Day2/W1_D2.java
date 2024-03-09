package Week1.Day2;

import java.util.*;

public class W1_D2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       LinkedList<Integer> q = new LinkedList<>();

       int n = sc.nextInt();
       int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        int index = 0;

        System.out.print("<");
        while (!q.isEmpty()) {
            index = (index + (k - 1)) % q.size();
            if(q.size() != 1) {
                System.out.print(q.remove(index) + ", ");
            }else{
                System.out.print(q.remove(index));
            }
        }

        System.out.print(">");


       sc.close();
    }
}
