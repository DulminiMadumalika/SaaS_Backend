package com.uom.saas.entiry;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("providers")
public class Provider {
	
	@Id
	private ObjectId id;
	private String hospital;
	private String address;
	private String contact;
	private String other;
	
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Provider(ObjectId id, String hospital, String address, String contact, String other) {
		super();
		this.id = id;
		this.hospital = hospital;
		this.address = address;
		this.contact = contact;
		this.other = other;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}
	
}

