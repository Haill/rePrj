package rp.javap.pros.dp.d_singleton;
/**
 * 但元素的枚举类型已经成为实现Singleton的最佳方法。
 * 为了理解这个观点，先了解一点相关的枚举知识，这里只是强化和总结一下枚举的一些重要观点。
 * 
 * 		Java的枚举类型实质上是功能齐全的类，因此可以有自己的属性和方法。
 * 		Java枚举类型的基本思想是通过公有的静态final域为每个枚举常量导出实例的类。
 * 		从某个角度讲，枚举是单例的泛型化，本质上是单元素的枚举。
 * <p>date : Oct 25, 2013 1:37:10 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 * 用枚举来实现单例非常简单，只需要编写一个包含单个元素的枚举类型即可。
 * 
 */
public enum Singleton_enum {

	/**
	 * 定义一个枚举的元素，它就代表Singleton的一个实例
	 */
	uniqueInstance;
	
	/**
	 * 示意方法，单例可以有自己的操作
	 * @author ZhengDongHai
	 */
	public void singletonOperation(){
		// 功能处理
	}
	
}
