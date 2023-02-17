package game;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Random;
public class Frame extends JFrame
{

    //构造函数
    long startTime =  System.currentTimeMillis();
    public Frame()
    {
        //初始化窗体大小位置等
        initBasic();

        //鼠标监听，设置窗口可关闭
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        //键盘监听，获取方向键执行操作
        this.addKeyListener(new KeyAdapter(){

        });
        //可视化
        setVisible(true);
    }
    private void initBasic()
    {
        this.setTitle("拼搏最快，我要合成128！！！");	//设置标题
        this.setSize(750, 800);		//设置窗体大小
        this.setLocation(400, 0);	//设置窗体显示位置
        this.setLayout(null);		//设置窗体布局方式为自由布局方式（自由布局就可以按照像素位置去放置组件）
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);	//设置窗体x为默认关闭窗口

    }

}