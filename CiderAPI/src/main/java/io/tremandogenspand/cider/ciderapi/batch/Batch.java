package io.tremandogenspand.cider.ciderapi.batch;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Batch {
	
	@Id
	private String id;
	private String name;
	private int vintage;
	private String description;
	private Date pressDate;
	private Date rackingDate;
	private Date bottleningDate;
	private Date degorgementDate;
	
	public Batch() {
		super();
	}
	
	public Batch(String id, String name, int vintage, String description, Date pressDate, Date rackingDate,
			Date bottleningDate, Date degorgementDate) {
		super();
		this.id = id;
		this.name = name;
		this.vintage = vintage;
		this.description = description;
		this.pressDate = pressDate;
		this.rackingDate = rackingDate;
		this.bottleningDate = bottleningDate;
		this.degorgementDate = degorgementDate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVintage() {
		return vintage;
	}
	public void setVintage(int vintage) {
		this.vintage = vintage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPressDate() {
		return pressDate;
	}
	public void setPressDate(Date pressDate) {
		this.pressDate = pressDate;
	}
	public Date getRackingDate() {
		return rackingDate;
	}
	public void setRackingDate(Date rackingDate) {
		this.rackingDate = rackingDate;
	}
	public Date getBottleningDate() {
		return bottleningDate;
	}
	public void setBottleningDate(Date bottleningDate) {
		this.bottleningDate = bottleningDate;
	}
	public Date getDegorgementDate() {
		return degorgementDate;
	}
	public void setDegorgementDate(Date degorgementDate) {
		this.degorgementDate = degorgementDate;
	}


}
