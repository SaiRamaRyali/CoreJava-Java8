package com.demo.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.demo.model.Product;

public class PersistProducts {

	Product p;
	FileOutputStream fos;
	ObjectOutputStream os;
	FileInputStream fis;
	ObjectInputStream ois;
	
	PersistProducts()
	{
		try
		{
			fos = new FileOutputStream("temp.txt");
			os = new ObjectOutputStream(fos);
			p = new Product(101,"USB 16GB",12.99);
			System.out.println(p);
			
			os.writeObject(p);
			System.out.println("Done!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	void readData() throws IOException, ClassNotFoundException
	{
		fis = new FileInputStream("temp.txt");
		ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		System.out.println((Product)obj);
		
	}
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		PersistProducts pp = new PersistProducts();
		pp.readData();
	}

}
