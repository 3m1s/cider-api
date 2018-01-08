package io.tremandogenspand.cider.ciderapi.batch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BatchService {

	@Autowired
	BatchRepository batchRepository; 
	
	public List<Batch> getAllBatches() {
		List<Batch> batches = new ArrayList<>();
		batchRepository.findAll().forEach(batches::add);
		return batches;
	}
	
	public Batch getBatch (String id) {
		return batchRepository.findOne(id);
	}
	
	public void addBatch(Batch batch) {
		batchRepository.save(batch);
	}
	
	public void updateBatch(String id, Batch batch) {
		batchRepository.save(batch);
	}
	
	public void deleteBatch(String id) {
		batchRepository.delete(id);
	}
	
	
	
}
