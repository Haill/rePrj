package rp.javap.pros.dp.f_abstractFactory.v1;
/**
 * 创建主板的简单工厂
 * <p>date : Nov 5, 2013 3:36:44 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class MainboardFactory {
	
	/**
	 * 创建主板接口对象的方法
	 * @author ZhengDongHai
	 * @param type	选择主板类型的参数
	 * @return		主板接口对象的方法
	 */
	public static MainboardApi createMainboardApi(int type){
		MainboardApi mainboard = null;
		if(type == 1){
			mainboard = new GAMainboard(1156);
		}else if(type == 2){
			mainboard = new MSIMainboard(939); 
		}
		return mainboard;
	}
}
