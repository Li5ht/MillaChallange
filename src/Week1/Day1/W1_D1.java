package Week1.Day1;

import java.util.*;
import java.io.*;

public class W1_D1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>(); //스택 선언

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String t = br.readLine();

            if (t.contains("push")) {
                String spt[] = t.split(" ");
                stack.push(Integer.parseInt(spt[1]));
            } else if (t.contains("pop")) {
                if (stack.empty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if (t.contains("size")) {
                bw.write(stack.size() + "\n");

            } else if (t.contains("empty")) {
                if (stack.empty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            }
            else if (t.contains("top")) {
                if (stack.empty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
            bw.flush();
        }
    }
}
