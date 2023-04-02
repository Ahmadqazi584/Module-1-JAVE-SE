package com.company;

 class NameRun {
    private String name;
    private String cast;
    public String getname(){
        return name;
    }
    public String getcast(){
        return cast;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setCast(String cast) {
        this.cast =  cast;
    }
}
public class Name{
   public  static void main(String[] args){
       NameRun mychildname = new NameRun();
       mychildname.setName("hamza");
       mychildname.setCast("Rajput");
       System.out.println(mychildname.getname() + " "+mychildname.getcast());
   }
}
