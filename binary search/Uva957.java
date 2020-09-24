/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Arles
 */
public class Uva957 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int search(int[] s, int num) {
        int st = 0;
        int end = s.length - 1;
        int mid;
        while (st < end) {
            //System.out.println(st + "," + end);
            mid = (st + end + 1) / 2; //para usar techo y no piso
            if (s[mid] > num) {
                end = mid - 1;
            } else {
                st = mid;
            }
        }

        if (s[end] == num) {
            return end; //upper bound
        } else {
            return -1;
        }

    }

    public static void main(String[] args) throws IOException {
        int y, ans, aux, a = 0, b = 0;
        int p = 0;
        ans = 0;

        while (true) {
            y = Integer.parseInt(br.readLine());
            if (y == 0) {
                break;
            }
            ans = 0;
            p = Integer.parseInt(br.readLine());
            int[] popes = new int[p];

            for (int i = 0; i < p; i++) {
                popes[i] = (Integer.parseInt(br.readLine()));
            }

            for (int i = 0; i < p; i++) {
                int pos = search(popes, popes[i] + y - 1);
                if (pos > 0) {                                        
                    if (ans < (pos-i)) {
                        ans = pos-i;
                        a = pos;
                        b = pos-1;
                    }
                }
            }
            System.out.println(ans + " " + popes[a] + " " + popes[b]);
        }
    }
}

/*

5
20
1
2
3
6
8
12
13
13
15
16
17
18
19
20
20
21
25
26
30
31
 */
