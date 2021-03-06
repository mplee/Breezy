package com.windhaven_consulting.breezy.persistence.domain;

import java.io.Serializable;

import com.windhaven_consulting.breezy.embeddedcontroller.PinState;
import com.windhaven_consulting.breezy.persistence.dataservice.Revisionable;
import com.windhaven_consulting.breezy.persistence.enumeration.EventTriggerType;

public class TriggerEvent extends PersistentObject implements Serializable, Revisionable {

	private static final long serialVersionUID = 1L;

	private String mountedBoardId;
	
	private String inputPinId;
	
	private PinState pinState;
	
	private String macroId;
	
	private String comment;

	private boolean enabled;
	
	private EventTriggerType eventTriggerType = EventTriggerType.INPUT;

	private String releaseRevisionNumber;

	public String getMountedBoardId() {
		return mountedBoardId;
	}

	public void setMountedBoardId(String mountedBoardId) {
		this.mountedBoardId = mountedBoardId;
	}

	public String getInputPinId() {
		return inputPinId;
	}

	public void setInputPinId(String inputPinId) {
		this.inputPinId = inputPinId;
	}

	public PinState getState() {
		return pinState;
	}

	public void setState(PinState pinState) {
		this.pinState = pinState;
	}

	public String getMacroId() {
		return macroId;
	}

	public void setMacroId(String macroId) {
		this.macroId = macroId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public EventTriggerType getEventTriggerType() {
		return eventTriggerType;
	}

	public void setEventTriggerType(EventTriggerType eventTriggerType) {
		this.eventTriggerType = eventTriggerType;
	}

	public void setReleaseRevisionNumber(String releaseRevisionNumber) {
		this.releaseRevisionNumber = releaseRevisionNumber;
	}

	public String getReleaseRevisionNumber() {
		return releaseRevisionNumber;
	}

}
