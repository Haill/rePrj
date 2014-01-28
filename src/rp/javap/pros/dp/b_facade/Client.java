package rp.javap.pros.dp.b_facade;

public class Client {

//	public static void main(String[] args) {
//		// 现在没有配置文件，直接使用默认的配置，通常情况下，三层都应该生成
//		// 也就是说客户端必须对这些模块都有了解，才能够正确使用它们
//		new Presentation().generate();
//		new Business().generate();
//		new DAO().generate();
//	}
	/**
	 * 那么如何实现，才能让子系统外部的客户端在使用子系统的时候，即能够简单地使用
	 * 这些子系统内部的模块功能，而又不用客户端去与子系统内部的多个模块交换呢？
	 * 
	 * 使用外观模式来解决问题
	 * 
	 */
	
	public static void main(String[] args) {
		// 使用Facade
//		new Facade().generate();
		Facade.test();
	}
	/**
	 * Facade类其实相当于A，B，C模块的外观界面，Facade类也被称为A，B，C 模块对外的接口，有了这个Facade类，
	 * 那么客户端就不需要知道系统内部的实现细节，甚至客户端都不需要知道A ,B, C 模块的存在，客户端是需要跟Facade类交互就好了。
	 * 从而更好滴实现了客户端和子系统中A，B，C模块的解耦，让客户端更容易地使用系统。
	 */
	
}
