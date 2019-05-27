package com.another.personalization_rules;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RulesFired implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String eventCategory;

	private java.lang.String eventValue;

	private java.lang.String customerHistory;

	private java.lang.String eventEffectiveness;

	private String eventResponsePayload;

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

	public RulesFired(java.lang.String eventCategory,
			java.lang.String eventValue, java.lang.String customerHistory,
			java.lang.String eventEffectiveness,
			java.lang.String eventResponsePayload) {
		this.eventCategory = eventCategory;
		this.eventValue = eventValue;
		this.customerHistory = customerHistory;
		this.eventEffectiveness = eventEffectiveness;
		this.eventResponsePayload = eventResponsePayload;
	}
		@Override
    public boolean equals(Object obj) 
    { 
          
   
    if(this.getEventCategory().equals(obj.getEventCategory()) && 
    this.getEventValue().equals(obj.getEventValue()) && 
    this.getCustomerHistory().equals(obj.getCustomerHistory()) && 
    this.getEventEffectiveness().equals(obj.getEventEffectiveness()) && 
    this.getEventResponsePayload().equals(obj.getEventResponsePayload())) {
            return true; 
    }else {
        return false;
    }
          
    
    } 
  
  
      
    @Override
    public int hashCode() 
    { 
          

        return this.id; 
    } 


}