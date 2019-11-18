import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraysdemo implements Comparator {

public static void main(String args[])
{
int marks[]= {82,78,55};
String subjects[]= {"Maths","physics","Chemistry"};

List<String>booklist=new ArrayList<String>();

booklist.add("let us C by Yasthwanth Kanetkar");
booklist.add("Welcome to JAVA By Herbert Sheildt");
booklist.add("Core Java");

//Collections.sort(booklist);
Collections.sort(booklist,Collections.reverseOrder());

for(String book:booklist)
{
System.out.println(book);
}

for(byte b=0;b<subjects.length;b++)
{
System.out.println(subjects[b]+" Marks : "+marks[b]);
}
System.out.println("Before sorting an Array");
for(int m:marks)
{
System.out.println(m);
}
Arrays.sort(marks);

System.out.println("After sorting an array.");
for(int m:marks)
{
System.out.println(m);
}

}



@Override
public int compare(Object arg0, Object arg1) {
String s1=(String)arg0;
String s2=(String)arg1;
if(s1.equals(s2))
{
return 1;
}
else
{
return 0;
}


}

}