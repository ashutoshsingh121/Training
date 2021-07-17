package Threads;
class First
{
  synchronized public void display(String msg)
  {
    System.out.print ("Message is ---"+msg);
    try
    {
      Thread.sleep(500);
    }
    catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println ("------////");
  }
}
class Second extends Thread
{
  String msg;
  First fobj;
  Second (First fp,String str)
  {
    fobj = fp;
    msg = str;
    start();
  }
  public void run()
  {
    fobj.display(msg);
  }
}

public class SyncKey
{
  public static void main (String[] args)
  {
    First fnew = new First();
    Second ss = new Second(fnew, "welcome");
    Second ss1= new Second(fnew,"Mphasis ");
    Second ss2 = new Second(fnew, "to");
  }
}

