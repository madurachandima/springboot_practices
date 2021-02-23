package com.madura.location.locationweb.service;

import com.madura.location.locationweb.entities.Location;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    Location saveLocation(Location location);

    Location updateLocation(Location location);

    void deleteLocation(Location location);

    Optional<Location> getLocationById(int id);

    List<Location> getAllLocation();

    void deleteLocationById(int id);
    


}
