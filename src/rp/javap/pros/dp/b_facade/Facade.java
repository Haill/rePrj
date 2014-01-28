package rp.javap.pros.dp.b_facade;
/**
 * 代码生成子系统的外观对象
 * <p>date : Sep 5, 2013 2:45:17 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public class Facade {

//	public void generate(){
//		new Presentation().generate();
//		new Business().generate();
//		new DAO().generate();
//	}
	
	private Facade(){}
	
	public static void test(){
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}
}
