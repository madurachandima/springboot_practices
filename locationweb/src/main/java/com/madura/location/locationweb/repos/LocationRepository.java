package com.madura.location.locationweb.repos;

import com.madura.location.locationweb.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;


public interface LocationRepository extends JpaRepository<Location, Integer> {

    @Query(value = "SELECT type,COUNT(type) FROM location GROUP BY type", nativeQuery = true)
    List<Object[]> findTypeAndTypeCount();
}
