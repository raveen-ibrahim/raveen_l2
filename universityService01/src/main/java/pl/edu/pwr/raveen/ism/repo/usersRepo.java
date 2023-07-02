package pl.edu.pwr.raveen.ism.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.edu.pwr.raveen.ism.model.Users;

public interface usersRepo  extends JpaRepository<Users, Integer>{

}
