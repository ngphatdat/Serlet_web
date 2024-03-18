package com.model;

public class NewsModel extends AbstractModel  {
private String title;
private String thumnail;
private String shortdescription;
private String content;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getThumnail() {
	return thumnail;
}
public void setThumnail(String thumnail) {
	this.thumnail = thumnail;
}
public String getShortdescription() {
	return shortdescription;
}
public void setShortdescription(String shortdescription) {
	this.shortdescription = shortdescription;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}

}