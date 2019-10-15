package Collections;

public class ComparableSort implements Comparable<ComparableSort> {
	String title;
	String genre;
	String actor;
	
	ComparableSort(String t, String g, String a)
	{
		 	title=t; 	genre=g; actor=a;
	}
	
	

	@Override
	public String toString() {
		return "ComparableSort [title=" + title + ", genre=" + genre + ", actor=" + actor + "]";
	}
	
	



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public String getActor() {
		return actor;
	}



	public void setActor(String actor) {
		this.actor = actor;
	}



	@Override
	public int compareTo(ComparableSort o) {
		// TODO Auto-generated method stub
		
		return title.compareTo(o.getTitle());
	}

}
