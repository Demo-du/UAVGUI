package com.uav.window;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Zhencha extends JPanel{
	public static int WIDTH=400;
	public static int HEIGHT=200;
	public void add(Component c,GridBagConstraints con,int x,int y,int w,int h){
		con.gridx=x;
		con.gridy=y;
		con.gridwidth=w;
		con.gridheight=h;
		add(c,con);
	}
	public Zhencha(){
		final JFrame jf=new JFrame("侦查协同任务规划配置");
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
		//========================================//
		Vector v=new Vector();
		v.add("矩形");
		v.add("点状");
		v.add("线状");
		JComboBox com=new JComboBox(v);
		//com.setBorder(BorderFactory.createTitledBorder("目标形状"));
		JButton b1=new JButton("确定");
		JButton b2=new JButton("取消");
		JButton b3=new JButton("添加目标");
		JLabel L1=new JLabel(" UAV续航时间");
		JLabel L2=new JLabel(" UAV飞行速度");
		JLabel L3=new JLabel("目标坐标x");
		JLabel L4=new JLabel("目标坐标y");
		JLabel L5=new JLabel("目标形状");
		JLabel tm1=new JLabel("   ");
		JLabel tm2=new JLabel("   ");
		JLabel tm3=new JLabel("   ");
		final JTextField T1=new JTextField(5);
		final JTextField T2=new JTextField(5);
		final JTextField T3=new JTextField(5);
		final JTextField T4=new JTextField(5);
		GridBagConstraints constaints=new GridBagConstraints();
		constaints.fill=GridBagConstraints.NONE;
		constaints.anchor=GridBagConstraints.CENTER;
		constaints.weightx=400;
		constaints.weighty=200;	
		add(L1,constaints,0,0,100,50);
		add(T1,constaints,100,0,100,50);
		add(L2,constaints,0,50,100,50);
		add(T2,constaints,100,50,100,50);
		add(L3,constaints,200,0,100,50);
		add(T3,constaints,300,0,100,50);
		add(L4,constaints,200,50,100,50);
		add(T4,constaints,300,50,100,50);
		add(b1,constaints,200,150,50,50);
		add(b2,constaints,300,150,50,50);
		add(b3,constaints,50,150,100,50);
		add(L5,constaints,200,100,50,50);
		add(com,constaints,300,100,200,50);
		add(tm1,constaints,0,150,50,50);
		add(tm2,constaints,150,150,50,50);
		add(tm3,constaints,250,150,50,50);
		jf.setResizable(false);
		jf.setVisible(true);
	}
}
