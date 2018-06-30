import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.*;

public class MultiThreadDemo {
    class Result<T>{
        public String name;
        public boolean success;
        public String msg;
        public T data;

        @Override
        public String toString() {
            return "Result{" +
                    "success=" + success +
                    ", data=" + data +
                    '}';
        }
    }
    Queue<Result<Integer>> results;
    ThreadPoolExecutor tpe;

    void init(){
        tpe=new ThreadPoolExecutor(100,
                110,

                1000,
                TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(20));
    }

    public int doIt(int i){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i+1;
    }

    public void sequncial(){
        results=new ArrayDeque<>();
        for(int i=0;i<100;i++){
            Result<Integer> rr=new Result<>();
            rr.success=true;
            rr.data=doIt(i);
            results.add(rr);
        }
    }
    public void mt(){
        results=new ArrayBlockingQueue<Result<Integer>>(100);
        for(int i=0;i<100;i++){
            final int ii=i;
            Runnable r=new Runnable() {
                @Override
                public void run() {
                    Result<Integer> rr=new Result<>();
                    rr.success=true;
                    rr.data=doIt(ii);
                    results.add(rr);
                }
            };
            tpe.execute(r);
        }
        while (results.size()<100){
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void record(String name,Runnable ra){
        long ctm=System.currentTimeMillis();
        System.out.println(String.format("begin %s,%d",name,ctm));
        ra.run();
        System.out.println(String.format("end %s,delta %d",name,System.currentTimeMillis()-ctm));
        System.out.println(results.size());
        for(Result ts :results){
            System.out.println(ts.toString());
        }
    }

    public static void main(String args[]){
        MultiThreadDemo e=new MultiThreadDemo();
        e.init();
        e.record("sequnecial", e::sequncial);
        e.record("mt",e::mt);
    }
}
