package com.vanjenson.live.hapi.daos;

import com.vanjenson.live.hapi.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vj on 2/8/15.
 */
public interface EventDao extends JpaRepository<Event, Long> {

}

//public interface ZoneDao extends JpaRepository<Zone, Long> {
//    Zone findByName(@Param("name") String name);
//
//}
