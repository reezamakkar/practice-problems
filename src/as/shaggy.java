
package as;
import java.util.*;

public class shaggy {

    static class pair{
        int a;
        int b;

        public pair(int a, int b) {
            this.a = a;
            this.b=b;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }



    static int R, C;

    // For searching in all 8 direction
    static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
    static Map<String, pair> ans= new HashMap<String, pair>();
    static int curRow=-1;
    static int curCol=-1;




    static void search2D(char[][] grid, int row,int col,Set<String> words, String test){

        if(words.isEmpty())
            return;
        if(row>=R || row<0 || col>=C || col<0)
            return ;
        String newTest= test + Character.toString(grid[row][col]);
        Set<String> newSet= new HashSet<String>();
        for(String word : words){
            if(word.compareTo(newTest)==0){
                if(ans.get(newTest) ==null){
                    ans.put(word,new pair(curRow, curCol));
                }
            }else if(word.length()<=newTest.length()){
                continue;
            }else if(word.startsWith(newTest)){
                newSet.add(word);
            }
        }

        for(int dir=0;dir<8;dir++){
            int rd=row+x[dir];
            int cd =col+y[dir];
            search2D(grid, rd,cd, newSet, newTest);
        }



    }







    // Searches given word in a given
    // matrix in all 8 directions
    static void patternSearch(char[][] grid, Set<String> words)
    {

        // Consider every point as starting
        // point and search given word
        for (int row = 0; row < R; row++)
        {
            for (int col = 0; col < C; col++)
            { curRow=row;
                curCol=col;
                search2D(grid, row, col, words, "");

            }
        }

        for (Map.Entry<String,pair> entry : ans.entrySet()) {
            pair val= entry.getValue();


            System.out.println("Key = " + entry.getKey() +
                    ", Value = (" + val.getA()+", "+ val.getB()+" )");
        }
    }

//    // Driver code
//    public static void main(String args[])
//    {
//        R = 4;
//        C = 4;
////        char[][] grid = {{'G','E','E','K','S','F','O','R','G','E','E','K','S'},
////                {'G','E','E','K','S','Q','U','I','Z','G','E','E','K'},
////                {'I','D','E','Q','A','P','R','A','C','T','I','C','E'}};
//        char[][] grid ={{'A','B','C','D'},
//                {'P','R','A','T'},
//                {'K','I','T','A'},
//                {'A','N','D','Y'}
//
//
//
//
//        };
//List<String> list = new ArrayList<>(Arrays.asList("ANDY","CAT","DOG"));
//        Set<String> words =  new HashSet<String>(list);
//        patternSearch(grid, words);
//
//        for(String word: list) {
//            if(!ans.containsKey(word)) {
//               ans.put(word, new pair(-1,-1));
//            }
//
//
//        }
//        Map<String, pair> sortedMap = new TreeMap<String, pair>(ans);
//        for(Map.Entry<String,pair> entry : sortedMap.entrySet()) {
//            String key = entry.getKey();
//            pair value = entry.getValue();
//
//            System.out.println(key + " " + value.getA()+" "+ value.getB());
//        }
//
//
//
//
//
//    }

    public static void main(String args[]) {
//        List<String> l=new ArrayList<String>();
//        //   System.out.println("Enter the input");
//        Scanner input=new Scanner(System.in);
//        String a;
//        do {
//            a = input.nextLine().trim();
//            l.add(a);
//        }while(a!="");
//        l.remove(l.size()-1);
//        List<String> words = new ArrayList<>();
//        do {
//            a = input.nextLine().trim();
//            words.add(a);
//        }while(a!="");
//
//        R=l.size();
//        if(R==0) {
//            Map<String, pair> sortedMap = new TreeMap<String, pair>();
//            for(String word: words) {
//                sortedMap.put(word, new pair(-1,-1));
//            }
//            for(Map.Entry<String,pair> entry : sortedMap.entrySet()) {
//                String key = entry.getKey();
//                pair value = entry.getValue();
//
//                System.out.println(key + " " + value.getA()+" "+ value.getB());
//            }
//
//
//        }
//        C=l.get(0).length();
//        char[][] grid= new char[R][C];
//        for(int i=0;i<R;i++) {
//            for(int j=0;j<C;j++) {
//                grid[i][j]= l.get(i).charAt(j);
//            }
//
//        }
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        char [][] grid = new char[n][n];
        grid[0] = s.toCharArray();
        for (int i= 1; i< n; i++) {
            s = sc.nextLine();
            grid[i] = s.toCharArray();
        }
        sc.nextLine();
        ArrayList<String> words =  new ArrayList<>();
        while(sc.hasNextLine()) {

            s = sc.nextLine().trim();
            if(s == null || s.isEmpty())
                break;
            words.add(s);
        }

//        String[] dictionary = words.toArray(new String[0]);
        R=grid.length;
        C=grid.length;
        Set<String> wordsSet =  new HashSet<String>(words);
        patternSearch(grid, wordsSet);

        for(String word: words) {
            if(!ans.containsKey(word)) {
                ans.put(word, new pair(-1,-1));
            }


        }
        Map<String, pair> sortedMap = new TreeMap<String, pair>(ans);
        for(Map.Entry<String,pair> entry : sortedMap.entrySet()) {
            String key = entry.getKey();
            pair value = entry.getValue();

            System.out.println(key + " " + value.getA()+" "+ value.getB());
        }



    }




}
