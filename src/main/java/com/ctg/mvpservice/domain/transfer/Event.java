package com.ctg.mvpservice.domain.transfer;
/**
 * DTO version of an event
 * @author ginno
 *
 */
public class Event {
	
	private String id;
	private String name;
	private String location;
	private String description;
	private String joinCode;
	private String companionAppJoinCode;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
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
	 * @return the joinCode
	 */
	public String getJoinCode() {
		return joinCode;
	}

	/**
	 * @param joinCode the joinCode to set
	 */
	public void setJoinCode(String joinCode) {
		this.joinCode = joinCode;
	}

	/**
	 * @return the companionAppJoinCode
	 */
	public String getCompanionAppJoinCode() {
		return companionAppJoinCode;
	}

	/**
	 * @param companionAppJoinCode the companionAppJoinCode to set
	 */
	public void setCompanionAppJoinCode(String companionAppJoinCode) {
		this.companionAppJoinCode = companionAppJoinCode;
	}
	
	
	
	

}
