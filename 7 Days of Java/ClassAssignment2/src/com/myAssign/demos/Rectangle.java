package com.myAssign.demos;

public class Rectangle implements Area {
    int l=10;
    int b=20;
    public Rectangle() {
            // TODO Auto-generated constructor stub
    }
    
    public void rectangle() {
            int area=l*b;
            System.out.println("Area of rectangle :" +area);
    }

    @Override
    public void square() {
            // TODO Auto-generated method stub
            
    }

    @Override
    public void circle() {
            // TODO Auto-generated method stub
            
    }
}