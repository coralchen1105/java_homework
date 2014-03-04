
public abstract class Animal {
	
	private int size;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(int s){
		this.size = s;
	}
	public int getSize(){
		return size;
	}
	
	public abstract void eat();
	public abstract void makeNoise();
	
}
