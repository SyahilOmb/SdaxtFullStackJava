import java.awt.*;
class Prog74 extends Frame{
First(){
Button b=new Button("click me");
b.setBounds(30,100,80,30);// setting button position
add(b);//adding button into frame
setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String args[]){
First f=new First();
}}
