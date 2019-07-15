package com.calculator;

public class Calculator implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double results;

	public Calculator() {
		
	}
	public Calculator(Double operandOne, String operation, Double operandTwo) {
		this.operandOne = 0;
		this.operandTwo = 0;
		this.operation = "+";
		this.results = 0;
	}
	/**
	 * @return the operandOne
	 */
	public double getOperandOne() {
		return operandOne;
	}
	/**
	 * @return the operandTwo
	 */
	public double getOperandTwo() {
		return operandTwo;
	}
	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}
	/**
	 * @return the results
	 */
	public double getResults() {
		return results;
	}
	/**
	 * @param operandOne the operandOne to set
	 */
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	/**
	 * @param operandTwo the operandTwo to set
	 */
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	/**
	 * @param results the results to set
	 */
	public void setResults(double results) {
		this.results = results;
	}
	
	public double performOperation() {
		if(getOperation() == "+") {
			setResults(getOperandOne() + getOperandTwo());
		} else if(getOperation() == "-") {
			setResults(getOperandOne() - getOperandTwo());
		}
		return results;
	}
}