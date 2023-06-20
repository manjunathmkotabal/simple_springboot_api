package com.example.liveasy.controller;
import com.example.liveasy.model.Load;
import com.example.liveasy.repository.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoadController {
    private final LoadRepository loadRepository;

    @Autowired
    public LoadController(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }

    @GetMapping("/")
    public String getHomePage() {
        return "API is up and running!";
    }

    @PostMapping("/load")
    public String addLoad(@RequestBody Load load) {
        loadRepository.save(load);
        return "Load details added successfully";
    }

    @GetMapping("/load")
    public List<Load> getLoadsByShipperId(@RequestParam("shipperId") String shipperId) {
        return loadRepository.findByShipperId(shipperId);
    }

    @GetMapping("/load/{loadId}")
    public Load getLoadById(@PathVariable("loadId") Long loadId) {
        return loadRepository.findById(loadId).orElse(null);
    }

    @PutMapping("/load/{loadId}")
    public Load updateLoad(@PathVariable("loadId") Long loadId, @RequestBody Load updatedLoad) {
        Load load = loadRepository.findById(loadId).orElse(null);
        if (load != null) {
            load.setLoadingPoint(updatedLoad.getLoadingPoint());
            load.setUnloadingPoint(updatedLoad.getUnloadingPoint());
            load.setProductType(updatedLoad.getProductType());
            load.setTruckType(updatedLoad.getTruckType());
            load.setNoOfTrucks(updatedLoad.getNoOfTrucks());
            load.setWeight(updatedLoad.getWeight());
            load.setComment(updatedLoad.getComment());
            load.setLoadDate(updatedLoad.getLoadDate());
            loadRepository.save(load);
        }
        return load;
    }

    @DeleteMapping("/load/{loadId}")
    public String deleteLoad(@PathVariable("loadId") Long loadId) {
        loadRepository.deleteById(loadId);
        return "deleted successfully";
    }
}
