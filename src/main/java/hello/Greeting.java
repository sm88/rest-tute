package hello;

/*
 * This is model
 */
public class Greeting{
	private final long id;
	private final String content;

	public Greeting(long aId, String aContent){
		id = aId;
		content = aContent;
	}

	public long getId(){
		return id;
	}

	public String getContent(){
		return content;		
	}
}