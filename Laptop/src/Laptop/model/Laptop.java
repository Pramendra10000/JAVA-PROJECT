package Laptop.model;

public class Laptop {

	
	private int id;
	private String name;
	private String Model;
	private String Ram;
	private long price;
	
	 public Laptop() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	 
	public Laptop(int id, String name, String model, String ram, long price) {
		super();
		this.id = id;
		this.name = name;
		Model = model;
		Ram = ram;
		this.price = price;
	}




	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}




	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", Model=" + Model + ", Ram=" + Ram + ", price=" + price + "]";
	}
	
	

	
	

}

