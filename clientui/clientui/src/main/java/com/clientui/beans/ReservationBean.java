package com.clientui.beans;

import java.util.Date;

public class ReservationBean {

	private int id;

	private Integer volld;

	private Date dateReservation;

	private Integer quantite;

	private Boolean reservationPayee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getVolld() {
		return volld;
	}

	public void setVolld(Integer volld) {
		this.volld = volld;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Boolean getReservationPayee() {
		return reservationPayee;
	}

	public void setReservationPayee(Boolean reservationPayee) {
		this.reservationPayee = reservationPayee;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", volld=" + volld + ", dateReservation=" + dateReservation + ", quantite="
				+ quantite + ", reservationPayee=" + reservationPayee + "]";
	}

	public ReservationBean(int id, Integer volld, Date dateReservation, Integer quantite, Boolean reservationPayee) {
		super();
		this.id = id;
		this.volld = volld;
		this.dateReservation = dateReservation;
		this.quantite = quantite;
		this.reservationPayee = reservationPayee;
	}

	public ReservationBean() {
		super();
	}

	public ReservationBean(Integer volld, Integer quantite, Boolean reservationPayee) {
		super();
		this.volld = volld;
		this.quantite = quantite;
		this.reservationPayee = reservationPayee;
	}

}
