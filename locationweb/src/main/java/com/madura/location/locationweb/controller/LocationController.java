package com.madura.location.locationweb.controller;

import com.madura.location.locationweb.entities.Location;
import com.madura.location.locationweb.service.LocationService;
import com.madura.location.locationweb.utill.EmailUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class LocationController {

    @Autowired
    LocationService service;

    @Autowired
    EmailUtill emailUtill;

    @RequestMapping("showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("saveLoc")
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
        try {
            emailUtill.sendEmail("madurachandima6@gmail.com", "This is test email", "spring boot test email");
            Location loc = service.saveLocation(location);
            String responseMsg = "Location saved with Name : " + loc.getName();
            modelMap.put("saveResponse", responseMsg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // emailUtill.sendEmail("madurachandima6@gmail.com","This is test email","spring boot test email");

        return "createLocation";
    }

    @RequestMapping("displayLocations")
    public String displayAllLocation(ModelMap modelMap) {
        List<Location> locations = service.getAllLocation();
        modelMap.addAttribute("Locations", locations);
        return "displayLocations";
    }

    @RequestMapping("deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
        service.deleteLocationById(id);
        List<Location> locations = service.getAllLocation();
        modelMap.addAttribute("Locations", locations);
        service.getAllLocation();
        return "displayLocations";
    }

    @RequestMapping("updateLocation")
    public String showUpdateLocation(@RequestParam("id") int id, ModelMap modelMap) {
        Location location = service.getLocationById(id).get();
        modelMap.addAttribute("location", location);
        return "updateLocation";
    }

    @RequestMapping("updateLoc")
    public String updateLocations(@ModelAttribute("location") Location location, ModelMap modelMap) {
        service.updateLocation(location);
        List<Location> locations = service.getAllLocation();
        modelMap.addAttribute("location", locations);
        return "displayLocations";
    }
}
