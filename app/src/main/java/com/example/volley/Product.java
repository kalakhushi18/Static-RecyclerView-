package com.example.volley;

public class Product {


  private String title,desc ;
  private int image ;

    public Product(int image ,String title, String desc) {
      this.image=image ;
        this.title = title;
        this.desc = desc;


    }
public int getImage(){
        return image;
}


    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
