package images;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("image.jpeg");
        image.display();
    }
}
