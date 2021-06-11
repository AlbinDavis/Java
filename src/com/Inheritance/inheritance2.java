package com.Inheritance;
class Area{
    int length,width;
    public void setLength(int length){
        this.length=length;

    }
    public void setWidth(int width){
        this.width =width;

    }
    void showArea(){
        System.out.println("length="+length);
        System.out.println("width ="+width);
    }
}
class Volume extends Area{
    int height;
    public void setHeight(int height){
        this.height=height;
    }
    void showvolume(){
        System.out.println("Area="+length*width);
        System.out.println("Height="+height);
        System.out.println("Volume="+length*width*height);
    }

}

public class inheritance2 {
    public static void main(String[] args) {
        Volume volume=new Volume();
        volume.setHeight(10);
        volume.setLength(12);
        volume.setWidth(8);
        volume.showvolume();
        volume.showArea();

    }

}
