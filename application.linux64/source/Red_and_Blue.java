import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Red_and_Blue extends PApplet {

int num = 100; 
r_colorbox[] cbsr = new r_colorbox[num];//r_colorboxクラスのインスタンス宣言
b_colorbox[] cbsb = new b_colorbox[num];//b_colorboxクラスのインスタンス宣言
//____________________________________________________________
//boxes[] cbox;//boxesクラスの配列cboxを宣言
//____________________________________________________________

public void setup(){  
  //fullScreen(P3D);
  
  //____________________________________________________________
  //cbox = new boxes[2];
  //for(int i =0;i<cbox.length;i++){
  //cbox[0] = new  r_colorbox(width/2,7*height/8,-100*i);//配列にr_colorboxクラスを入力
  //cbox[1] =new b_colorbox(width/2,height/8,-100*i);//配列にb_colorboxクラスを入力
  //____________________________________________________________
  for(int i =0;i<cbsr.length;i++){
    cbsr[i]=new r_colorbox(width/2,7*height/8,-100*i);
    cbsb[i]=new b_colorbox(width/2,height/8,-100*i);
  //____________________________________________________________
  }
}

public void draw(){
  noStroke();
  background(0);
  smooth();
  //____________________________________________________________
  for(int i =0;i<cbsr.length;i++){
    cbsr[i].display();
    cbsb[i].display();
  }
  //____________________________________________________________
  //for(boxes a:cbox){//boxes配列を1つずつaへ入力しdisplayする
  //a.display();
  //}
  //____________________________________________________________
}
class b_colorbox extends colorbox implements boxes{//colorboxのサブクラス(colorboxクラスの継承)
  b_colorbox(float x,float y,float z){
    super(x,y,z);
  }
  
  public void display(){
  makebox((int)this.x,(int)this.y,(int)this.z);
  }
  
  public void makebox(int x, int y,int z){
    for(int i=0;i<50;i++){
      pushMatrix();
      translate(random(-880,880),random(_range,range),random(_range,range));//ボックスの範囲指定(x,y,z)
      fill(random(0),random(0),random(255));
      translate(x,y,z);
      box(50);
      popMatrix();
    }
  }
}
interface boxes{
  public void display();
  //インターフェースを定義
}
class colorbox{//スーパークラス
  float x,y,z;
  int range =120;
  int _range=-120;
  colorbox(float x,float y,float z){
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
}
class r_colorbox extends colorbox implements boxes{//colorboxのサブクラス(colorboxクラスの継承)
  
    r_colorbox(float x,float y,float z){
    super(x,y,z);
  }
  
  public void display(){
  makebox((int)this.x,(int)this.y,(int)this.z);
  }
  
  public void makebox(int x, int y,int z){
    for(int i=0;i<50;i++){
      pushMatrix();
      translate(random(-880,880),random(_range,range),random(_range,range));//ボックスの範囲指定(x,y,z)
      fill(random(255),random(0),random(0));//色指定
      translate(x,y,z);
      box(50);
      popMatrix();
    }
  }
}
  public void settings() {  size(1000,1000,P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Red_and_Blue" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
