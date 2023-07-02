package pl.edu.pwr.raveen.ism.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.edu.pwr.raveen.ism.model.Bookings;

public interface bookingRepo extends  JpaRepository<Bookings, Integer>{

}
