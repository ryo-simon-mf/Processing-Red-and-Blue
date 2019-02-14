class b_colorbox extends colorbox implements boxes{//colorboxのサブクラス(colorboxクラスの継承)
  b_colorbox(float x,float y,float z){
    super(x,y,z);
  }
  
  void display(){
  makebox((int)this.x,(int)this.y,(int)this.z);
  }
  
  void makebox(int x, int y,int z){
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
