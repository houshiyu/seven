package multithread;

public class ThreadTest {

    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(i*500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).run();
    }
}
