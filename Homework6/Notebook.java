package Homework6;

//import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {
    Map<PropertyEnum, BaseProperty> properties = new HashMap<>();

    public Notebook() {

    }

    public void AddProperty(BaseProperty property) {
        properties.put(property.type, property);
    }

    @Override
    public String toString() {

        List<String> props = new ArrayList<>();
        for (BaseProperty property : this.properties.values()) {
            props.add(property.toString());
        }
        return String.format("Ноутбук: (%s)", String.join("; ", props));
    }

}
