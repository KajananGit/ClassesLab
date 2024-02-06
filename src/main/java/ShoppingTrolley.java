import java.util.ArrayList;

public class ShoppingTrolley {

    private ArrayList<String> chart;
    public ShoppingTrolley(){
        chart = new ArrayList<>();
    }

    public void addItem(String newItem){
        chart.add(newItem);
    }

    public ArrayList<String> getTrolley() {
        return chart;
    }
}
