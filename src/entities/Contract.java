package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValue;
	
	List<Installment> installments = new ArrayList<>();
	
	public Contract(int number, Date date, Double totalValue) {
		
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double value) {
		this.totalValue = value;
	}
	
	public List<Installment> getInstallments(){
		return installments;
	}
	
	public void addInstallment(Installment installment) {
		installments.add(installment);
	}
	
	public void removeInstallment(Installment installment) {
		installments.remove(installment);
	}
	
}
