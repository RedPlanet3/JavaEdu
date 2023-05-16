import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Error20 {
    static ArrayList<ArrayList<Integer>> graph;
    static int[] visited;
    static StringBuilder compStr = new StringBuilder();
    static PrintWriter pw;
    static int chF = 0;

    public static void dfs(int current, int ch)
    {
        visited[current] = 1;
        for (int neig: graph.get(current))
        {
            if (visited[neig] == -1) {
                dfs(neig, ch);
            }
            if (visited[neig] == 1)
            {
                pw.println(-1);
                pw.close();
//                System.out.println(-1);

                System.exit(0);
            }
        }
        visited[current] = 2;
        compStr.insert(0, " ").insert(0,current);
        chF++;
    }

    public static int[] toArrayInt(String []s)
    {
        int []arr = new int[s.length];
        for (int i = 0; i < s.length; i++)
            arr[i] = Integer.parseInt(s[i]);
        return arr;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        long start = System.nanoTime();

        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        pw = new PrintWriter("output2.txt");

        int []nm = toArrayInt(in.readLine().trim().split(" "));
        graph = new ArrayList<>();
        visited = new int[nm[0] + 1];
        for (int j = 0; j < nm[0] + 1; j++)
            graph.add(new ArrayList<>());
        int[] ab;
        for (int i = 0; i < nm[1]; i++) {
            ab = toArrayInt(in.readLine().trim().split(" "));
            graph.get(ab[0]).add(ab[1]);
            visited[ab[1]] = -1;
        }
        in.close();
        int ch = -1;
        for (int i = 1; i < nm[0] + 1; i++)
        {
            if (visited[i] == 0)
                dfs(i, ch++);
        }
        if (ch == -1 || nm[0] > chF)
        {
            pw.println(-1);

//            System.out.println(-1);

        }

        else {
            pw.println(compStr);
//            System.out.println(compStr);
            }

        pw.close();


        Thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Прошло времени, нс: " + elapsed / 1000000);
    }
}
