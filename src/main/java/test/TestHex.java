package test;

public class TestHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int code=2;
//		System.out.println(Integer.toHexString(code));
		
		System.out.println(Long.parseLong("003", 16));
//		
//		String xx="aabbcc";
//		System.out.println(xx.split("_")[0]);
//		System.out.println(xx.substring(0, xx.indexOf("_")));
		
//		System.out.println(getFixCode("hhhjjj"));
	}

	
	
	/**
	 * 补全位数
	 * @param code
	 * @return
	 * @see
	 */
	private static String getFixCode(String code){
		if(code.length()==5){
			return code;
		}
		StringBuilder fixSb=new StringBuilder();
		int tempLen=5-code.length();
		for(int i=0;i<tempLen;i++){
			fixSb.append("0");
		}
		fixSb.append(code);
		return fixSb.toString();
	}
}
