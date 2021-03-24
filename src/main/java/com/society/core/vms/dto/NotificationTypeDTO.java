package com.society.core.vms.dto;

import java.io.Serializable;
import java.util.List;

public class NotificationTypeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2321062881909151474L;
	private int ntid;
	private String description;
	private String type;
	private List<NotificationActionButtonDTO> actionButtons;

	/**
	 * 
	 */
	public NotificationTypeDTO() {
		super();
	}

	/**
	 * @param ntid
	 * @param description
	 * @param type
	 * @param actionButtons
	 */
	public NotificationTypeDTO(int ntid, String description, String type,
			List<NotificationActionButtonDTO> actionButtons) {
		super();
		this.ntid = ntid;
		this.description = description;
		this.type = type;
		this.actionButtons = actionButtons;
	}

	/**
	 * @return the ntid
	 */
	public int getNtid() {
		return ntid;
	}

	/**
	 * @param ntid the ntid to set
	 */
	public void setNtid(int ntid) {
		this.ntid = ntid;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the actionButtons
	 */
	public List<NotificationActionButtonDTO> getActionButtons() {
		return actionButtons;
	}

	/**
	 * @param actionButtons the actionButtons to set
	 */
	public void setActionButtons(List<NotificationActionButtonDTO> actionButtons) {
		this.actionButtons = actionButtons;
	}
	
	
}
