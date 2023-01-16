package com.example.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DBUtil.DBUtil;
import com.example.model.Covid;
import com.example.repository.CovidDTO;
import com.example.repository.CovidInterface;

@Service
public class CovidService implements CovidInterface {
	
	@Autowired
	private CovidDTO cdto;
	
	String line = "";
	
	@Autowired
	static List<Covid> covidList = new ArrayList();
	
	Connection connection;
	
	public CovidService() throws SQLException {
		connection = DBUtil.getConnection();
	}
	
	public void saveCovidData( ) {
		
		try {
			BufferedReader br= new BufferedReader(new FileReader("src/main/resources/covidStats.csv"));
			while((line=br.readLine())!=null) {
				String [] data=line.split(",");
				Covid c=new Covid();
				c.setArea(data[0]);
				c.setAreaid(data[1]);
				c.setDailydose1(data[2]);
				c.setDailydose2(data[3]);
				c.setDaydiff(data[4]);
				c.setDaytotal(data[5]);
				c.setReferencedate(data[6]);
				c.setTotaldistinctpersons(data[7]);
				c.setTotaldose1(data[8]);
				c.setTotaldose2(data[9]);
				c.setTotalvaccinations(data[10]);
				cdto.save(c);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@Override
	public List<Covid> getCovidData() {
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM COVID");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Covid c = new Covid();
				c.setArea(rs.getString(2));
				c.setAreaid(rs.getString(3));
				c.setDailydose1(rs.getString(4));
				c.setDailydose2(rs.getString(5));
				c.setDaydiff(rs.getString(6));
				c.setDaytotal(rs.getString(7));
				c.setReferencedate(rs.getString(8));
				c.setTotaldistinctpersons(rs.getString(9));
				c.setTotaldose1(rs.getString(10));
				c.setTotaldose2(rs.getString(11));
				c.setTotalvaccinations(rs.getString(12));
				covidList.add(c);
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return covidList;
	}

}
