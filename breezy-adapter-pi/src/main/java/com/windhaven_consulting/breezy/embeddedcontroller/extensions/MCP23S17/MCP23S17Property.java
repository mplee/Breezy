package com.windhaven_consulting.breezy.embeddedcontroller.extensions.MCP23S17;

import java.util.Arrays;
import java.util.List;

import com.windhaven_consulting.breezy.embeddedcontroller.PropertyValueEnum;


public enum MCP23S17Property implements PropertyValueEnum {
	// Please keep enumerations in alphabetical order
	ADDRESS("Address"),
	CHANNEL("Channel");
	
	private String label;

	private MCP23S17Property(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

	@Override
	public String getName() {
		return this.name();
	}

	@Override
	public String getValue() {
		throw new UnsupportedOperationException();
	}

	@Override
	public List<PropertyValueEnum> getProperties() {
		return Arrays.asList(MCP23S17Property.values());
	}
}
