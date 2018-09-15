package www.com.test.server.bean;

public class Bean {
	
	private String name ;
	
	private String length ;
	
	private int age ;
	
	
	
	
	public Bean() {}


	public Bean(String name, String length, int age) {
		this.name = name;
		this.length = length;
		this.age = age;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


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

	
}
