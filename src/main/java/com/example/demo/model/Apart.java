package com.example.demo.model;

import java.time.LocalDate;

import com.example.demo.data.ApartDataInterface;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "apartment")
public class Apart implements ApartDataInterface {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = true)
	private String address;
	
	@Column(nullable = true)
	private String  salesrep;

	@Column(nullable = true)
	private double floorarea;
	
	@Column(nullable = true)
	private LocalDate registerdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalesrep() {
		return salesrep;
	}

	public void setSalesrep(String salesrep) {
		this.salesrep = salesrep;
	}



	public int getFloorarea() {
		return (int) floorarea;
	}

	public void setFloorarea(double floorarea) {
		this.floorarea = floorarea;
	}

	public LocalDate getRegisterdate() {
		return registerdate;
	}

	public void setRegisterdate(LocalDate registerdate) {
		this.registerdate = registerdate;
	}

	@Override
	public void setFloorarea(int Floorarea) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void setRegisterdate(String Registerdate) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	
	
}
