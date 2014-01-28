package rp.javap.pros.dp.f_abstractFactory.v4_dao;

public class RdbDAOFactory extends DAOFactory {

	@Override
	public OrderDetailDAO createOrderDetailDAO() {
		return new RdbDetailDAOImpl();
	}

	@Override
	public OrderMainDAO createOrderMainDAO() {
		return new RdbMainDAOImpl();
	}

}
