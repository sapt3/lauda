package com.foodgotech.manager.foodgomanager;

/**
 * Created by rahul on 27/03/18.
 */

public class SingleVertical {

    private String header;
    private int image;

    public SingleVertical( ) {

    }

    public SingleVertical(String header, String subHeader, int image) {
        this.header = header;

        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public int getImage() {
        return image;
    }
    
    public void setImage(int image) {
        this.image = image;
    }
}
