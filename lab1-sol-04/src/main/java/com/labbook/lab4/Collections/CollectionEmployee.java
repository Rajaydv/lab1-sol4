package com.labbook.lab4.Collections;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.labbook.lab4.dto.EmployeeEx;
	@Configuration
	public class CollectionEmployee 
	{
		private List<EmployeeEx> emplist=new ArrayList<EmployeeEx>();
		
		@Bean
		public List<EmployeeEx> getEmpList()
		{
			emplist.add(new EmployeeEx(1,"Raja Yadav",40000.0));
			emplist.add(new EmployeeEx(2,"Ritika",75000.0));
			emplist.add(new EmployeeEx(3,"Anubhav",30000.0));
			emplist.add(new EmployeeEx(4,"Shriya",995000.0));

			return emplist;
		}

}
