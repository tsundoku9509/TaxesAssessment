package model;

/**
 * @author ajlj - Austin Mays ajmays@dmacc.edu
 * CIS175 - Spring 2023
 * Feb 7, 2023
 */
public class Taxes {
	private double yearlyTax;
	private double monthlyTax;
	private double yearlyTaxRate;
	private double monthlyTaxRate;
	
	public Taxes() {
		super();
	}
	public Taxes(double yearlyTax) {
		super();
		this.yearlyTax = yearlyTax;
		setTax(yearlyTax);
	}
	/**
	 * @return the yearlyTax
	 */
	public double getYearlyTax() {
		return yearlyTax;
	}
	/**
	 * @param yearlyTax the yearlyTax to set
	 */
	public void setYearlyTax(double yearlyTax) {
		this.yearlyTax = yearlyTax;
	}
	/**
	 * @return the monthlyTax
	 */
	public double getMonthlyTax() {
		return monthlyTax;
	}
	/**
	 * @param monthlyTax the monthlyTax to set
	 */
	public void setMonthlyTax(double monthlyTax) {
		this.monthlyTax = monthlyTax;
	}
	/**
	 * @return the taxBracket
	 */
	public double getYearlyTaxRate() {
		return yearlyTaxRate;
	}
	/**
	 * @param taxBracket the taxBracket to set
	 */
	public void setYearlyTaxRate(double yearlyTaxRate) {
		this.yearlyTaxRate = yearlyTaxRate;
	}
	/**
	 * @return the monthlyTaxRate
	 */
	public double getMonthlyTaxRate() {
		return monthlyTaxRate;
	}
	/**
	 * @param monthlyTaxRate the monthlyTaxRate to set
	 */
	public void setMonthlyTaxRate(double monthlyTaxRate) {
		this.monthlyTaxRate = monthlyTaxRate;
	}
	public void setTax(double yearlyTax) {
		final double YEARLYTAXRATE = 0.37; //tells the highest rate of tax percentage as a decimal per year as a starting point.
		final double MONTHLYTAXRATE = 0.10; //tells the highest average for monthly tax percentage as a decimal as a starting point.
		
		double taxedYear;
		setYearlyTaxRate(yearlyTax/YEARLYTAXRATE);
		taxedYear = yearlyTax % YEARLYTAXRATE;
		
		double taxedMonth;
		setMonthlyTaxRate(monthlyTax/MONTHLYTAXRATE);
		taxedMonth = monthlyTax % MONTHLYTAXRATE;
	}
	@Override
	public String toString() {
		return "Taxes [yearlyTax=" + yearlyTax + ", taxedYear=%.02f" +
		yearlyTaxRate + ", yearlyTaxRate=" + monthlyTax + ", taxedMonth=" + monthlyTaxRate + "]";
		}
}

