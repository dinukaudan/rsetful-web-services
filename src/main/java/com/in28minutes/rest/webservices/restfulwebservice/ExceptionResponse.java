package com.in28minutes.rest.webservices.restfulwebservice;

import java.util.Date;

public class ExceptionResponse {

private Date timeStamp;
private String messege;
private String details;
public ExceptionResponse(Date timeStamp, String messege, String details) {
	super();
	this.timeStamp = timeStamp;
	this.messege = messege;
	this.details = details;
}
public Date getTimeStamp() {
	return timeStamp;
}
public void setTimeStamp(Date timeStamp) {
	this.timeStamp = timeStamp;
}
public String getMessege() {
	return messege;
}
public void setMessege(String messege) {
	this.messege = messege;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}


}
