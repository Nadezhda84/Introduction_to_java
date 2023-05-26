package Homework6;

public class PropertyVisitor {
    private Object value;
    boolean result;

    PropertyVisitor(Object value) {
        this.value = value;
    }

    public void visit(StringProperty property) {
        result = property.value.equals(this.value);
    }

    public void visit(NumProperty property) {

        result = property.value >= (Double) this.value;
    }
}
