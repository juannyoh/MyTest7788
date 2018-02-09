package aaa;

public class ExtendColumn extends ExtendColumnMetadata {

    private static final long serialVersionUID = 1L;

    private Object fieldValue;

    public Object getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(Object fieldValue) {
        this.fieldValue = fieldValue;
    }

    @Override
    public String toString() {
        return "ExtendColumn{" + "fieldValue=" + fieldValue + ",fieldName=" + super.getFieldName() + '}';
    }
}
