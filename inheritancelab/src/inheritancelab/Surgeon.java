package inheritancelab;

public class Surgeon extends Doctor{
	private boolean operating;
	public Surgeon(String name, int number) {
		super(name,number);
		this.speciality="Brain";
		this.operating=true;
	}
	public boolean getOperating() {
		return operating;
	}
	public void setOperating(boolean operating) {
		this.operating = operating;
	}
	public String toString(){  
		  return name+" "+number+" "+"Operating:"+operating+" "; 
	}
	@Override
	public void work()
	{
	System.out.println (name + " works for the hospital. "+name+" is operating now.");
	}
}
