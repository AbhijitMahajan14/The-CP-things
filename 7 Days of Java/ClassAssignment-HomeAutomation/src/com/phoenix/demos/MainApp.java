package com.phoenix.demos;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Home[] rooms=new Home[100];
//		Fan f=new Fan();
//		Home room = new Home();
//		Home.DeviceObjects.add(f);
//		f.turnOn();
//		Fan n=(Fan) Home.DeviceObjects.get(0);
//		System.out.println(n.getStatus());
//		
////		Ac a=new Ac();
////		Home.DeviceObjects.add(a);
////		Ac na= (Ac) Home.DeviceObjects.get(1);
////		a.turnOff();
//	System.out.println(a.getStatus());
////		
//
//		Home Bedroom=new Home();
//		Fan BedFan=new Fan();
//		Home.DeviceObjects.add(BedFan);
//		Fan f1=(Fan)Home.DeviceObjects.get(1);
//		f1.turnOff();
//		Fan f1=(Fan)Home.DeviceObjects.get(0);
//		System.out.println(f1.getStatus());

		
		System.out.println("Add a room in Home :");
		Home newRoom=new Home("Bedroom");
		rooms[0]=newRoom;
		System.out.println(rooms[0]);
		Fan f1=new Fan();
		rooms[0].DeviceObjects.add(f1);
		((Fan) rooms[0].DeviceObjects.get(0)).turnOn();
		System.out.println(((Fan) rooms[0].DeviceObjects.get(0)).getStatus());
		
		
		
		
		Home bedRoom = new Home("Bedroom");
		rooms[1]=bedRoom;
		Fan f2=new Fan();
		rooms[1].DeviceObjects.add(f2);
		System.out.println("Enter Room name :");
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		if(s.equals("Bedroom"))
		{
			((Fan) rooms[1].DeviceObjects.get(0)).turnOn();
			System.out.println("Bedroom fan status :"+((Fan) rooms[1].DeviceObjects.get(0)).getStatus());
		}
		
		System.out.println("Enter Room name  :");
		//Scanner sc = new Scanner(System.in);
		String st=sc.next();
		System.out.println("Enter device name  :");
		String device=sc.next();
		
		if(device.equals("fan"))
		{
			((Fan) rooms[1].DeviceObjects.get(0)).turnOn();
			System.out.println("Bedroom fan status :"+((Fan) rooms[1].DeviceObjects.get(0)).getStatus());

		}
		
	}
}
