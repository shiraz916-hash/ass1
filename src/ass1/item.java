//Shiraz Turgeman 208250662 and Tehila Dahan 212633507
package ass1;

public class Item {
	private String name; 
	private int value; 
	private boolean isMagical; 
	
	public Item() {
		this.name="Unknown"; 
		this.value=0; 
		this.isMagical=false; 
	}
	public Item( String name, int value, boolean isMagical) {
		this.name=name; 
		if(value<0) {
			this.value=0; 
		}else {
			this.value=value; 
		}
		this.isMagical= isMagical; 
	}
	public String getName() {
		return this.name; 
	}
	public int getValue() {
		return this.value; 
	}
	public void setValue(int value) {
		if (value < 0) {
            this.value = 0;
        } else {
            this.value=value; 
        }
	}
	public boolean isMagical() {
		return this.isMagical; 
	}
	@Override
	public String toString() {
	    return "Name: " + name + "\nValue: " + value + (isMagical ? "\nMagical item" : "");
	}
}