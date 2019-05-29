package day49_inheritance_day2;

public class EBook extends Book{
    private double size;
    private int pages;
    
    public void readEbook(int pageNum) {
    	//Reading java book by Savitch at page 10
    	System.out.println("Reading "+getTitle()+" by "
    	                  +getAutor()+" at page "+pageNum);
    }
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
}
