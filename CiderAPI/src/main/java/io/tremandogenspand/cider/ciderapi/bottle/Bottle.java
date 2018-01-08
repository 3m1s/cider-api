package io.tremandogenspand.cider.ciderapi.bottle;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.tremandogenspand.cider.ciderapi.batch.Batch;

@Entity
public class Bottle {
	
	@ManyToOne 
	private Batch batch;
	@Id
	private String id;
	private String bottleType;
	private String capType;	
	private String feedback;

	public Bottle() {
		super();
	}

	public Bottle(String batchId, String id, String bottleType, String capType, String feedback) {
		super();
		this.batch = new Batch(batchId, "", 0,"", new Date(), new Date(), new Date(), new Date());
		this.id = id;
		this.bottleType = bottleType;
		this.capType = capType;
		this.feedback = feedback;
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBottleType() {
		return bottleType;
	}

	public void setBottleType(String bottleType) {
		this.bottleType = bottleType;
	}

	public String getCapType() {
		return capType;
	}

	public void setCapType(String capType) {
		this.capType = capType;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

}
