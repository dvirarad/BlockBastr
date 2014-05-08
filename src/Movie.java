
public  abstract class Movie {

	private String name;
	private int id;
	
	/**
	 * Constractors
	 */
	public Movie() {
		
		this.name = "";
		this.id = 0;
	}
		
	public Movie(String name, int id) {
	
		this.name = name;
		this.id = id;
	}
	public Movie(Movie m) {
		
		this.name = m.name;
		this.id = m.id;
	}
	
	@Override
	public String toString() {
		return "Movie [name=" + name + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
