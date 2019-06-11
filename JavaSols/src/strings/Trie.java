package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author arlese.rodriguezp
 */
public class Trie {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Node trie = new Node(0);
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            buildTrie(trie, s);
        }
    }

    private static void buildTrie(Node trie, String s) {
        int i = 0;
        Node currentTrie = trie;
        while (i < s.length()) {
            if (currentTrie.links[s.charAt(i) - 'A'] == null) {
                Node n = new Node(s.charAt(0) - 'A');
                currentTrie = currentTrie.links[s.charAt(i) - 'A'] = n;
            } else {
                currentTrie = currentTrie.links[s.charAt(i) - 'A'];
            }
            i++;
        }
        currentTrie.end = true;
    }

    static class Node {
        int id;
        boolean end;
        Node[] links;
        public Node(int id) {
            this.id = id;
            end = false;
            this.links = new Node[27];
        }

    }
}
