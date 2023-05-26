package Homework6;

public class NumProperty extends BaseProperty {
    Double value;

    NumProperty(String name, PropertyEnum type, Double value) {
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
