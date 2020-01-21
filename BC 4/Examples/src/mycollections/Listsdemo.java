package mycollections;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Collection;
import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//POJO class
class Product
{
	private int pcode;
	private String pname;
	private int price;
	private char ptype;
	private ArrayList listOfprices;
	
	Product(){};
	
	public int getPcode() {
		return pcode;
	}
	
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		
		
	}
	public char getPtype() {
		return ptype;
	}
	public void setPtype(char ptype) {
		this.ptype = ptype;
	}
	
	
	
}
class Orders
{
	private int orderId;
	private int productId;
	private int customerId;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	private Date orderDate;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
}
class Address
{
	String typeOfAddress;
	int hno;
	String streetName;
	String landMark;
	String city;
	String pincode;
	public String getTypeOfAddress() {
		return typeOfAddress;
	}
	public void setTypeOfAddress(String typeOfAddress) {
		this.typeOfAddress = typeOfAddress;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
}
class Customer
{
	private int customerId;
	private String customerName;
	private Address permAddress;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	public Address getPermAddress() {
		return permAddress;
	}

	public void setPermAddress(Address permAddress) {
		this.permAddress = permAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer newcustomer=(Customer)obj;
		if(this.customerId==newcustomer.customerId && this.customerName.equals(newcustomer.customerName))
		{
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int hashcode() {
	
	}
	
}
public class Listsdemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		List<Integer> prices=new ArrayList<Integer>();
		
		LinkedList<Product> ll=new LinkedList<Product>();
		
		Queue<Orders> orderQ=new PriorityQueue<Orders>();
		
		Set<Customer> customerSet=new HashSet<Customer>();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//accept customer data
		boolean flag=true;
		char reply='y';
		while(flag)
		{
			Customer c=new Customer();
			out.println("Enter Customer ID");
			c.setCustomerId(Integer.parseInt(br.readLine()));
			c.setCustomerName(br.readLine());
			//add customer object to the set
			customerSet.add(c);
			out.println("Wish to add more customers?(y/n)");
			reply=br.readLine().toLowerCase().charAt(0);
			if(reply!='y')
				flag=false;
		}
		//display customer
		showCollection(customerSet);
	}
	public static void showCollection(Collection c)
	{
		Iterator itr=c.iterator();
		
		while(itr.hasNext())
		{
			if(c instanceof Set)
			{
				Customer customer=(Customer)itr.next();
				out.println("Hash code for customer:"+customer.hashCode());
				out.println("Customer ID:"+customer.getCustomerId());
				out.println("Customer Name:"+customer.getCustomerName());
				
			}else if(c instanceof List)
			{
				Product product=(Product)itr.next();
				out.println("Product ID:"+product.getPcode()  );
				out.println("Product Name:"+product.getPname());
			}
		}
		}
	}
