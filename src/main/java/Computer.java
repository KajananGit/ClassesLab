public class Computer {

    private int storage;
    private String printer;
    private boolean isConncected;

    public Computer(int storage){
        this.storage = storage;
        this.isConncected = false;
    }

    public int getStorage(){
        return this.storage;
    }

    public void addStorage(int xStorage){
        this.storage += xStorage;
    }
}
