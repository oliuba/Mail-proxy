package images;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String filename) {
        this.fileName = filename;
    }

    @Override
    public void display() {
        loadFromDisk();
        System.out.println("Here is the picture: " + fileName);
    }

    public void loadFromDisk() {
        System.out.println(fileName + " loaded from the disk!");
    }
}
