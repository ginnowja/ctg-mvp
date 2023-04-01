package com.ctg.mvpservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ctg.mvpservice.domain.persistence.EventEntity;
/**
 * This is our repo.. without any custom methods this looks a bit empty.. we're just relying on the out-of-the-box spring framework methods
 * @author ginno
 *
 */
@Repository
public interface EventRepository extends CrudRepository<EventEntity, String>{

}
