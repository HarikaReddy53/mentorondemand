package com.mentor.mentorondemand.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mentor.mentorondemand.model.Trainings;

public interface ITrainingRepository extends CrudRepository<Trainings, Long>{

	public List<Trainings> getAllCustomers();
    public List<Trainings> getCompletedTrainings();
    public Iterable<Trainings> findAll();
    public Trainings save(Trainings trainings);
    public Optional<Trainings> findById(long id);
    public void findCompletedTrainings(String string); 

}
