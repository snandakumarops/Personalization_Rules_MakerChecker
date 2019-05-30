package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RulesFired implements java.io.Serializable, Comparable<RulesFired> {

	static final long serialVersionUID = 1L;

	private java.lang.String eventCategory;

	private java.lang.String eventValue;

	private java.lang.String customerHistory;

	private java.lang.String eventEffectiveness;

	private String eventResponsePayload;

	private java.lang.String ruleString;

	public RulesFired() {
	}

	public java.lang.String getEventCategory() {
		return this.eventCategory;
	}

	public void setEventCategory(java.lang.String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public java.lang.String getEventValue() {
		return this.eventValue;
	}

	public void setEventValue(java.lang.String eventValue) {
		this.eventValue = eventValue;
	}

	public java.lang.String getCustomerHistory() {
		return this.customerHistory;
	}

	public void setCustomerHistory(java.lang.String customerHistory) {
		this.customerHistory = customerHistory;
	}

	public java.lang.String getEventEffectiveness() {
		return this.eventEffectiveness;
	}

	public void setEventEffectiveness(java.lang.String eventEffectiveness) {
		this.eventEffectiveness = eventEffectiveness;
	}

	public java.lang.String getEventResponsePayload() {
		return this.eventResponsePayload;
	}

	public void setEventResponsePayload(java.lang.String eventResponsePayload) {
		this.eventResponsePayload = eventResponsePayload;
	}

	public String toString() {
		return getEventCategory() + " " + getEventValue() + " "
				+ getCustomerHistory() + " " + getEventEffectiveness() + " "
				+ getEventResponsePayload();
	}

	public java.lang.String getRuleString() {
		return this.ruleString;
	}

	public void setRuleString(java.lang.String ruleString) {
		this.ruleString = ruleString;
	}

	public RulesFired(java.lang.String eventCategory,
			java.lang.String eventValue, java.lang.String customerHistory,
			java.lang.String eventEffectiveness,
			java.lang.String eventResponsePayload, java.lang.String ruleString) {
		this.eventCategory = eventCategory;
		this.eventValue = eventValue;
		this.customerHistory = customerHistory;
		this.eventEffectiveness = eventEffectiveness;
		this.eventResponsePayload = eventResponsePayload;
		this.ruleString = ruleString;
	}
	
    @Override
    public boolean equals(Object o) {
        com.RulesFired ruleCheck = (RulesFired)o;
        return java.util.Objects.equals(this.eventCategory,ruleCheck.getEventCategory()) &&
         java.util.Objects.equals(this.eventValue,ruleCheck.getEventValue()) &&
          java.util.Objects.equals(this.customerHistory,ruleCheck.getCustomerHistory()) &&
           java.util.Objects.equals(this.eventEffectiveness,ruleCheck.getEventEffectiveness()) &&
            java.util.Objects.equals(this.eventResponsePayload,ruleCheck.getEventResponsePayload());
    }
    
    	@Override
    	public int hashCode(){
    	    return 12;
    	    
    	
    	}
    	
    	   @Override
    	 public int compareTo(RulesFired ruleFired) 
    { 
        return this.ruleString.compareTo(ruleFired.getRuleString()); 
    } 
  
}