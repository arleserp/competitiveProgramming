package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author arlese.rodriguezp
 */
public class uva11362 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int cases = Integer.parseInt(br.readLine().trim());
        while (cases > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Node trie = new Node(0);
            boolean ans = true;
            for (int i = 0; i < n; i++) {
                String s = br.readLine().trim();
                if (ans) {
                    ans = buildTrie(trie, s);
                }
            }
            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            cases--;
        }
    }

    private static boolean buildTrie(Node trie, String s) {
        int i = 0;
        Node currentTrie = trie;
        while (i < s.length()) {
            if (currentTrie.end) {
                return !currentTrie.end;
            } else if (currentTrie.links[s.charAt(i) - '0'] == null) {
                Node n = new Node(s.charAt(0) - '0');
                currentTrie = currentTrie.links[s.charAt(i) - '0'] = n;
            } else {
                currentTrie = currentTrie.links[s.charAt(i) - '0'];
            }
            i++;
        }
        currentTrie.end = true;
        int c = 0;
        for (Node n : currentTrie.links) {
            if (n != null) {
                c++;
            }
        }
        return c == 0;
    }

    static class Node {

        int id;
        boolean end;
        Node[] links;

        public Node(int id) {
            this.id = id;
            end = false;
            this.links = new Node[10];
        }

    }
}
/*

*/