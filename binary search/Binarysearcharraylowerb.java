/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Arles
 */
public class Binarysearcharraylowerb {
    // TODO code application logic here

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int search(int[] s, int num) {
        int st = 0;
        int end = s.length - 1;

        while (st < end) {
            //System.out.println(st + "," + end);
            int mid = (st + end) / 2; //usa piso por defecto
            if (s[mid] >= num) {
                end = mid;
            } else {
                st = mid + 1;
            }
        }

        if (s[st] == num) {
            return st; //lower bound
        }else{
            return -1;
        }
    }

    public static void main(String[] args) throws IOException {
        int cases = 1;

        int N = Integer.parseInt(br.readLine()); //size array
        int Q = Integer.parseInt(br.readLine()); //number queries

        int[] s = new int[N];

        for (int i = 0; i < N; i++) {
            s[i] = Integer.parseInt(br.readLine().trim()); //load array
        }

        Arrays.sort(s);
        for (int i = 0; i < Q; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            //int pos = Arrays.binarySearch(s, num);
            int pos = search(s, num);

            if (pos >= 0) {
                System.out.println(num + " found at " + (pos + 1));
            } else {
                System.out.println(num + " not found");
            }
        }
    }

}

/*
10
4
1
2
3
3
4
4
4
4
5
5
1
3
4
5

9
2
0
0
0
0
1
1
1
1
1
0
1
*/
