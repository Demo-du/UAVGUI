package com.uav.window;

import java.util.*;

public class Flyer {
    public float x;
    public float y;
    ArrayList<Target> list;
    int cnt=0;
    public Flyer(){
    	
    }
    public Flyer(float x,float y,ArrayList<Target> list1){
    	this.x=x;
    	this.y=y;
    	this.list=cal(list1);
    }
    public void step(){
    	if(cnt<list.size()-1)
    	    cnt++;
    	this.x=list.get(cnt).x;
    	this.y=list.get(cnt).y;
    }
    public ArrayList<Target> cal(ArrayList<Target> list){
    	ArrayList<Target> res=new ArrayList<Target>();
    	int tmp=0;
    	for(int i=0;i<list.size()-1;i++){
    		res.add(list.get(i));
    		/*float dx1=(list.get(i).x+list.get(i+1).x)/3;
    		float dx2=(list.get(i).x+list.get(i+1).x)/3*2;
    		float dy1=(list.get(i).y+list.get(i+1).y)/3;
    		float dy2=(list.get(i).y+list.get(i+1).y)/3*2;*/
    		float dx1=(list.get(i).x+list.get(i+1).x)/5;
    		float dx2=(list.get(i).x+list.get(i+1).x)/5*2;
    		float dx3=(list.get(i).x+list.get(i+1).x)/5*3;
    		float dx4=(list.get(i).x+list.get(i+1).x)/5*4;
    		float dy1=(list.get(i).y+list.get(i+1).y)/5;
    		float dy2=(list.get(i).y+list.get(i+1).y)/5*2;
    		float dy3=(list.get(i).y+list.get(i+1).y)/5*3;
    		float dy4=(list.get(i).y+list.get(i+1).y)/5*4;
    		res.add(new Target(dx1,dy1));
    		res.add(new Target(dx2,dy2));
    		res.add(new Target(dx3,dy3));
    		res.add(new Target(dx4,dy4));
    	}
    	res.add(list.get(list.size()-1));
    	return res;
    }
}
