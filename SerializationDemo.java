package ioprogramsssss;
import java.io.*;
class Book implements Serializable
{
	int bno;
	String bname;
	transient double price;//not included during serialization
	public Book(int bno,String bname,double price)
	{
		this.bno=bno;
		this.bname=bname;
		this.price=price;
	}
	public Book() {}
	public String toString()
	{
		return bno+" "+bname+" "+price;
	}
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//Serialization
		FileOutputStream fos=new FileOutputStream("book.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Book b=new Book(111,"Java",500.0);
		oos.writeObject(b);
		oos.close();
		//deserialization
		FileInputStream fis=new FileInputStream("book.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Book b1=(Book)ois.readObject();
		System.out.println(b1);//invokes toString() implicitly
		ois.close();
		fis.close();
	}

}