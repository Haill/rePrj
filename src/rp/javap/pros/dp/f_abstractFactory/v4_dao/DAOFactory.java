package rp.javap.pros.dp.f_abstractFactory.v4_dao;
/**
 * 抽象工厂，创建订单主、子记录对应的DAO对象
 * <p>date : Nov 19, 2013 7:43:53 PM </p>
 * @author ZhengDongHai
 * @version 1.0
 */
public abstract class DAOFactory {

	
	/**
	 * 创建订单主记录对应的DAO对象
	 * @author ZhengDongHai
	 * @return	订单主记录对应的DAO对象
	 */
	public abstract OrderMainDAO createOrderMainDAO();
	
	/**
	 * 创建订单子记录对应的DAO对象
	 * @author ZhengDongHai
	 * @return	订单子记录对象的DAO对象
	 */
	public abstract OrderDetailDAO createOrderDetailDAO();
	
}
