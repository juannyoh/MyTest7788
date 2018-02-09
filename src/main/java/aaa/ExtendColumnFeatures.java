package aaa;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;




/**
 * 内容属性
 *
 *
 */
public class ExtendColumnFeatures extends ExtendColumn {

    private static final long serialVersionUID = 1L;

    /**
	 * 页面是否展示
	 */
	private Boolean isDisplay=true;
	
	
	

    public Boolean getIsDisplay() {
		return isDisplay;
	}



	public void setIsDisplay(Boolean isDisplay) {
		this.isDisplay = isDisplay;
	}
	
	
	public static void main(String[] args) {
		ExtendColumn col=new ExtendColumnFeatures();
		
		col.setFieldValue("111");
		
		ExtendColumnFeatures colF=new ExtendColumnFeatures();
		try {
			BeanUtils.copyProperties(colF, col);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(colF.getFieldValue());
	}
		

    
}
