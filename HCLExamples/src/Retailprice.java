

import java.util.Scanner;

public class Retailprice {

public static void main(String[] args)

{

Scanner sc = new Scanner(System.in);

double prod1 = 22.50;

double prod2 = 44.50;

double prod3 = 9.98;


int productnum;

int quantitysold;

double retprice = 0;

System.out.println( "Enter a product number: ");

productnum = sc.nextInt();

System.out.println( "Enter the quantity sold: ");

quantitysold = sc.nextInt();

switch(productnum)

{

case 1:

retprice = prod1*quantitysold;

break;

case 2:

retprice = prod2*quantitysold;

break;

case 3:

retprice = prod3*quantitysold;

break;


}

System.out.println("The total retail value is: "+retprice);

}
}


