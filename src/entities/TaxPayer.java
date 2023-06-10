package entities;

public class TaxPayer {
	
	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educationSpending;
	
	public TaxPayer() {
		
	}

	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending,
			Double educationSpending) {
		super();
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}
	
	public Double getSalaryIncome() {
		return salaryIncome;
	}
	
	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public Double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public Double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(Double educationSpending) {
		this.educationSpending = educationSpending;
	}
	
	public Double salaryTax() {
		double salaryPerMonth = salaryIncome / 12;
		
		if (salaryPerMonth < 3000.00) {
			return 0.0;
		} else if (salaryPerMonth < 5000.00) {
			return salaryPerMonth * 0.10 * 12;
		} else {
			return salaryPerMonth * 0.20 * 12;
		}
		
	}
	
	public Double servicesTax() {
		return servicesIncome * 0.15;
	}
	
	public Double capitalTax() {
		return capitalIncome * 0.20;
	}
	
	public Double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public Double taxRebate() {
		double spendings = healthSpending + educationSpending;
		
		if (spendings > grossTax() * 0.30) {
			return grossTax() * 0.30;
 		} else {
 			return spendings;
 		}
	}
	
	public Double netTax() {
		return grossTax() - taxRebate();
	}
	
	@Override
	public String toString() {
		return  "Imposto bruto total: " 
				+ String.format("%.2f%n", grossTax())
				+ "Abatimento: " 
				+ String.format("%.2f%n", taxRebate())
				+ "Imposto devido: " 
				+ String.format("%.2f%n", netTax()); 
	}
} 
  

 













