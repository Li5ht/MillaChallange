package Week3.Day6;

import java.util.*;
import java.io.*;

public class W3_D6 {
    static int N;
    static int M;
    static int d[][];

    static int v[][];

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);

        N = Integer.valueOf(st.nextToken());
        M = Integer.valueOf(st.nextToken());

        d = new int[N][M];
        v = new int[N][M];

        for (int i = 0; i < N; i++)
        {
            input = br.readLine();
            for (int j = 0; j < M; j++)
            {
                d[i][j] = input.charAt(j);
            }
        }

        bfs(0, 0);

        System.out.println(v[N - 1][M - 1]);

//		System.out.println("\n//방문배열");
//		for (int i = 0; i < N; i++) {
//			System.out.println(Arrays.toString(v[i]));
//		}
    }

    private static void bfs(int i, int j)
    {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(i * 100 + j);
        v[0][0] = 1;

        int pos = 0;
        while (queue.isEmpty() == false)
        {
            pos = queue.poll();
            i = pos / 100;
            j = pos % 100;

            if (i > 0 && d[i - 1][j] == '1' && v[i - 1][j] == 0)
            {
                v[i - 1][j] = v[i][j] + 1;
                queue.offer((i - 1) * 100 + j); // 상
            }
            if (i < N - 1 && d[i + 1][j] == '1' && v[i + 1][j] == 0)
            {
                v[i + 1][j] = v[i][j] + 1;
                queue.offer((i + 1) * 100 + j); // 하
            }
            if (j > 0 && d[i][j - 1] == '1' && v[i][j - 1] == 0)
            {
                v[i][j - 1] = v[i][j] + 1;
                queue.offer(i * 100 + (j - 1)); // 좌
            }
            if (j < M - 1 && d[i][j + 1] == '1' && v[i][j + 1] == 0)
            {
                v[i][j + 1] = v[i][j] + 1;
                queue.offer(i * 100 + (j + 1)); // 우
            }
        }
    }
}
