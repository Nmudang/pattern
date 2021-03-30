package factory;
public class Modern implements FactoryFurniture {
	public Chair createChair(){
		return new ModernChair();
	}
	public Table createTable(){
		return new ModernTable();
	}
}