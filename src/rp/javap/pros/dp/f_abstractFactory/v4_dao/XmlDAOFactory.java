package rp.javap.pros.dp.f_abstractFactory.v4_dao;

public class XmlDAOFactory extends DAOFactory {

	@Override
	public OrderDetailDAO createOrderDetailDAO() {
		return new XmlDetailDAOImpl();
	}

	@Override
	public OrderMainDAO createOrderMainDAO() {
		return new XmlMainDAOImpl();
	}

}
