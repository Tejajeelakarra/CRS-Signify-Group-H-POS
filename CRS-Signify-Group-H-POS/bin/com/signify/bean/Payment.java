/**
 * 
 */
package com.signify.bean;

/**
 * @author Nivi
 *
 */
public class Payment {
	private int studentId;
	private String referenceId;
	private float amount;
	private boolean status;
	
	
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the referenceId
	 */
	public String getReferenceId() {
		return referenceId;
	}
	/**
	 * @param referenceId the referenceId to set
	 */
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	public class Scholarship{
		private String scholarshipName;

		/**
		 * @return the scholarshipName
		 */
		public String getScholarshipName() {
			return scholarshipName;
		}

		/**
		 * @param scholarshipName the scholarshipName to set
		 */
		public void setScholarshipName(String scholarshipName) {
			this.scholarshipName = scholarshipName;
		}
		
	}
	public class Offline{
		
		public class Cash{
			
		}
		public class Cheque{
			private String bankName;
			private int chequeNumber;
			/**
			 * @return the bankName
			 */
			public String getBankName() {
				return bankName;
			}
			/**
			 * @param bankName the bankName to set
			 */
			public void setBankName(String bankName) {
				this.bankName = bankName;
			}
			/**
			 * @return the chequeNumber
			 */
			public int getChequeNumber() {
				return chequeNumber;
			}
			/**
			 * @param chequeNumber the chequeNumber to set
			 */
			public void setChequeNumber(int chequeNumber) {
				this.chequeNumber = chequeNumber;
			}
			
		}
		
	}
	public class Online{
		public class Card{
			private int cardNumber;
			private String cardType;
			/**
			 * @return the cardNumber
			 */
			public int getCardNumber() {
				return cardNumber;
			}
			/**
			 * @param cardNumber the cardNumber to set
			 */
			public void setCardNumber(int cardNumber) {
				this.cardNumber = cardNumber;
			}
			/**
			 * @return the cardType
			 */
			public String getCardType() {
				return cardType;
			}
			/**
			 * @param cardType the cardType to set
			 */
			public void setCardType(String cardType) {
				this.cardType = cardType;
			}
			
			
		}
		public class NetBanking{
			private String modeOfTransport;
			private int accountNumber;
			private String IFSCcode;
			/**
			 * @return the modeOfTransport
			 */
			public String getModeOfTransport() {
				return modeOfTransport;
			}
			/**
			 * @param modeOfTransport the modeOfTransport to set
			 */
			public void setModeOfTransport(String modeOfTransport) {
				this.modeOfTransport = modeOfTransport;
			}
			/**
			 * @return the accountNumber
			 */
			public int getAccountNumber() {
				return accountNumber;
			}
			/**
			 * @param accountNumber the accountNumber to set
			 */
			public void setAccountNumber(int accountNumber) {
				this.accountNumber = accountNumber;
			}
			/**
			 * @return the iFSCcode
			 */
			public String getIFSCcode() {
				return IFSCcode;
			}
			/**
			 * @param iFSCcode the iFSCcode to set
			 */
			public void setIFSCcode(String iFSCcode) {
				IFSCcode = iFSCcode;
			}
			
			
		}
		
	}

}
