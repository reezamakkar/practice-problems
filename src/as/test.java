//package as;
//
//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class test {
//
//    static final int SIZE = 26;
//
//    static int M;
//    static int N;
//
//    static class Point {
//        public int start;
//        public int end;
//
//        Point() {
//            start = -1;
//            end = -1;
//        }
//
//        boolean isEmpty() {
//            return start == -1 && end == -1;
//        }
//    }
//
//    static int currX = -1;
//    static int currY = -1;
//
//    static HashMap<String, Point> result = new HashMap<>();
//
//    static class TrieNode {
//        TrieNode[] Child = new TrieNode[SIZE];
//
//        boolean leaf;
//
//        public TrieNode() {
//            leaf = false;
//            for (int i = 0; i < SIZE; i++)
//                Child[i] = null;
//        }
//    }
//
//    static void insert(TrieNode root, String Key) {
//        int n = Key.length();
//        TrieNode pChild = root;
//
//        for (int i = 0; i < n; i++) {
//            int index = Key.charAt(i) - 'A';
//
//            if (pChild.Child[index] == null)
//                pChild.Child[index] = new TrieNode();
//
//            pChild = pChild.Child[index];
//        }
//
//        pChild.leaf = true;
//    }
//
//    static boolean isSafe(int i, int j) {
//        return (i >= 0 && i < M && j >= 0 && j < N);
//    }
//
//    static void searchWord(TrieNode root, char boggle[][], int i,
//                           int j, String str, int direction) {
//        if (root.leaf == true) {
//            if (result.get(str).isEmpty()) {
//                result.get(str).start = currX;
//                result.get(str).end = currY;
//            }
//        }
//
//        if (isSafe(i, j)) {
//
//            for (int K = 0; K < SIZE; K++) {
//                if (root.Child[K] != null) {
//                    char ch = (char) (K + 'A');
//
//                    switch (direction) {
//                        case 0:
//                            if (isSafe(i + 1, j + 1) && boggle[i + 1][j + 1]
//                                    == ch) {
//                                searchWord(root.Child[K], boggle, i + 1, j + 1, str + ch, direction);
//                            }
//                            break;
//                        case 1:
//                            if (isSafe(i, j + 1) && boggle[i][j + 1]
//                                    == ch) {
//                                searchWord(root.Child[K], boggle, i, j + 1, str + ch, direction);
//                            }
//                            break;
//                        case 2:
//                            if (isSafe(i - 1, j + 1) && boggle[i - 1][j + 1]
//                                    == ch) {
//                                searchWord(root.Child[K], boggle, i - 1, j + 1, str + ch, direction);
//                            }
//                            break;
//                        case 3:
//                            if (isSafe(i + 1, j) && boggle[i + 1][j]
//                                    == ch) {
//                                searchWord(root.Child[K], boggle, i + 1, j, str + ch, direction);
//                            }
//                            break;
//                        case 4:
//                            if (isSafe(i + 1, j - 1) && boggle[i + 1][j - 1]
//                                    == ch) {
//                                searchWord(root.Child[K], boggle, i + 1, j - 1, str + ch, direction);
//                            }
//                            break;
//                        case 5:
//                            if (isSafe(i, j - 1) && boggle[i][j - 1]
//                                    == ch) {
//                                searchWord(root.Child[K], boggle, i, j - 1, str + ch, direction);
//                            }
//                            break;
//                        case 6:
//                            if (isSafe(i - 1, j - 1) && boggle[i - 1][j - 1]
//                                    == ch) {
//                                searchWord(root.Child[K], boggle, i - 1, j - 1, str + ch, direction);
//                            }
//                            break;
//                        case 7:
//                            if (isSafe(i - 1, j) && boggle[i - 1][j]
//                                    == ch) {
//                                searchWord(root.Child[K], boggle, i - 1, j, str + ch, direction);
//                            }
//                            break;
//                    }
//                }
//            }
//        }
//    }
//
//    static void findWords(char boggle[][], TrieNode root) {
//        TrieNode pChild = root;
//
//        String str = "";
//        M = boggle[0].length;
//        N = boggle.length;
//        for (int i = 0; i < M; i++) {
//            for (int j = 0; j < N; j++) {
//                if (pChild.Child[(boggle[i][j]) - 'A'] != null) {
//                    currX = i;
//                    currY = j;
//                    str = str + boggle[i][j];
//                    for (int x = 0; x < 8; x++) {
//                        searchWord(pChild.Child[(boggle[i][j]) - 'A'],
//                                boggle, i, j, str, x);
//                    }
//                    str = "";
//                }
//            }
//        }
//    }
//
//    // Driver program to test above function
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        List<String> grid = new ArrayList<String>();
//
//        String dictionary[] = {"ANTMAN", "DAREDEVIL", "DEADPOOL", "ELEKTRA", "HAWKEYE", "PUNISHER", "THING", "WITCH"};
//
//        TrieNode root = new TrieNode();
//        int n = dictionary.length;
//        for (int i = 0; i < n; i++) {
//            insert(root, dictionary[i]);
//            result.put(dictionary[i], new Point());
//        }
//
//        char boggle[][] = {{'E', 'L', 'E', 'K', 'T', 'R', 'A', 'H', 'T', 'H', 'O', 'R', 'G', 'V'},
//                {'S', 'I', 'LVERAORWTNSH},
//                {'K', 'I', 'T', 'A'},
//                {'A', 'N', 'D', 'Y'}
//        };
//
//        findWords(boggle, root);
//        for (String s : dictionary) {
//            Point p = result.get(s);
//            System.out.println(s + " " + p.start + " " + p.end);
//        }
//    }
//}
