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
import com.example.model.Population;
import com.example.repository.PopulationDTO;
import com.example.repository.PopulationInterface;

@Service
public class PopulationService implements PopulationInterface {
	
	@Autowired
	private PopulationDTO pdto;
	
	String line = "";
	
	@Autowired
	static List<Population> populationList = new ArrayList();
	
	Connection connection;
	
	public PopulationService() throws SQLException {
		connection = DBUtil.getConnection();
	}
	
	
	public void savePopulationData( ) {
		
		try {
			BufferedReader br= new BufferedReader(new FileReader("src/main/resources/populationRegionalUnits.csv"));
			while((line=br.readLine())!=null) {
				String [] data=line.split(",");
				Population p=new Population();
				p.setRegionalUnitId(data[2]);
				p.setRegionalUnit(data[1]);
				p.setPopulation(data[0]);
				pdto.save(p);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Population> getPopulation() {
		
		try {
			PreparedStatement stmt = connection.prepareStatement("SELECT * FROM population");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Population p = new Population();
				p.setRegionalUnitId(rs.getString(2));
				p.setRegionalUnit(rs.getString(3));
				p.setPopulation(rs.getString(4));
				populationList.add(p);
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return populationList;
	}

}
