package com.codegnan.cards;

import java.util.ArrayList;

import com.codegnan.customException.InsufficientBalanceException;
import com.codegnan.customException.InsufficientMachineBalanceException;
import com.codegnan.customException.InvalidAmountException;
import com.codegnan.customException.NotAOperatorException;
import com.codegnan.interfaces.ATMServices;

public class AxisCard implements ATMServices  {
	String name;
 	long debitCardNumber;
 	double accountBalance;
 	int pinNumber;
 	ArrayList<String> statement;
 	final String type = "user";
 	int chances;
 


	@Override
	public String getUserType() throws NotAOperatorException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double WithdrawAmount(double wtdAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void depositeAmount(double dptAmount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkbalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ChangePinNumber(int PinNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void decreaseChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getChances() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void resetPinChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void generateMiniStatement() {
		// TODO Auto-generated method stub
		
	}

}
