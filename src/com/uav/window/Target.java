package com.uav.window;

public class Target {
    public float x;
    public float y;
    int node;
    public Target(){
   	 
    }
    public Target(int node,float x,float y){
   	 this.x=x;
   	 this.y=y;
   	 this.node=node;
    }
    public Target(float x,float y){
   	 this.x=x;
   	 this.y=y;
    }
    @Override
    public String toString(){
    	String res="";
    	res=res+"["+x+","+y+"]";
		return res;
    	
    }
}

