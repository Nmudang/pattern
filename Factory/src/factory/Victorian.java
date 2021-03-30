    package factory;
public class Victorian implements FactoryFurniture {
	public Chair createChair(){
		return new VictorianChair();
	}
	public Table createTable(){
		return new VictorianTable();
	}
}