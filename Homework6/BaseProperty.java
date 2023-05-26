package Homework6;

public abstract class BaseProperty {
    PropertyEnum type;
    String name;

    BaseProperty(String name, PropertyEnum type) {
        this.type = type;
        this.name = name;
    }

    public abstract void Accept(PropertyVisitor visiter);
}
