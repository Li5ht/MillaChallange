package Week1.Day1;

import java.util.*;
import java.io.*;

public class W1_D1 {

    /*

    static int[] stack = new int[10001];
	static int size;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String S = st.nextToken();

			switch (S) {
			case "push" :
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop" :
				sb.append(pop()).append("\n");
				break;
			case "size" :
				sb.append(size()).append("\n");
				break;
			case "empty" :
				sb.append(empty()).append("\n");
				break;
			case "top" :
				sb.append(top()).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}

	public static void push(int num) {
		stack[size] = num;
		size++;
	}

	public static int pop() {
		if(size == 0) return -1;
		else {
			int P = stack[size - 1];
			size--;
			return P;
		}
	}

	public static int size() {
		return size;
	}

	public static int empty() {
		if(size == 0) return 1;
		else return 0;
	}

	public static int top() {
		if(size == 0) return -1;
		else {
			int T = stack[size - 1];
			return T;
		}
	}
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();  //스택 선언
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            //push이면 스택에 x push
            if (s.equals("push")) stack.push(Integer.parseInt(st.nextToken()));

            if (s.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stack.pop() + "\n");
                }
            }

            if (s.equals("size")) sb.append(stack.size() + "\n");

            if (s.equals("empty")) {
                if (stack.isEmpty()) {
                    sb.append(1 + "\n");
                } else {
                    sb.append(0 + "\n");
                }
            }

            if (s.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                } else {
                    sb.append(stack.peek() + "\n");
                }
            }
        }

        System.out.print(sb);
    }
}
