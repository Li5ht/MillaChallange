package Week2.Day3;

import java.util.*;
import java.io.*;

public class W2_D3 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        //System.setIn(new FileInputStream ("Test.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        int[] xArr = new int[N]; //원본좌표
        ArrayList<Integer> mapping = new ArrayList<Integer>(); //새 idx 매핑List

        //1. 원본좌표 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            xArr[i] = num;

            //2. list에 새로운 idx체계 부여
            if(!mapping.contains(num))
                mapping.add(num);
        }



        //2. 매핑list 정렬 (오름차순)
        Collections.sort(mapping);

        //3. 좌표압축
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(mapping.indexOf(xArr[i])+" ");
        }
        bw.write("\n");
        bw.flush();
    }
}

