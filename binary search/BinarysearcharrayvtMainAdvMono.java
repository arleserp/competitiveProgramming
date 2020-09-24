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
public class BinarysearcharrayvtMainAdvMono {
    // TODO code application logic here

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static boolean ok(int[] s, int pos, int num){
        return s[pos] < num;
    }

    public static int search(int[] s, int num) {
        int st = 0;
        int end = s.length - 1;

        while (st < end) { // maybe while (end - st > 1)
            //System.out.println(st + "," + end);
            int mid = (st + end) / 2; //usa piso por defecto
            if (!ok(s, mid, num)) {
                end = mid;
            } else {
                st = mid + 1; //maybe mid
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
11
1
0
5
13
19
22
41
55
68
72
81
98
55
*/
