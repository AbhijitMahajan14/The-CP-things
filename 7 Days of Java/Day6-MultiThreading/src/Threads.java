

public class Threads extends Thread{
        
        public static void main(String[] args) {
                
                Threads t1=new Threads();
                Threads t2=new Threads();
                t1.setName("ThreadOne");
                t2.setName("ThreadTwo");
                t1.start();
                t2.start();        
        }
        
        public void run() {
                if(Thread.currentThread().getName().equals("ThreadOne")) {
                        
                        process1();        
                        process2();
                }else {
                        process3();
                        process4();
                        
                }
                process5();
        }
        public void process1() {
                System.out.println("Process 1 ");
        }
        
        public void process2() {
                System.out.println("Process 2 ");
        }
        
        public void process3() {
                System.out.println("Process 3 ");
        }
        
        public void process4() {
                System.out.println("Process 4 ");
        }
        
        public void process5() {
                System.out.println("Process 5 ");
        }
        
        public void process6() {
                System.out.println("Process 6 ");
        }
}