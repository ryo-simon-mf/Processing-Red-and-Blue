int num = 100; 
r_colorbox[] cbsr = new r_colorbox[num];//r_colorboxクラスのインスタンス宣言
b_colorbox[] cbsb = new b_colorbox[num];//b_colorboxクラスのインスタンス宣言
//____________________________________________________________
//boxes[] cbox;//boxesクラスの配列cboxを宣言
//____________________________________________________________

void setup(){  
  //fullScreen(P3D);
  size(1000,1000,P3D);
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

void draw(){
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
