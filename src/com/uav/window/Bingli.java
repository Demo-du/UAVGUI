package com.uav.window;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bingli extends JPanel{
	public static int WIDTH=400;
	public static int HEIGHT=250;
	public void add(Component c,GridBagConstraints con,int x,int y,int w,int h){
		con.gridx=x;
		con.gridy=y;
		con.gridwidth=w;
		con.gridheight=h;
		add(c,con);
	}
	public Bingli(){
		final JFrame jf=new JFrame("兵力分配仿真配置");
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
		JLabel L1=new JLabel("  节点编号");
		JLabel L2=new JLabel("  节点坐标x");
		JLabel L3=new JLabel("  节点坐标y");
		JLabel L4=new JLabel("路径头编号");
		JLabel L5=new JLabel("路径尾编号");
		JLabel L6=new JLabel("路径所能通过最大UAV数量");
		JLabel tm1=new JLabel("   ");
		JLabel tm2=new JLabel("   ");
		JLabel tm3=new JLabel("   ");
		JLabel tm4=new JLabel("   ");
		JLabel tm5=new JLabel("   ");
		JLabel tm6=new JLabel("   ");
		JTextField T1=new JTextField(5);
		JTextField T2=new JTextField(5);
		JTextField T3=new JTextField(5);
		JTextField T4=new JTextField(5);
		JTextField T5=new JTextField(5);
		JTextField T6=new JTextField(5);
		JButton b1=new JButton("添加节点");
		JButton b2=new JButton("添加路径");
		JButton b3=new JButton("确定");
		JButton b4=new JButton("取消");
		GridBagConstraints constaints=new GridBagConstraints();
		constaints.fill=GridBagConstraints.NONE;
		constaints.anchor=GridBagConstraints.CENTER;
		constaints.weightx=400;
		constaints.weighty=250;
		add(L1,constaints,0,0,100,50);
		add(L2,constaints,0,50,100,50);
		add(L3,constaints,0,100,100,50);
		add(L4,constaints,200,0,100,50);
		add(L5,constaints,200,50,100,50);
		add(L6,constaints,200,100,100,50);
		add(T1,constaints,100,0,100,50);
		add(T2,constaints,100,50,100,50);
		add(T3,constaints,100,100,100,50);
		add(T4,constaints,300,0,100,50);
		add(T5,constaints,300,50,100,50);
		add(T6,constaints,300,100,100,50);
		add(tm1,constaints,0,150,50,50);
		add(b1,constaints,50,150,100,50);
		add(tm2,constaints,150,150,50,50);
		add(b2,constaints,200,150,100,50);
		add(tm3,constaints,0,200,100,50);
		add(b3,constaints,100,200,100,50);
		add(tm4,constaints,200,200,100,50);
		add(b4,constaints,200,200,100,50);
		//==============================================//
		jf.setResizable(false);
		jf.setVisible(true);
		//==============================================//
		b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("sssss");
				jf.dispose();
				//new Show();
			}
			
		});
		b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("sssss");
				jf.dispose();
				//new Show();
			}
			
		});
	}
}
