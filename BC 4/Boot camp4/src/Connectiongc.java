import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Connection {
 private String databaseUrl;
 private String userName;
 private String passWord;
 public String getDatabaseUrl() {
  return databaseUrl;
 }
 public void setDatabaseUrl(String databaseUrl) {
  this.databaseUrl = databaseUrl;
 }
 public String getUserName() {
  return userName;
 }
 public void setUserName(String userName) {
  this.userName = userName;
 }
 public String getPassWord() {
  return passWord;
 }
 public void setPassWord(String passWord) {
  this.passWord = passWord;
 }
}
public class Connectiongc{
 public static void main(String[] args) throws IOException {
  boolean flag = true;
  char reply = 'y';
  int connectionCounter = 0;
  Scanner sc = new Scanner(System.in);
  List<Connection> conList = new ArrayList();
  while (flag) {
	  
   System.out.println("Enter user name:");
   Connection con = new Connection();
   con.setUserName(sc.nextLine());
   System.out.println("Enter password:");
   con.setPassWord(sc.nextLine());
   System.out.println("Enter Database url:");
   con.setDatabaseUrl(sc.nextLine());
   conList.add(con);
   connectionCounter++;
   
   System.out.println("Wish to add more connections?(y/n):");
   reply = sc.nextLine().charAt(0);
   if (reply == 'n' || reply == 'N')
   {
    flag=false;
    break;
   }
   if(connectionCounter==2) {
     System.out.println("Finalizing...");
     // set the new connectionList first element to null
     try
     {
     conList.set(0,null);
     
     // call garbage collector explicitly
     System.gc();
     System.out.println("Finalized.");
     connectionCounter--;
     continue;
     }catch(NullPointerException ne)
     {
      System.out.println("Null pointer exception occured");
     }
    }
   
  }
  // display user info with number of connections
  for (Connection c : conList) {
	  System.out.println("User Information:");
   System.out.println("User Name:" + c.getUserName());
   System.out.println("Password:" + c.getPassWord());
   System.out.println("Database url:" + c.getDatabaseUrl());
   System.out.println("Number of connections:" + conList.size());
  }
 }
 protected void finalize() {
  
  System.out.println("object is garbage collected");
 }
}