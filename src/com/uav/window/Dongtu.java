package com.uav.window;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Dongtu extends JPanel{
	private static final long serialVersionUID = 1L;  
	Target []targets;
	Flyer []flys;
    //背景图片的大小320*568  
    public static final int WIDTH = 600;  
    public static final int HEIGHT = 608;  
    //界面固定大小336*607  
    public static final int FRAME_WIDTH = 600;  
    public static final int FRAME_HEIGHT = 600; 
    public static BufferedImage background; //背景图片  
    public static BufferedImage airplane; //敌机图片  
    public static BufferedImage fly; //飞机  
    
    public void action(){
    	//step1: 创建定时器  
        Timer timer = new Timer();  
        //step2: 调用定时器对象的schedule方法，做计划  
        //       第一个参数：TimerTask类型的匿名内部类  
        //               必须重写run方法——核心——要做什么事  
        timer.schedule(new TimerTask(){  
            //首先定义一个计时器变量index，记录run方法运行的次数  
            private int runTimes = 0;  
  
            @Override  
            public void run() {  
                //除了repaint方法，其余功能只在RUNNING状态下执行  
            	runTimes++;
            	if(runTimes%100==0){
            		runTimes=0;
            		 
            		for(Flyer i:flys){
            			i.step();
            			repaint();  
            			//System.out.println(flys.length);
            		}
            	}
                /*强调：只要界面发生变化，必须调用repaint方法重新绘制界面*/  
                
            }  
              
        }, 10,10); //界面每隔10亳秒变化一次  
    }

    @Override  
    public void paint(Graphics g) {  
        //step1: 绘制背景图片  
        g.drawImage(background, 0, 0, null);   
        g.drawImage(background, 300, 0, null);  
        //g.drawImage(fly, 200, 100, null);  
       painttarget(targets, g);
        paintflyt(flys,g);
      /*  //step2: 绘制英雄机  
        paintHero(g);  
        //step3: 批量绘制敌人数组  
        paintFlyers(g);  
        //step4: 批量绘制子弹数组  
        paintBullets(g);  
        //绘制分数和生命值  
        paintScore_Life(g);  
          
        //根据游戏状态绘制不同图片  
        if(state == START){  
            g.drawImage(start, 0, 0, null);  
        }else if(state == PAUSE){  
            g.drawImage(pause, 0, 0, null);  
        }else if(state == GAME_OVER){  
            g.drawImage(gameover, 0, 0, null);  
        }  
          */
    }  
    public void painttarget(Target []targets,Graphics g){
    	for(Target tar:targets){
    		g.drawImage(airplane, (int)tar.x, (int)tar.y, null);  
    	}
    }
    public void paintflyt(Flyer []flyt,Graphics g){
    	for(Flyer tar:flyt){
    		g.drawImage(fly, (int)tar.x, (int)tar.y, null);  
    	}
    }
    public Dongtu(){
    	targets=new Target[13];
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
        flys=new Flyer[4];
        flys[0]=new Flyer(300,100,Global.U1);
        flys[1]=new Flyer(300,100,Global.U2);
        flys[2]=new Flyer(300,100,Global.U3);
        flys[3]=new Flyer(300,100,Global.U4);
    	try{
    		background = ImageIO.read(new FileInputStream("/home/dujianjian/blog/background.png"));  
            fly = ImageIO.read(new FileInputStream("/home/dujianjian/blog/fly.png"));  
            airplane = ImageIO.read(new FileInputStream("/home/dujianjian/blog/bigplane.png")); 
    	}catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }
    	JFrame frame = new JFrame("仿真演示");  
        frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);//(336, 607);  
        frame.setAlwaysOnTop(true); //设置窗体置顶  
        //设置窗体关闭同时，退出程序  
        frame.setLocationRelativeTo(null); //设置窗体的位置，null表示居中  
          
        /*在窗体中嵌入背景面板对象——JPanel*/  
       // Dongtu game = new Dongtu(); //创建背景面板对象  
        frame.add(this); //将背景面板对象嵌入到窗体对象中  
        /*窗体默认不可见！必须调用setVisible方法才能显示窗体*/  
        frame.setVisible(true); //自动调用窗体的paint方法  
        action();
    }
}
