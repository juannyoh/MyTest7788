package aaa;


import java.util.List;

public class ExtendColumnMetadata implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private String fieldName;
    private List<String> options;
    private Integer order;
    private boolean isUnique;


    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        if (null != order) {
            this.order = order;
        }
    }

    public boolean isUnique() {
        return isUnique;
    }

    public void setUnique(boolean isUnique) {
        this.isUnique = isUnique;
    }

}
