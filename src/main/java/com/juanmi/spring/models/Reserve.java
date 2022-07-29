package com.juanmi.spring.models;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reserve {
	
	@Id @GeneratedValue
	private long id;
	
	@Temporal(TemporalType.DATE)
	private Date reservationDateStart;
	
	@Temporal(TemporalType.DATE)
	private Date reservationDateEnd;
	
	@ManyToOne
	private User owner;
	
	@ManyToOne
	private Court court;
	
	public Reserve(User owner, Court court) {
		this.owner = owner;
		this.court = court;
	}
	
	public Court getCourt() {
		return court;
	}

	public void setCourt(Court court) {
		this.court = court;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getReservationDateStart() {
		return reservationDateStart;
	}

	public void setReservationDateStart(Date reservationDateStart) {
		this.reservationDateStart = reservationDateStart;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		return "Reserve [id=" + id + ", reservationDateStart=" + reservationDateStart + ", reservationDateEnd="
				+ reservationDateEnd + ", owner=" + owner + ", court=" + court + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(court, id, owner, reservationDateEnd, reservationDateStart);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserve other = (Reserve) obj;
		return Objects.equals(court, other.court) && id == other.id && Objects.equals(owner, other.owner)
				&& Objects.equals(reservationDateEnd, other.reservationDateEnd)
				&& Objects.equals(reservationDateStart, other.reservationDateStart);
	}

	public Date getReservationDateEnd() {
		return reservationDateEnd;
	}

	public void setReservationDateEnd(Date reservationDateEnd) {
		this.reservationDateEnd = reservationDateEnd;
	}
	
}
