package com.ctg.mvpservice.domain.persistence;

import java.util.Date;
import java.util.Objects;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
/**
 * DAO version of our event
 * @author ginno
 *
 */
@Entity(name = "event")
public class EventEntity {

	@Id
	private String id;
	private Date createDate;
	private Date updateDate;
	private String name;
	private String location;
	private String description;
	private String joinCode;
	private String companionAppJoinCode;

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
	 * @return the name
	 */

	@Column
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
	 * @return the createDate
	 */

	@Column
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the updateDate
	 */

	@Column
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the location
	 */
	@Column
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
	@Column
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
	@Column
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
	@Column
	public String getCompanionAppJoinCode() {
		return companionAppJoinCode;
	}

	/**
	 * @param companionAppJoinCode the companionAppJoinCode to set
	 */
	public void setCompanionAppJoinCode(String companionAppJoinCode) {
		this.companionAppJoinCode = companionAppJoinCode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventEntity other = (EventEntity) obj;
		return Objects.equals(id, other.id);
	}

	 public String toString() {
	     return ReflectionToStringBuilder.toString(this);
	 }

}
