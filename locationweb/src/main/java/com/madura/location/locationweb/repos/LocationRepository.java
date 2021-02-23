package com.madura.location.locationweb.repos;

import com.madura.location.locationweb.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location, Integer> {
}
