package day49_inheritance_day2;

public class PaperBack extends Book {
private int pages;

public String toString() {
	//author title , price, type,pages
return getAutor()+ " | " + getAutor()+ " | "+ getPrice()+" | "+getType()+" | "+ pages;
}

public int getPages() {
	return pages;
}

public void setPages(int pages) {
	this.pages = pages;
}

}
