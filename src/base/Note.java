package base;

import java.util.Date ;
import java.util.Objects;

public class Note implements Comparable<Note>{

	private Date date ;
	private String title ;
	
	public Note(String title) {
		this.title = title ;
		this.date = new Date(System.currentTimeMillis()) ;
	}
	
	public String getTitle() {
		return title ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date a = new Date(2000,01,30) ;
		Date b = new Date(1999,03,05) ;
		System.out.println(a.toString()) ;
		System.out.println(b.toString()) ;
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Note))
			return false;
		
		Note other = (Note) obj;
		return Objects.equals(title, other.title);
	}

	@Override
	public int compareTo(Note o) {
		return this.date.compareTo(o.date);
	}

	@Override
	public String toString() {
		return date.toString() + "\t" + title;
	}
	
	
}