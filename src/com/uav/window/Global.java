package com.uav.window;

import java.util.ArrayList;
import java.util.Vector;

public class Global {
    public static Vector v=new Vector();
    public static ArrayList<Target> U1=new ArrayList<Target>();
    public static ArrayList<Target> U2=new ArrayList<Target>();
    public static ArrayList<Target> U3=new ArrayList<Target>();
    public static ArrayList<Target> U4=new ArrayList<Target>();
    public static ArrayList<Target> mubiao=new ArrayList<Target>();
    public static boolean flag=false;
    static{
    	v.add("U1           ");
    	v.add("U2           ");
    	v.add("U3           ");
    	v.add("U4           ");
    	Target []targets=new Target[13];
        targets[0]=new Target(300,100);
        targets[1]=new Target(100,100);
        targets[2]=new Target(100,200);
        targets[3]=new Target(100,300);
        targets[4]=new Target(100,400);
        targets[5]=new Target(300,500);
        targets[6]=new Target(300,300);
        targets[7]=new Target(400,400);
        targets[8]=new Target(400,200);
        targets[9]=new Target(500,200);
        targets[10]=new Target(500,300);
        targets[11]=new Target(100,400);
        targets[12]=new Target(500,100);
        U1.add(targets[0]);
        U1.add(targets[8]);
        U1.add(targets[9]);
        U1.add(targets[10]);
        U1.add(targets[0]);
        U2.add(targets[0]);
        U2.add(targets[1]);
        U2.add(targets[2]);
        U2.add(targets[3]);
        U2.add(targets[4]);
        U2.add(targets[11]);
        U2.add(targets[0]);
        U3.add(targets[0]);
        U3.add(targets[6]);
        U3.add(targets[5]);
        U3.add(targets[0]);
        U4.add(targets[0]);
        U4.add(targets[1]);
        U4.add(targets[2]);
        U4.add(targets[0]);
    }
    
    
    
}
