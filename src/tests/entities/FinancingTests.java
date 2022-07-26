package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {
	
	@Test
	public void constructorShouldCreateObjWhenValidData() {
		//Arrange
		double expectedValue = 100000.0;
		double income = 2000.0;
		int months = 80;
		//Act
		Financing fin = new Financing(expectedValue, income, months);
		//Assert
		Assertions.assertEquals(expectedValue,fin.getTotalAmount());
		Assertions.assertEquals(income,fin.getIncome());
		Assertions.assertEquals(months,fin.getMonths());
		
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		//Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Act
			Financing fin = new Financing(100000.0, 2000.0, 20);
			});
	}
	
	@Test
	public void setTotalAmountShouldUpdateWhenValidData() {
		//Arrange
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		double updateValue = 90000.0;
		//Act
		Financing fin = new Financing(totalAmount, income, months);
		fin.setTotalAmount(updateValue);
		//Assert
		Assertions.assertEquals(updateValue, fin.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		//Assert
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			//Arrange
			double totalAmount = 100000.0;
			double income = 2000.0;
			int months = 80;
			double updateValue = 110000.0;
			//Act
			Financing fin = new Financing(totalAmount, income, months);
			fin.setTotalAmount(updateValue);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateWhenValidData() {
		//Arrange
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		double UpdateIncome = 2001.0;
		//Act
		Financing fin = new Financing(totalAmount, income, months);
		fin.setIncome(UpdateIncome);
		//Assert
		Assertions.assertEquals(UpdateIncome, fin.getIncome());
	}
	
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		//Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Arrange
			double totalAmount = 100000.0;
			double income = 2000.0;
			int months = 80;
			double UpdateIncome = 1999.0;
			//Act
			Financing fin = new Financing(totalAmount, income, months);
			fin.setIncome(UpdateIncome);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateWhenValidData() {
		//Arrange
		double totalAmount = 100000.0;
		double income = 2000.0;
		int months = 80;
		int updateMonths = 81;
		//Act
		Financing fin = new Financing(totalAmount, income, months);
		fin.setMonths(updateMonths);
		//Assert
		Assertions.assertEquals(updateMonths, fin.getMonths());
	}
	
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		//Assert
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			//Arrange
			double totalAmount = 100000.0;
			double income = 2000.0;
			int months = 80;
			int updateMonths = 79;
			//Act
			Financing fin = new Financing(totalAmount, income, months);
			fin.setMonths(updateMonths);
		});
	}
	
	@Test
	public void entryShouldCalcCorrectlyData() {
		//Arrange
		Financing fin = new Financing(100000.0, 2000.0, 80);
		//Assert
		Assertions.assertTrue(20000.0 == fin.entry());
	}
	
	@Test
	public void quotaShouldCalcCorrectlyData() {
		//Arrange
		Financing fin = new Financing(100000.0, 2000.0, 80);
		//Assert
		Assertions.assertTrue(1000.0 == fin.quota());
	}
	
}
