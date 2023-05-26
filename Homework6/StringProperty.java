package Homework6;

public class StringProperty extends BaseProperty {
    String value;

    StringProperty(String name, PropertyEnum type, String value) {
        super(name, type);
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s:%s", name, value);
    }

    @Override
    public void Accept(PropertyVisitor visitor) {
        visitor.visit(this);
    }
}
