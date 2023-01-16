package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Covid {
	
	@Id
	@GeneratedValue
	private int id;
	private String area;
	private String areaid;
	private String dailydose1;
	private String dailydose2;
	private String daydiff;
	private String daytotal;
	private String referencedate;
	private String totaldistinctpersons;
	private String totaldose1;
	private String totaldose2;
	private String totalvaccinations;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getAreaid() {
		return areaid;
	}
	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}
	public String getDailydose1() {
		return dailydose1;
	}
	public void setDailydose1(String dailydose1) {
		this.dailydose1 = dailydose1;
	}
	public String getDailydose2() {
		return dailydose2;
	}
	public void setDailydose2(String dailydose2) {
		this.dailydose2 = dailydose2;
	}
	public String getDaydiff() {
		return daydiff;
	}
	public void setDaydiff(String daydiff) {
		this.daydiff = daydiff;
	}
	public String getDaytotal() {
		return daytotal;
	}
	public void setDaytotal(String daytotal) {
		this.daytotal = daytotal;
	}
	public String getReferencedate() {
		return referencedate;
	}
	public void setReferencedate(String referencedate) {
		this.referencedate = referencedate;
	}
	public String getTotaldistinctpersons() {
		return totaldistinctpersons;
	}
	public void setTotaldistinctpersons(String totaldistinctpersons) {
		this.totaldistinctpersons = totaldistinctpersons;
	}
	public String getTotaldose1() {
		return totaldose1;
	}
	public void setTotaldose1(String totaldose1) {
		this.totaldose1 = totaldose1;
	}
	public String getTotaldose2() {
		return totaldose2;
	}
	public void setTotaldose2(String totaldose2) {
		this.totaldose2 = totaldose2;
	}
	public String getTotalvaccinations() {
		return totalvaccinations;
	}
	public void setTotalvaccinations(String totalvaccinations) {
		this.totalvaccinations = totalvaccinations;
	}
	
	
	public Covid(int id, String area, String areaid, String dailydose1, String dailydose2, String daydiff,
			String daytotal, String referencedate, String totaldistinctpersons, String totaldose1, String totaldose2,
			String totalvaccinations) {
		super();
		this.id = id;
		this.area = area;
		this.areaid = areaid;
		this.dailydose1 = dailydose1;
		this.dailydose2 = dailydose2;
		this.daydiff = daydiff;
		this.daytotal = daytotal;
		this.referencedate = referencedate;
		this.totaldistinctpersons = totaldistinctpersons;
		this.totaldose1 = totaldose1;
		this.totaldose2 = totaldose2;
		this.totalvaccinations = totalvaccinations;
	}
	
	
	public Covid() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Covid [id=" + id + ", area=" + area + ", areaid=" + areaid + ", dailydose1=" + dailydose1
				+ ", dailydose2=" + dailydose2 + ", daydiff=" + daydiff + ", daytotal=" + daytotal + ", referencedate="
				+ referencedate + ", totaldistinctpersons=" + totaldistinctpersons + ", totaldose1=" + totaldose1
				+ ", totaldose2=" + totaldose2 + ", totalvaccinations=" + totalvaccinations + "]";
	}
	
	
	
	
	

}
