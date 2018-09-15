package www.com.test.server.bean;

public class Bean {
	
	private String name ;
	
	private String length ;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLength() {
		return length;
	}


	public void setLength(String length) {
		this.length = length;
	}


	public Bean(String name, String length) {
		super();
		this.name = name;
		this.length = length;
	}
	
	
}
