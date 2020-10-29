package cz.janakdom.backend.controller;

import cz.janakdom.backend.model.AffectedEntityEntity;
import cz.janakdom.backend.model.ApiResponse;
import cz.janakdom.backend.model.RailroadEntity;
import cz.janakdom.backend.model.TypeOfInterventionEntity;
import cz.janakdom.backend.service.SerieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/serie")
public class SeriesController {

    @Autowired
    private SerieService serieService;

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/railroads")
    public List<RailroadEntity> getSerieRailRoads() {
        return serieService.getSerieRailRoads();
    }

    @GetMapping("/type-of-intervention")
    public List<TypeOfInterventionEntity> getSerieTypeOfIntervention() {
        return serieService.getSerieTypeOfIntervention();
    }

    @GetMapping("/affected-entity")
    public List<AffectedEntityEntity> getSerieAffectedEntity() {
        return serieService.getSerieAffectedEntity();
    }
}