import java.io.*;
import java.util.*;

public class CpTemplate {
    /************************************************** FAST INPUT IMPLEMENTATION *********************************************/
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;
        private int line_length;

        public Reader(int ll,File filename) throws FileNotFoundException {
            din = new DataInputStream(new FileInputStream(filename));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
            line_length = ll;
        }
        public Reader(int ll) throws FileNotFoundException {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
            line_length = ll;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(
                    new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[line_length]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    } else {
                        continue;
                    }
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0,
                    BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    static class Writer{
        BufferedWriter output;
        Writer(File filename) throws FileNotFoundException {
            output= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));
        }
        Writer(){
            output = new BufferedWriter(new OutputStreamWriter(System.out));
        }
        <T> void println(T s) throws IOException {
            output.write(String.valueOf(s)+"\n");
            output.flush();
        }
        <T> void print(String s) throws IOException {
            output.write(String.valueOf(s));
            output.flush();
        }
    }

    static Writer wr;
    static Reader rd;  //Enter Required Line Length

    static {
        try {
            File input=new File("input.txt");
            File output=new File("output.txt");
            if(input.exists() && output.exists()){
                rd = new Reader(1000000,input);
                wr=new Writer( output);
            }else {
                rd = new Reader(1000000);
                wr=new Writer();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    /********************************************************* USEFUL CODE **************************************************/
    static boolean[] SAPrimeGenerator(int n){
        // TC-N*LOG(LOG N)
        //Create Prime Marking Array and fill it with true value
        boolean[] primeMarker=new boolean[n+1];
        Arrays.fill(primeMarker,true);
        primeMarker[0]=false;
        primeMarker[1]=false;
        for(int i=2;i<=n;i++){
            if(primeMarker[i]){
                // we start from 2*i because i*1 must be prime
                for(int j=2*i;j<=n;j+=i){
                    primeMarker[j]=false;
                }
            }
        }
        return primeMarker;
    }


    /* https://www.geeksforgeeks.org/java-tricks-competitive-programming-java-8/ */
    public static final int MOD=1000000007;
    static class Pair{
        int first_val,second_val;
        Pair(int f,int s){
            first_val=f;
            second_val=s;
        }
        Pair(){
            first_val=0;
            second_val=0;
        }
    }

    public static class PairSorterSV implements Comparator<Pair>
    {
        @Override
        public int compare(Pair o1, Pair o2) {
            return o1.second_val-o2.second_val ;
        }
    }
    public static class PairSorterFV implements Comparator<Pair>
    {
        @Override
        public int compare(Pair o1, Pair o2) {
            return o1.first_val-o2.first_val ;
        }
    }



    /***************************************************************************************************************************
     *********************************************************** MAIN CODE ******************************************************
     ****************************************************************************************************************************/
    public static void main(String[] args) throws IOException{
        int t=rd.nextInt();
        while (t-->0){

        }
    }

    /********************************************************* MAIN LOGIC HERE ****************************************************/

    public static void solve() throws IOException {

    }

}