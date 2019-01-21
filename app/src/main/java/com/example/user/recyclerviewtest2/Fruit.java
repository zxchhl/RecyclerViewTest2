package com.example.user.recyclerviewtest2;

public class Fruit {
    private String name;
    private String introduce;
    private String time;
    private int imageId;
    public Fruit(String name,String introduce,String time,int imageId){
        this.name=name;
        this.imageId=imageId;
        this.introduce=introduce;
        this.time=time;

    }
    public String getName(){
        return name;
    }
    public String getIntroduce(){
        return introduce;
    }
    public String getTime(){
        return time;
    }
    public int getImageId(){
        return imageId;
    }
}
