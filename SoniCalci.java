import java.io.*;
import java.util.*;
import java.awt.*;  
import javax.swing.*; 
import java.awt.event.*;  
import javax.swing.event.*; 

class SoniCalci extends JFrame implements ActionListener
{
  double num,ans;
  double num1;
  int cal;

  JLabel l1;
  JTextField t1;
  JRadioButton r1,r2;
  ButtonGroup g;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,
          bdot,bsqrt,bex,blog,b1x,bsin,bcos,btan,bsinh,bcosh,btanh,
          bxn,bper,bclr,bback,badd,bsub,bmul,bdiv,bx2,bx3,bfact,bpm,beq;

  SoniCalci()
  {
    super("SONI CALCI");

    l1= new JLabel("You are using SONI CALCI");

    t1= new JTextField();

    r1= new JRadioButton("on");
    r2= new JRadioButton("off");

    g= new ButtonGroup();

    b1= new JButton("1");
    b2= new JButton("2");
    b3= new JButton("3");
    b4= new JButton("4");
    b5= new JButton("5");
    b6= new JButton("6");
    b7= new JButton("7");
    b8= new JButton("8");
    b9= new JButton("9");
    b0= new JButton("0");

    bdot= new JButton(".");
    bsqrt= new JButton("sqrt");
    bex= new JButton("exp");
    blog= new JButton("log");
    b1x= new JButton("1/x");

    bsin= new JButton("sin");
    bcos= new JButton("cos");
    btan= new JButton("tan");
    bsinh= new JButton("sinh");
    bcosh= new JButton("Cosh");
    btanh= new JButton("tanh");

    bxn= new JButton("x^n");
    bper= new JButton("%");
    bclr= new JButton("Clr");
    bback= new JButton("<-");

    badd= new JButton("+");
    bsub= new JButton("-");   
    bmul= new JButton("*");
    bdiv= new JButton("/");

    bx2= new JButton("x^2");
    bx3= new JButton("x^3");
    bfact= new JButton("n!");
    bpm= new JButton("+/-");
    beq= new JButton("=");
   
    //-----------------------Arranging the components
    //setLayout(new FlowLayout());
    setLayout(null);

    //row 1
    l1.setBounds(100,10,150,30);

    //row 2
    t1.setBounds(30,40,345,50);

    //row 3 
    r1.setBounds(40,100,40,30);
    r2.setBounds(100,100,40,30);

    //row 4
    bsqrt.setBounds(40,140,60,40);
    bex.setBounds(105,140,60,40);    
    bsin.setBounds(170,140,60,40);    
    bcos.setBounds(235,140,60,40);    
    btan.setBounds(300,140,60,40);

    //row 5
    b1x.setBounds(40,200,60,40);
    blog.setBounds(105,200,60,40);
    bsinh.setBounds(170,200,60,40);
    bcosh.setBounds(235,200,60,40);
    btanh.setBounds(300,200,60,40);

    //row 6
    bxn.setBounds(40,260,60,40);
    bper.setBounds(105,260,60,40);
    bclr.setBounds(170,260,60,40);
    bback.setBounds(235,260,60,40);
    badd.setBounds(300,260,60,40);

    //row 7
    bx3.setBounds(40,320,60,40);  
    b7.setBounds(105,320,60,40);
    b8.setBounds(170,320,60,40);
    b9.setBounds(235,320,60,40);
    bsub.setBounds(300,320,60,40);

    //row 8
    bx2.setBounds(40,380,60,40);
    b4.setBounds(105,380,60,40);
    b5.setBounds(170,380,60,40);
    b6.setBounds(235,380,60,40);
    bmul.setBounds(300,380,60,40);

    //row 9
    bfact.setBounds(40,440,60,40);
    b1.setBounds(105,440,60,40);
    b2.setBounds(170,440,60,40);
    b3.setBounds(235,440,60,40);
    bdiv.setBounds(300,440,60,40);

    //row 10
    bpm.setBounds(40,500,60,40);
    b0.setBounds(105,500,125,40);
    bdot.setBounds(235,500,60,40);
    beq.setBounds(300,500,60,40);


    //Adding the components
    //row 1
    add(l1);

    //row 2
    add(t1);

    //row 3
    add(r1);
    add(r2);
    g.add(r1);
    g.add(r2);

    //row 4
    add(bsqrt);
    add(bex);
    add(bsin);
    add(bcos);
    add(btan);

    //row 5
    add(b1x);
    add(blog);
    add(bsinh);
    add(bcosh);
    add(btanh);

    //row 6
    add(bxn);
    add(bper);
    add(bclr);
    add(bback);
    add(badd);

    //row 7
    add(bx3);
    add(b7);
    add(b8);
    add(b9);
    add(bsub);

    //row 8
    add(bx2);
    add(b4);
    add(b5);
    add(b6);
    add(bmul);

    //row 9
    add(bfact);    
    add(b1); 
    add(b2);
    add(b3);
    add(bdiv);

    //row 10
    add(bpm);
    add(b0);
    add(bdot);
    add(beq);

    //-----------------------adding ActionListener to all the buttons
    //row 3
    r1.addActionListener(this);
    r2.addActionListener(this);

    //row 4
    bsqrt.addActionListener(this);
    bex.addActionListener(this);
    bsin.addActionListener(this);
    bcos.addActionListener(this);
    btan.addActionListener(this);
 
    //row 5
    b1x.addActionListener(this);
    blog.addActionListener(this);
    bsinh.addActionListener(this);
    bcosh.addActionListener(this);
    btanh.addActionListener(this);

    //row 6
    bxn.addActionListener(this);
    bper.addActionListener(this);
    bclr.addActionListener(this);
    bback.addActionListener(this);
    badd.addActionListener(this);

    //row 7
    bx3.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    bsub.addActionListener(this);

    //row 8
    bx2.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    bmul.addActionListener(this);

    //row 9
    bfact.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    bdiv.addActionListener(this);

    //row 10
    bpm.addActionListener(this);
    b0.addActionListener(this);
    bdot.addActionListener(this);
    beq.addActionListener(this);


    setResizable(false);
    setSize(600,600);
    setLocation(10,10);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    //-----------------------Method to perform action 
    public void actionPerformed(ActionEvent e)
    {
      // for buttons 0 to 9
      if(e.getSource()==b1)
        t1.setText(t1.getText()+"1");
      else if(e.getSource()==b2)
        t1.setText(t1.getText()+"2");
      else if(e.getSource()==b3)
        t1.setText(t1.getText()+"3");
      else if(e.getSource()==b4)
        t1.setText(t1.getText()+"4");
      else if(e.getSource()==b5)
        t1.setText(t1.getText()+"5");
      else if(e.getSource()==b6)
        t1.setText(t1.getText()+"6");
      else if(e.getSource()==b7)
        t1.setText(t1.getText()+"7");
      else if(e.getSource()==b8)
        t1.setText(t1.getText()+"8");
      else if(e.getSource()==b9)
        t1.setText(t1.getText()+"9");
      else if(e.getSource()==b0)
        t1.setText(t1.getText()+"0");


      else if(e.getSource()==bdot)
        t1.setText(t1.getText()+".");

      else if(e.getSource()==bclr)
        t1.setText("");

      else if(e.getSource()==beq)
        calculation();

      //-----------------------for buttons performing add, sub, mul, div
      else if(e.getSource()==badd)
      {
        num=Double.parseDouble(t1.getText());
        cal=1;
        t1.setText("");
        //l1.setText(num+"+");
      }

      else if(e.getSource()==bsub)
      {
        num=Double.parseDouble(t1.getText());
        cal=2;
        t1.setText("");
        //l1.setText(num+"-");
      }

      else if(e.getSource()==bmul)
      {
        num=Double.parseDouble(t1.getText());
        cal=3;
        t1.setText("");
        //l1.setText(num+"*");
      }

      else if(e.getSource()==bdiv)
      {
        num=Double.parseDouble(t1.getText());
        cal=4;
        t1.setText("");
        //l1.setText(num+"/");
      }


      else if(e.getSource()==bxn)
      {
        num=Double.parseDouble(t1.getText());
        cal=5;
        t1.setText("");
        //l1.setText(num+"^");
      }

      else if(e.getSource()==bper)
      {
        num=Double.parseDouble(t1.getText());
        cal=6;
        t1.setText("");
        //l1.setText(num+"%");
      }

      else if(e.getSource()==beq)
      {
        calculation();
        t1.setText("");
      }

     //-----------------------other math class functions
      else if(e.getSource()==bsqrt)
      {
        num=Double.parseDouble(t1.getText());
        ans=Math.sqrt(num);
        t1.setText(Double.toString(ans));
      }


      else if(e.getSource()==bsin)
      {
        num=Double.parseDouble(t1.getText());
        ans=Math.sin(num);
        t1.setText(Double.toString(ans));
      }


      else if(e.getSource()==bsinh)
      {
        num=Double.parseDouble(t1.getText());
        ans=Math.sinh(num);
        t1.setText(Double.toString(ans));
      }

      else if(e.getSource()==bcos)
      {
        num=Double.parseDouble(t1.getText());
        ans=Math.cos(num);
        t1.setText(Double.toString(ans));
      }

      else if(e.getSource()==bcosh)
      {
        num=Double.parseDouble(t1.getText());
        ans=Math.cosh(num);
        t1.setText(Double.toString(ans));
      }

      else if(e.getSource()==btan)
      {
        num=Double.parseDouble(t1.getText());
        ans=Math.tan(num);
        t1.setText(Double.toString(ans));
      }

      else if(e.getSource()==btanh)
      {
        num=Double.parseDouble(t1.getText());
        ans=Math.tanh(num);
        t1.setText(Double.toString(ans));
      }

      else if(e.getSource()==blog)
      {
        num=Double.parseDouble(t1.getText());
        ans=Math.log(num);
        t1.setText(Double.toString(ans));
      }

      else if(e.getSource()==b1x)
      {
        num=Double.parseDouble(t1.getText());
        ans=(1/num);
        t1.setText(Double.toString(ans));
      }

      else if(e.getSource()==bx3)
      {
        num=Double.parseDouble(t1.getText());
        ans=num*num*num;
        t1.setText(Double.toString(ans));
      }

      else if(e.getSource()==bx2)
      {
        num=Double.parseDouble(t1.getText());
        ans=num*num;
        t1.setText(Double.toString(ans));
      }
 
      else if(e.getSource()==bex)
      {
        num=Double.parseDouble(t1.getText());
        ans=Math.exp(num);
        t1.setText(Double.toString(ans));
      }

      else if(e.getSource()==bfact)
      {
        num=Double.parseDouble(t1.getText());
        int i,fact=1;    
        for(i=1;i<=num;i++)   
          fact=fact*i;    
        
        ans=fact;
        t1.setText(Double.toString(ans));
      }
 
      else if(e.getSource()==r1)
        enable();

      else if(e.getSource()==r2)
        disable();

  }

  //Method to ON/OFF
  public void enable()
  {
    t1.setEditable(true);
    b1.setEnabled(true);
    b2.setEnabled(true);
    b3.setEnabled(true);
    b4.setEnabled(true);
    b5.setEnabled(true);
    b6.setEnabled(true);
    b7.setEnabled(true);
    b8.setEnabled(true);    
    b9.setEnabled(true);
    b0.setEnabled(true);
    bdot.setEnabled(true);
    bsqrt.setEnabled(true);
    bsin.setEnabled(true);
    bcos.setEnabled(true);
    btan.setEnabled(true);
    bsinh.setEnabled(true);
    bcosh.setEnabled(true);
    btanh.setEnabled(true);
    bx2.setEnabled(true);
    bx3.setEnabled(true);
    bxn.setEnabled(true);
    bex.setEnabled(true);
    b1x.setEnabled(true);
    blog.setEnabled(true);
    badd.setEnabled(true);
    bsub.setEnabled(true);
    bmul.setEnabled(true);
    bdiv.setEnabled(true);
    bfact.setEnabled(true);
    beq.setEnabled(true);
    bper.setEnabled(true);
    bback.setEnabled(true);
    bclr.setEnabled(true);
    bpm.setEnabled(true);
  }
  
  public void disable()
  {
    t1.setEditable(false);
    b1.setEnabled(false);
    b2.setEnabled(false);
    b3.setEnabled(false);
    b4.setEnabled(false);
    b5.setEnabled(false);
    b6.setEnabled(false);
    b7.setEnabled(false);
    b8.setEnabled(false);    
    b9.setEnabled(false);
    b0.setEnabled(false);
    bdot.setEnabled(false);
    bsqrt.setEnabled(false);
    bsin.setEnabled(false);
    bcos.setEnabled(false);
    btan.setEnabled(false);
    bsinh.setEnabled(false);
    bcosh.setEnabled(false);
    btanh.setEnabled(false);
    bx2.setEnabled(false);
    bx3.setEnabled(false);
    bxn.setEnabled(false);
    bex.setEnabled(false);
    b1x.setEnabled(false);
    blog.setEnabled(false);
    badd.setEnabled(false);
    bsub.setEnabled(false);
    bmul.setEnabled(false);
    bdiv.setEnabled(false);
    bfact.setEnabled(false);
    beq.setEnabled(false);
    bper.setEnabled(false);
    bback.setEnabled(false);
    bclr.setEnabled(false);
    bpm.setEnabled(false);
  } 

  // -----------------------function for calculation of add, sub, mul, div, x^n, %(modulo)
  public void calculation()
  {
    switch(cal)
    {
      case 1:
        ans=num+Double.parseDouble(t1.getText());
        t1.setText(Double.toString(ans));
        break;

      case 2:
        ans=num-Double.parseDouble(t1.getText());
        t1.setText(Double.toString(ans));
        break;

      case 3:
        ans=num*Double.parseDouble(t1.getText());
        t1.setText(Double.toString(ans));
        break;

      case 4:
        ans=num/Double.parseDouble(t1.getText());
        t1.setText(Double.toString(ans));
        break;
      
      case 5:
        ans=Math.pow(num,Double.parseDouble(t1.getText()));
        t1.setText(Double.toString(ans));
        break;

      case 6:
        double d= Double.parseDouble(t1.getText());
        int di= (int)Math.round(d);
        int numi=(int)Math.round(num);
        ans=Math.floorMod(numi,di);
        t1.setText(Double.toString(ans));
        break;
    }
  }


/*
  public void paint(Graphics gr)
  {
    gr.setColor(Color.cyan);
    gr.fillRect(30,40,360,500);
  }
*/

  public static void main(String args[])
  {
    new SoniCalci();
  }
}
