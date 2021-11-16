package Graph;

import java.util.ArrayList;

public class RepresentationGraphArrayList {
    public static void main(String[] args) {
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


    }
}
