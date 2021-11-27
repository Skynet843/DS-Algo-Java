import java.util.*;

public class SortListOfList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        ArrayList<Integer> b1=new ArrayList<>();
        b1.add(3);
        b1.add(1);
        b1.add(4);
        b1.add(2);
        ArrayList<Integer> b2=new ArrayList<>();
        b2.add(2);
        b2.add(4);
        b2.add(1);
        b2.add(3);

        al.add(b1);
        al.add(b2);

        for(ArrayList<Integer> item:al){
            System.out.println(item);
        }

        Collections.sort(al, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                int o1val=o1.get(0);
                int o2val=o2.get(0);
                for(int i=0;i<o1.size();i++){
                    if(o1.get(i)!=o2.get(i)) {
                        o1val = o1.get(i);
                        o2val = o2.get(i);
                        break;
                    }
                }
                return (o1val-o2val);
            }
        });


        for(ArrayList<Integer> item:al){
            System.out.println(item);
        }

    }
}
