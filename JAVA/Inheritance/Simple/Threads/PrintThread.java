package Threads;
public class PrintThread implements Runnable{
	 
    public int PRINT_NUMBERS_UPTO=10;
    static int  number=1;
    int remainder;
    static Object lock=new Object();
 
    PrintThread(int remainder)
    {
        this.remainder=remainder;
    }
 
    @Override
    public void run() {
        while (number < PRINT_NUMBERS_UPTO-1)
        {
            synchronized (lock) {
                while (number % 3 != remainder) 
                { 
                    try {
                        lock.wait();
                    } catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}