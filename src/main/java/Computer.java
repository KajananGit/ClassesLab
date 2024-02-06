public class Computer {

    private int storage;
    private String printer;
    private boolean isConnected;

    public Computer(int storage){
        this.storage = storage;
        this.isConnected = false;
    }

    public int getStorage(){
        return this.storage;
    }

    public String getPrinter() {
        return printer;
    }

    public void setPrinter(String printer) {
        this.isConnected = true;
        this.printer = printer;
    }
    public void addStorage(int xStorage){
        this.storage += xStorage;
    }
}
