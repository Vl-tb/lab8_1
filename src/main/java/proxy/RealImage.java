package proxy;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RealImage implements Image{
    private String fileName;

    public RealImage(){}

    public void display(){
        System.out.println("Call display");
    }

    protected void loadFromDisc(){
        System.out.println("Call loadFromDisc");
    }
}
