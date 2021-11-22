package proxy;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class ProxyImage implements Image{
    private RealImage image;
    private String fileName;

    public ProxyImage(){}

    public void display(){
        this.image = new RealImage();
        this.fileName = image.getFileName();
        image.display();
    }
}
