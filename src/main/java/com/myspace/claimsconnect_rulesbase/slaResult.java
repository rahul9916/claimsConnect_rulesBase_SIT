package com.myspace.claimsconnect_rulesbase;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class slaResult implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("escalateTo")
	private java.lang.String escalateTo;
	@org.kie.api.definition.type.Label("escalationType")
	private java.lang.String escalationType;
	@org.kie.api.definition.type.Label("duration")
	private java.lang.String duration;

	@org.kie.api.definition.type.Label("executed")
	private java.lang.Boolean executed;

	@org.kie.api.definition.type.Label("serialNumber")
	private java.lang.String serialNumber;

	@org.kie.api.definition.type.Label("escalationEntity")
	private java.lang.String escalationEntity;

	@org.kie.api.definition.type.Label(value = "description")
	private java.lang.String description;

	public slaResult() {
	}

	public java.lang.String getEscalateTo() {
		return this.escalateTo;
	}

	public void setEscalateTo(java.lang.String escalateTo) {
		this.escalateTo = escalateTo;
	}

	public java.lang.String getEscalationType() {
		return this.escalationType;
	}

	public void setEscalationType(java.lang.String escalationType) {
		this.escalationType = escalationType;
	}

	public java.lang.String getDuration() {
		return this.duration;
	}

	public void setDuration(java.lang.String duration) {
		this.duration = duration;
	}

	public java.lang.Boolean getExecuted() {
		return this.executed;
	}

	public void setExecuted(java.lang.Boolean executed) {
		this.executed = executed;
	}

	public java.lang.String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(java.lang.String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public java.lang.String getEscalationEntity() {
		return this.escalationEntity;
	}

	public void setEscalationEntity(java.lang.String escalationEntity) {
		this.escalationEntity = escalationEntity;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public slaResult(java.lang.String escalateTo,
			java.lang.String escalationType, java.lang.String duration,
			java.lang.Boolean executed, java.lang.String serialNumber,
			java.lang.String escalationEntity, java.lang.String description) {
		this.escalateTo = escalateTo;
		this.escalationType = escalationType;
		this.duration = duration;
		this.executed = executed;
		this.serialNumber = serialNumber;
		this.escalationEntity = escalationEntity;
		this.description = description;
	}

}