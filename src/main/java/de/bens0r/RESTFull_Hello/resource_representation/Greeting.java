package de.bens0r.RESTFull_Hello.resource_representation;

public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content)
	{
		this.id = id;
		this.content = content;
	}

	public long getId()
	{
		return id;
	}

	public String getContent()
	{
		return content;
	}
}
