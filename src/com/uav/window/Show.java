package com.uav.window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Show extends HomePanel{
	ImageIcon icon;  
    Image img; 
	public String str="";
	public static JTextArea tx;
	public static int WIDTH=600;
	public static int HEIGHT=400;
	public static int dx=150;
	public static int dy=100;
	public static BufferedImage background; //背景图片  
	public static BufferedImage bigplane; //飞机图片
	//静态块，在类加载到方法区时执行一次，专门加载静态资源  
	
    static{  
        /* 
         * java从硬盘中加载图片到内存中： 
         * ImageIO.read方法：专门从硬盘中加载图片的静态方法 
         * 不用实例化，直接调用 
         * ShootGame.class:获得当前类的加载器所在路径 
         * ShootGame.class.getRerource("文件名"); 从当前类所在路径加载指定文件到程序中 
         */  
    	
       /* try {  
            background = ImageIO.read(new FileInputStream("/home/dujianjian/blog/background.png"));  
            bigplane = ImageIO.read(new FileInputStream("/home/dujianjian/blog/bigplane.png"));    
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  */
    } 
    public Flyer[] flyers = {}; //存储所有飞机的数组
    //定义游戏状态：当前状态变量：默认为开始状态  
    private int state = START;  
    //定义游戏状态的备选项常量：  
    public static final int START = 0;  
    public static final int RUNNING = 1;  
    public static final int PAUSE = 2;  
    public static final int GAME_OVER = 3;  
    
    /*
     * add函数
     */
	public void add(Component c,GridBagConstraints con,int x,int y,int w,int h){
		con.gridx=x;
		con.gridy=y;
		con.gridwidth=w;
		con.gridheight=h;
		add(c,con);
	}
	/*@Override  
	 public void paint(Graphics g) {  
        //step1: 绘制背景图片  
        g.drawImage(background, 0, 0, null);  
        //step2: 绘制英雄机  
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
          
    }  */
	/*public void paintComponent(Graphics g) {  
        super.paintComponent(g);  
        //下面这行是为了背景图片可以跟随窗口自行调整大小，可以自己设置成固定大小  
        g.drawImage(img, 0, 0,this.getWidth(), this.getHeight(), this);  
    }  */
    public Show(){
    //	this.setOpaque(false);
    //  /img/HomeImg.jpg 是存放在你正在编写的项目的bin文件夹下的img文件夹下的一个图片  
        
    	JFrame jf=new JFrame("无人机任务规划仿真系统");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout lay=new GridBagLayout();
		setLayout(lay);
		jf.add(this,BorderLayout.WEST);
		jf.setSize(WIDTH, HEIGHT);
		Toolkit kit=Toolkit.getDefaultToolkit();//设置顶层容器框架为居中
		Dimension screenSize=kit.getScreenSize();
		int width=screenSize.width;
		int height=screenSize.height;
		int x=(width-WIDTH)/2;
		int y=(height-HEIGHT)/2;
		jf.setLocation(x, y);
		//===============================================================//
		JButton b1=new JButton("仿 真 选 择");
		//b1.setBackground(Color.CYAN);
		//b1.setBounds(0,50,300,200);
		//b1.setPreferredSize(new Dimension(150,100));
		JButton b2=new JButton("协同侦查开始");
		JButton b3=new JButton("协同侦查暂停");
		JButton b4=new JButton("兵力分配开始");
		JButton b5=new JButton("兵力分配暂停");
		JButton b6=new JButton("模拟突发情况");
		JLabel tab1=new JLabel("基本配置");
		tab1.setBackground(Color.blue);
		JLabel tab2=new JLabel("仿真实验");
		tx=new JTextArea(10,80);
		tx.setBackground(Color.GREEN);
		GridBagConstraints constaints=new GridBagConstraints();
		constaints.fill=GridBagConstraints.NONE;
		constaints.anchor=GridBagConstraints.CENTER;
		constaints.weightx=1200;
		constaints.weighty=800;
		add(tab1,constaints,0,0,300,50);
		add(b1,constaints,0,50,300,200);
		add(tab2,constaints,0,250,300,50);
		add(b2,constaints,0,300,300,100);
		add(b3,constaints,0,400,300,100);
		add(b4,constaints,0,500,300,100);
		add(b5,constaints,0,600,300,100);
		add(b6,constaints,0,700,300,100);
		add(tx,constaints,300,600,900,200);
		
		//===============================================================//
		jf.setResizable(false);
		jf.setVisible(true);
		//===============================================================//
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//str+='\n'+"ss";
				//tx.setText(str);
				new Choose1();
			}
			
		});
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				str="侦查任务规划仿真开始==========================";
				str+='\n'+"分配方案为";
				str+='\n'+"UAV1 传感器类型：红外传感器，侦查路线：0-8-9-10-0";
				str+='\n'+"UAV2 传感器类型：摄像头传感器，侦查路线：0-1-2-3-4-11-0";
				str+='\n'+"UAV3 传感器类型：摄像头传感器，侦查路线：0-6-5-0";
				str+='\n'+"UAV4 传感器类型：红外传感器，侦查路线：0-12-0";
				str+='\n'+"突发情况：无";
				str+='\n'+"侦查任务规划仿真结束==========================";
				//str+='\n'+"ss";
				tx.setText(str);
				//new Choose1();
			}
			
		});
		b6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				//str+='\n'+"ss";
				//tx.setText(str);
				new Tufa();
				//new Choose1();
			}
			
		});
    }
}
