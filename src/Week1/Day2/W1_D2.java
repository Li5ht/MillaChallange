package Week1.Day2;

import java.util.*;

public class W1_D2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

       int n = sc.nextInt();
       int k = sc.nextInt();

        int index = 0;

        for (int i = 1; i <= n; i++) {
            list.offer(i);
        }
        System.out.print("<");
        while (!list.isEmpty()) {
            index = (index + (k - 1)) % list.size();
            if(list.size() != 1) {
                System.out.print(list.remove(index) + ", ");
            }else{
                System.out.print(list.remove(index));
            }
        }

        System.out.print(">");


       sc.close();
    }
}
