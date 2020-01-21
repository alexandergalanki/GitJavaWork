import java.util.ArrayList;
import java.util.Scanner;
class Student{}
class Trainer{}
class Hcl{}
public class InstanceOfTutorial{
 static String count(ArrayList mylist){
 int a = 0,b = 0,c = 0;
 for(int i = 0; i < mylist.size(); i++){
 Object element=mylist.get(i);
 if(element instanceof Student) a++;
 if(element instanceof Trainer) b++;
 if(element instanceof Hcl) c++;
 }
 String ret = Integer.toString(a)+" "+Integer.toString(b)+" "+ Integer.toString(c);
return ret;
}
public static void main(String []args){
ArrayList mylist = new ArrayList();
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for(int i=0; i<t; i++){
String s=sc.next();
if(s.equals("Student"))mylist.add(new Student());
if(s.equals("Trainer"))mylist.add(new Trainer());
if(s.equals("Hcl"))mylist.add(new Hcl());
}
System.out.println(count(mylist));
}
}