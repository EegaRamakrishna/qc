package com.revature;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;


public interface QcDataInterface extends JpaRepository<Student, Integer> {

}
