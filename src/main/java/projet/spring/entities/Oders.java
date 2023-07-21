package projet.spring.entities;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Oders implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id_oder;
private Date creationDate;
private String deliveryAdress;
private String status;
private float total;
public long getId_oder() {
	return id_oder;
}
public void setId_oder(long id_oder) {
	this.id_oder = id_oder;
}
public Date getCreationDate() {
	return creationDate;
}
public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}
public String getDeliveryAdress() {
	return deliveryAdress;
}
public void setDeliveryAdress(String deliveryAdress) {
	this.deliveryAdress = deliveryAdress;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public float getTotal() {
	return total;
}
public void setTotal(float total) {
	this.total = total;
}
@Override
public String toString() {
	return "Oders [id_oder=" + id_oder + ", creationDate=" + creationDate + ", deliveryAdress=" + deliveryAdress
			+ ", status=" + status + ", total=" + total + "]";
}
public Oders(Date creationDate, String deliveryAdress, String status, float total) {
	super();
	this.creationDate = creationDate;
	this.deliveryAdress = deliveryAdress;
	this.status = status;
	this.total = total;
}


}
