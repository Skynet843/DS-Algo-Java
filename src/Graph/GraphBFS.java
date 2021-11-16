package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    public static void main(String[] args) {
        // Create Graph
        int n=3,m=3; // n=number of node , m=number of edge
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<=n;i++)
            graph.add(new ArrayList<>());
        /*
            0->
            1->2
            2->1,3
            3->2,1

         */
        //edge 1---2
        graph.get(1).add(2);
        graph.get(2).add(1);

        //edge 2---3
        graph.get(2).add(3);
        graph.get(3).add(2);
        //edge 1---3
        graph.get(1).add(3);
        graph.get(3).add(1);

        /***************************************************************************************************************************
         *********************************************************** APPLY BFS ******************************************************
         ****************************************************************************************************************************/
        int[] vis=new int[n+1];
        Arrays.fill(vis,0);
        Queue<Integer> bfsQ=new LinkedList<>();
        bfsQ.add(1);
        for(int i=1;i<=n;i++){
            if(vis[i]!=1){
                ArrayList<Integer> node=graph.get(i);
                for(int j=0;j<node.size();j++)
                    bfsQ.add(node.get(j));
                vis[i]=1;
                System.out.print(bfsQ.remove()+", ");
            }
        }




    }
}
