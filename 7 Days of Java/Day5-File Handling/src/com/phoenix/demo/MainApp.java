package com.phoenix.demo;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.phoenix.demos.Account;

public class MainApp {
	public static void main(String[] args) {
		HandlingFile h= new HandlingFile(1,"Abhi",23.4f);
		
		try {
			FileOutputStream fout = new FileOutputStream("data.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			ObjectOutputStream oout=new ObjectOutputStream(bout);
			oout.writeObject(h);
			oout.close();
			bout.close();
			fout.close();
			
			FileInputStream fin = new FileInputStream("data.txt");
			ObjectInputStream oin=new ObjectInputStream(fin);
			
			HandlingFile h2= (HandlingFile)oin.readObject();
			oin.close();
			System.out.println(h2);
			
			
			FileInputStream fin2 = new FileInputStream("new.txt");
			ObjectInputStream oin2=new ObjectInputStream(fin2);
			
			Account h3= (Account)oin2.readObject();
			oin.close();
			System.out.println(h3);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}
}
