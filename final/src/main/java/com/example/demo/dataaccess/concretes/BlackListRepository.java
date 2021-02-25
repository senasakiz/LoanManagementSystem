package com.example.demo.dataaccess.concretes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entities.concretes.BlackList;

public interface BlackListRepository extends JpaRepository<BlackList,Integer>{
	@Query(value="SELECT customer_id from black_list where customer_id=?1",nativeQuery=true)
	List<Integer> findBlackList(int customerId);

}
