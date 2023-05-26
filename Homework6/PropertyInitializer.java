package Homework6;

import java.util.EnumMap;
import java.util.Hashtable;
import java.util.Map;

public class PropertyInitializer {

    Map<PropertyEnum, String> properties = new Hashtable<>();
    Map<PropertyEnum, TypeValue> propertyTypes = new Hashtable<>();

    public void Init() {

        this.properties = new EnumMap<>(PropertyEnum.class);
        this.properties.put(PropertyEnum.Brand, "Марка");
        this.properties.put(PropertyEnum.OS, "Операционная система");
        this.properties.put(PropertyEnum.HardDiskCapacity, "Объем жесткого диска");
        this.properties.put(PropertyEnum.RAM, "Объем оперативной памяти");
        this.properties.put(PropertyEnum.Diagonal, "Диагональ");
        this.properties.put(PropertyEnum.Price, "Цена");

        this.propertyTypes = new Hashtable<>();
        this.propertyTypes.put(PropertyEnum.Brand, TypeValue.String);
        this.propertyTypes.put(PropertyEnum.OS, TypeValue.String);
        this.propertyTypes.put(PropertyEnum.HardDiskCapacity, TypeValue.Double);
        this.propertyTypes.put(PropertyEnum.RAM, TypeValue.Double);
        this.propertyTypes.put(PropertyEnum.Diagonal, TypeValue.Double);
        this.propertyTypes.put(PropertyEnum.Price, TypeValue.Double);
    }
}
