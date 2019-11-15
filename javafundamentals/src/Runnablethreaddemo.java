

class Mythread implements Runnable
{
private String threadName;
//constructor
Mythread()
{
threadName=Thread.currentThread().getName();
System.out.println("Thread"+threadName+"created");
}
@Override
public void run() {
System.out.println("Mythread running successfully");
}
}
public class Runnablethreaddemo {

public static void main(String[] args) {

System.out.println("threadName:"+Thread.currentThread().getName()+"started");

}

}

