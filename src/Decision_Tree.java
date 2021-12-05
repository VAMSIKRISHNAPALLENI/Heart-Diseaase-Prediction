import java.awt.*;  
import java.awt.event.*; 
import javax.swing.*;

  
class Decision_Tree implements ActionListener
{ 
    Frame f1,f2;

String result;
String name;
int age;
String race;
String exer;
int bp;
String systo;
String diago;
String Cpain;
String count;
String bpr;
int mhr;
String rbp;

Label la;
Label lb;
Label lc;
Label ld;
Label le;
Label lf;
Label lg;
Label lh;
Label li;
Label lj;
Label lk;
Label ll;
Label lm;
Label ln;
Label lo;
Label lp;
Label lq;
Label lr;
Label ls;
Label lt;
Label lu;
Label lv;
Label lw;
Label lx;
Label ly;
Label lz;
Label lZ;


Label l1;
Label l2;
Label l3;
Label l4;
Label l5;
Label l6;
Label l7;
Label l8;
Label l9;
Label l10;
Label l11;
Label l12;
Label l13;
static TextField t1;
TextField t2;
TextField t3;
TextField t4;
TextField t5;
TextField t6;
TextField t7;
TextField t8;
Button b1;
CheckboxGroup Chestpain;
Checkbox a;
Checkbox b;
Checkbox c;
Checkbox d;
CheckboxGroup bloodSugar;
Checkbox f;
Checkbox t;
CheckboxGroup rest;
Checkbox normal;
Checkbox leftvent;
Checkbox st_t_vent;
CheckboxGroup ex_ang;
Checkbox yes;
Checkbox no;

Decision_Tree()
{  
f2=new Frame();
f1=new Frame();
f1.setSize(700,500);  
f2.setSize(700,500); 
f2.setLayout(null);
f1.setLayout(null);  

f1.setVisible(true); 
f2.setVisible(false);


l1=new Label("Heart Dieaseas Predictor");
l1.setBounds(270,30,150,20);
f1.add(l1);
l2=new Label("Name");
l2.setBounds(20,70,200,20);
f1.add(l2);
l3=new Label("Age");
l3.setBounds(20,100,200,20);
f1.add(l3);
l4=new Label("Chest Pain");  
l4.setBounds(20,130,200,20);
f1.add(l4);
l5=new Label("Race");
l5.setBounds(20,160,200,20);
f1.add(l5);
l6=new Label("Country");
l6.setBounds(20,190,200,20);
f1.add(l6);
l7=new Label("Rest BloodPressure mm/HG");
l7.setBounds(20,220,200,20);
f1.add(l7);
l8=new Label("Maximum Heart Rate");
l8.setBounds(20,250,200,20);
f1.add(l8);
l9=new Label("Systolic blood pressure");
l9.setBounds(20,280,200,20);
f1.add(l9);
l10=new Label("Diagonostic blood Pressure");
l10.setBounds(20,310,200,20);
f1.add(l10);
l11=new Label("Blood Pressure");
l11.setBounds(20,340,200,20);
f1.add(l11);
l12=new Label("Rest Electrolytes");
l12.setBounds(20,370,200,20);
f1.add(l12);
l13=new Label("Exercise anginal");
l13.setBounds(20,400,200,20);
f1.add(l13);

   
t1=new TextField();
t1.setBounds(240,70,200,20);
f1.add(t1);
t2=new TextField();
t2.setBounds(240,100,200,20);
f1.add(t2);
t3=new TextField();
t3.setBounds(240,160,200,20);
f1.add(t3);
t4=new TextField();
t4.setBounds(240,190,200,20);
f1.add(t4);
t5=new TextField();
t5.setBounds(240,220,200,20);
f1.add(t5);
t6=new TextField();
t6.setBounds(240,250,200,20);
f1.add(t6);
t7=new TextField();
t7.setBounds(240,280,200,20);
f1.add(t7);
t8=new TextField();    
t8.setBounds(240,310,200,20);
f1.add(t8); 

Chestpain=new CheckboxGroup();
a=new Checkbox("Asympt",Chestpain,true);
a.setBounds(240,130,100,20);
f1.add(a);
b=new Checkbox("Atyp_anginal",Chestpain,true);
b.setBounds(350,130,100,20);
f1.add(b);
c=new Checkbox("Non-anginal",Chestpain,true);
c.setBounds(460,130,100,20);
f1.add(c);
d=new Checkbox("typ-anginal",Chestpain,true);
d.setBounds(570,130,100,20);
f1.add(d);

bloodSugar=new CheckboxGroup();
f=new Checkbox("F",bloodSugar,true);
f.setBounds(240,340,50,20);
f1.add(f);
t=new Checkbox("T",bloodSugar,true);
t.setBounds(300,340,50,20);
f1.add(t);

rest=new CheckboxGroup();
normal=new Checkbox("Normal",rest,true);
normal.setBounds(240,370,100,20);
f1.add(normal);
leftvent=new Checkbox("LeftVent",rest,true);
leftvent.setBounds(350,370,100,20);
f1.add(leftvent);
st_t_vent=new Checkbox("St_t_vent",rest,true);
st_t_vent.setBounds(460,370,100,20);
f1.add(st_t_vent);


ex_ang=new CheckboxGroup();
yes=new Checkbox("yes",ex_ang,true);
yes.setBounds(240,400,50,20);
f1.add(yes);
no=new Checkbox("no",ex_ang,true);
no.setBounds(300,400,80,20);
f1.add(no);

lm=new Label("RESULTS");
    lm.setBounds(170,30,100,20);
    f2.add(lm);
    
    la=new Label("Name");
    la.setBounds(20,70,200,20);
    f2.add(la);
    lb=new Label("Age");
    lb.setBounds(20,100,200,20);
    f2.add(lb);
    lc=new Label("Chest Pain");
    lc.setBounds(20,130,200,20);
    f2.add(lc);
    ld=new Label("Race");
    ld.setBounds(20,160,200,20);
    f2.add(ld);
    le=new Label("Country");
    le.setBounds(20,190,200,20);
    f2.add(le);
    lf=new Label("Rest BloodPressure MM/HG");
    lf.setBounds(20,220,200,20);
    f2.add(lf);
    lg=new Label("Maximum Heart Rate");
    lg.setBounds(20,250,200,20);
    f2.add(lg);
    lh=new Label("Systolic Blood Pressure");
    lh.setBounds(20,280,200,20);
    f2.add(lh);
    li=new Label("Diagonostic blood pressure");
    li.setBounds(20,310,200,20);
    f2.add(li);
    lj=new Label("Blood pressure");
    lj.setBounds(20,340,200,20);
    f2.add(lj);
    lk=new Label("Rest Electrolytes");
    lk.setBounds(20,370,200,20);
    f2.add(lk);
    ll=new Label("Exercise Anginal");
    ll.setBounds(20,400,200,20);
    f2.add(ll);
    lZ=new Label("YOUR RESULTS");
    lZ.setBounds(120,440,100,20);
    f2.add(lZ);

    ln=new Label("");
    ln.setBackground(Color.yellow);
    ln.setFont(new Font("Courier", Font.BOLD,12));
    ln.setBounds(240,440,100,20);
    f2.add(ln);
    lo=new Label("");
    lo.setBounds(240,70,200,20);
    f2.add(lo);
    lp=new Label("");
    lp.setBounds(240,100,200,20);
    f2.add(lp);
    lq=new Label("");
    lq.setBounds(240,160,200,20);
    f2.add(lq);
    lr=new Label("");
    lr.setBounds(240,400,200,20);
    f2.add(lr);
    ls=new Label("");
    ls.setBounds(240,340,200,20);
    f2.add(ls);
    lt=new Label("");
    lt.setBounds(240,280,200,20);
    f2.add(lt);
    lu=new Label("");
    lu.setBounds(240,310,200,20);
    f2.add(lu);
    lv=new Label("");
    lv.setBounds(240,130,200,20);
    f2.add(lv);
    lw=new Label("");
    lw.setBounds(240,190,200,20);
    f2.add(lw);
    lx=new Label("");
    lx.setBounds(240,250,200,20);
    f2.add(lx);
    ly=new Label(Integer.toString(bp));
    ly.setBounds(240,220,200,20);
    f2.add(ly);
    lz=new Label(rbp);
    lz.setBounds(240,370,200,20);
    f2.add(lz);

b1=new Button("click");
b1.setBounds(270,430,80,20);
b1.addActionListener(this);
f1.add(b1); 
}  
  
public void actionPerformed(ActionEvent ae)
{
   
      if (normal.getState() == true) 
          rbp="Normal";
          else if(leftvent.getState()== true)
                  rbp="Life Vent";
                  else if(st_t_vent.getState()== true)
                      rbp="St_t_vent";
      
      if(yes.getState()==true)
          exer="Yes";
      else if(no.getState()== true)
          exer="No";
      
      if(a.getState()== true)
          Cpain="Asympt";
      else if(b.getState()== true)
          Cpain="Atyp_anginal";
      else if(c.getState() == true)
          Cpain="Non-anginal";
      else if(d.getState()== true)
          Cpain="typ-anginal";
      
      if(f.getState()== true)
          bpr="F";
      else if(t.getState() == true)
          bpr="T";
      
      
   

     age=Integer.parseInt(t2.getText());
     bp=Integer.parseInt(t5.getText());
     mhr=Integer.parseInt(t6.getText());
     name=t1.getText();
    
    race=t3.getText();
     count=t4.getText();
     systo=t7.getText();
     diago=t8.getText();
    
    
    if(ae.getSource()==b1)
    {
            if(exer=="yes")
            {
                if(Cpain=="Asympt")
                    result="positive";
                else if(Cpain=="Atyp_anginal")
                {
                     if(rbp=="Normal")
                     {
                         if(bp <=145)
                             result="negative";
                         else 
                             result="positive";
                     }
                     else if(rbp=="LeftVent")
                         result="positive";
                     else 
                         result="positive";
                }
                else if(Cpain=="Non-anginal")
                {
                    if(age<=55)
                        result="positive";
                    else
                        result="negative";
                }
                else
                    result="positive";
                    
            }
            else
            {
                if(Cpain=="Asympt")
                {
                    if(mhr<=126)
                    {
                        if(mhr<=102)
                            result="negative";
                        else
                            result="positive";
                    }
                    else
                        result="negative";
                }
                else if(Cpain=="Atyp_anginal")
                    result="negative";
                else if(Cpain=="Non-anginal")
                    result="negative";
                else
                {
                    if(bp<=130)
                        result="negative";
                    else
                        result="positive";
                }
            }
    }
    lo.setText(name);
    lp.setText(Integer.toString(age));
    lq.setText(race);
    lr.setText(exer);
    ls.setText(bpr);
    lt.setText(systo);
    lu.setText(diago);
    lv.setText(Cpain);
    lw.setText(count);
    lx.setText(Integer.toString(mhr));
    ly.setText(Integer.toString(bp));
    lz.setText(rbp);
    ln.setText(result);
    
f1.setVisible(false); 
f2.setVisible(true);
}  
  
public static void main(String args[]){  
new Decision_Tree();  
}  
}  