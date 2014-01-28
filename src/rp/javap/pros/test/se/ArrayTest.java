package rp.javap.pros.test.se;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 测试 System.out.println(array.toString())
 * <p>date : Oct 30, 2013 10:23:22 AM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class ArrayTest {

	public static final String TC_ACCOUNT_PREFIX = "0102000";	
	
	public static void main(String[] args) {
//		String [] array = {"1","2","3","4","5"};
//		
//		System.out.println(array);
//		for(String temp: array){
//			System.out.print(temp+",");
//		}
//		System.out.println(array.toString());
		
//		String tt = "2014-01-20 15:07:29";
//		
//		SimpleDateFormat dataFormat =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		try {
////			System.out.println(dataFormat.parse(tt));
////			String uu = dataFormat.parse(tt);
//			//Date dDate = new Date(dataFormat.format(tt));
//			//System.out.println(dDate);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//Date dDate = new Date(dataFormat.format(tt));
//		//System.out.println(dDate);
		
		String temp = getUserCode("0102000se_zdh");
		System.out.println(temp);
	}
	
	/**
	 * 
	 * getUserCode (TODO这里用一句话描述这个类的作用) 
	 * @author ZhengDongHai
	 * @param userCode
	 * @return
	 */
	public static String getUserCode(String userCode){
		String pureUserCode = "";
		if( userCode != null && userCode.startsWith( TC_ACCOUNT_PREFIX ) ){
			pureUserCode = userCode.substring( TC_ACCOUNT_PREFIX.length() , userCode.length());
		}
		return pureUserCode;
	}
	
}
