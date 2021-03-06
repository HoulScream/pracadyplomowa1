package tableview;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ReturnTableView {
    private IntegerProperty item_id;
    private StringProperty name;
    private StringProperty date;
    private IntegerProperty count;

    public ReturnTableView(int item_id, String name, String date, int count) {
        this.item_id = new SimpleIntegerProperty(item_id);
        this.name = new SimpleStringProperty(name);
        this.date = new SimpleStringProperty(date);
        this.count = new SimpleIntegerProperty(count);
    }

    public int getItem_id() {
        return item_id.get();
    }

    public IntegerProperty item_idProperty() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id.set(item_id);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public String getDate() {
        return date.get();
    }

    public StringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public int getCount() {
        return count.get();
    }

    public IntegerProperty countProperty() {
        return count;
    }

    public void setCount(int count) {
        this.count.set(count);
    }
}
