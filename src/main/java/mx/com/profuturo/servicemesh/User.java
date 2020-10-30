package mx.com.profuturo.servicemesh;

public class User {

	private String id;
	private String name;
	private Category category;
	private String photoUrls;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(String photoUrls) {
		this.photoUrls = photoUrls;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
