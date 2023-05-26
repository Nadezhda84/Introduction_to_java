package Homework6;

import java.util.HashSet;
import java.util.Set;

public class ProductRegistry {

    private PropertyInitializer ptInitializer;

    ProductRegistry(PropertyInitializer ptInitializer) {
        this.ptInitializer = ptInitializer;
    }

    public Set<Notebook> BuildNonebooks() {
        Set<Notebook> notebooks = new HashSet<>();

        Notebook notebook = new Notebook();
        notebook.AddProperty(BuildStringProperty(PropertyEnum.Brand, "Dell"));
        notebook.AddProperty(BuildStringProperty(PropertyEnum.OS, "Linux"));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.Price, 120000.0));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.Diagonal, 17.0));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.HardDiskCapacity, 320.0));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.RAM, 16.0));
        notebooks.add(notebook);
        notebook = new Notebook();
        notebook.AddProperty(BuildStringProperty(PropertyEnum.Brand, "Lenovo"));
        notebook.AddProperty(BuildStringProperty(PropertyEnum.OS, "Linux"));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.Price, 30000.0));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.Diagonal, 16.0));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.HardDiskCapacity, 320.0));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.RAM, 16.0));
        notebooks.add(notebook);
        notebook = new Notebook();
        notebook.AddProperty(BuildStringProperty(PropertyEnum.Brand, "HP"));
        notebook.AddProperty(BuildStringProperty(PropertyEnum.OS, "Windows7"));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.Price, 30000.0));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.Diagonal, 8.0));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.HardDiskCapacity, 320.0));
        notebook.AddProperty(BuildNumProperty(PropertyEnum.RAM, 32.0));
        notebooks.add(notebook);

        return notebooks;
    }

    private BaseProperty BuildStringProperty(PropertyEnum type, String value) {
        return new StringProperty(ptInitializer.properties.get(type), type, value);
    }

    private BaseProperty BuildNumProperty(PropertyEnum type, Double value) {
        return new NumProperty(ptInitializer.properties.get(type), type, value);
    }
}
