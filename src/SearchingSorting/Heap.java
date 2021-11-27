package SearchingSorting;

import java.util.Arrays;

public class Heap {
    int[] arr;
    int size;
    int end;
    Heap(int size){
        this.size=size;
        arr=new int[size+1];
        Arrays.fill(arr,0);
        end=0;
    }
    private void makeItHeap(){

    }
    private void swap(int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void add(int val){
        if(end==size){
            System.out.println("Heap Is Full.");
            return;
        }
        end++;
        arr[end]=val;
        int index=end;
        int nodeIndex=end/2;
        while (index!=1 && arr[index]<arr[nodeIndex]){
            swap(index,nodeIndex);
            index=nodeIndex;
            nodeIndex=index/2;
        }
    }
    public Integer peek(){
        if(end==0){
            return null;
        }else {
            return arr[1];
        }
    }

    public Integer pop(){
        if(end==0){
            return null;
        }
        int val=arr[1];
        arr[1]=arr[end];
        end--;
        int index=1;
        while (index<=end){
            int leftCi=index*2;
            int rightCi=(leftCi+1);
            int minCi;
            if(arr[leftCi]<arr[rightCi]){
                minCi=leftCi;
            }else {
                minCi=rightCi;
            }
            swap(index,minCi);
            index=minCi;
        }
        return val;
    }
    private String getString(int[] a,int end){
        if (a == null)
            return "null";
        int iMax = end;
        if (iMax == 0)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 1; ; i++) {
            b.append(a[i]);
            if (i == end)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    @Override
    public String toString() {

        return getString(arr,end);
    }


    public static void main(String[] args) {
        Heap h=new Heap(20);
        h.add(5);
        h.add(77);
        h.add(8);
        h.add(22);
        System.out.println(h);
        System.out.println(h.peek());
        h.add(1);
        System.out.println(h);
        System.out.println(h.pop());
        System.out.println(h);
        System.out.println(h.pop());
        System.out.println(h);
    }
}
