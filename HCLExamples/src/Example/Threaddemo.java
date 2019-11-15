package Example;

class MyThread extends Thread

{
MyThread()
{
System.out.println("myThread created");
}
@Override
public void run()
{
for(int i=0;i<1000;i++)
{
System.out.println("myThread"+this.getName()+"is running");
try {
this.sleep(1000);
}catch(InterruptedException ie)
{
System.out.println("thread"+this.getName()+"interrupted!!!");
}
}

}
}
public  class Threaddemo
{

public static void main(String[] args)
{
MyThread mt=new MyThread();
mt.start();
MyThread nt=new MyThread();
nt.start();
}
}