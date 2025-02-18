public class Book extends TangibleAsset{
	private String isbn;
	public Book(Stirng name,int price,Sting color,String isbn){
		super(name,price,color);
		this.isbn=isbn;
	}
	public String getIsbn(){return this.isbn;}
}


