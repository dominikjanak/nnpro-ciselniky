package cz.janakdom.backend.service;

import cz.janakdom.backend.model.AffectedEntityEntity;
import cz.janakdom.backend.model.RailroadEntity;
import cz.janakdom.backend.model.TypeOfInterventionEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service(value = "deviceService")
public class SerieService {
    
    public List<RailroadEntity> getSerieRailRoads() {
        List<RailroadEntity> data = new ArrayList<RailroadEntity>();
        int i = 0;
        data.add(new RailroadEntity(++i, "SC (IC)", "Pendolino", "(Fr. Lázně/Cheb -) Praha - Ostrava / Bohumín"));
        data.add(new RailroadEntity(++i, "SC", "SC Pendolino Košičan", "Praha - Košice"));
        data.add(new RailroadEntity(++i, "Ex 1", "Ostravan", "Praha - Bohumín / Návsí /Žilina Praha - Bohumín / Návsí /Žilina"));
        data.add(new RailroadEntity(++i, "Ex 1", "Opavan", "Praha - Opava"));
        data.add(new RailroadEntity(++i, "Ex 1", "Varsovia", "Praha / Ostrava - Warszawa"));
        data.add(new RailroadEntity(++i, "Ex 1", "Fatra", "Ostrava - Žilina - Banská Bystrica / Zvolen"));
        data.add(new RailroadEntity(++i, "Ex 2", "Valašský expres", "Praha - Vsetín / Žilina"));
        data.add(new RailroadEntity(++i, "Ex 3", "Vindobona", "Praha - Wien - Graz"));
        data.add(new RailroadEntity(++i, "Ex 3", "Berliner", "Praha - Berlin / Hamburg"));
        data.add(new RailroadEntity(++i, "Ex 3", "Metropolitan", "Praha - Bratislava - Budapest"));
        data.add(new RailroadEntity(++i, "Ex 6", "Západní expres", "Praha - Plzeň - München / Cheb"));
        data.add(new RailroadEntity(++i, "Ex 7", "Jižní expres", "Praha - České Budějovice / Linz"));
        data.add(new RailroadEntity(++i, "R  5", "Krušnohor", "Praha - Ústí nad Labem - Karlovy Vary - Cheb"));
        data.add(new RailroadEntity(++i, "R  8", "Slezan", "Brno - Bohumín"));
        data.add(new RailroadEntity(++i, "R  9", "Vysočina", "Praha - Havlíčkův Brod (Jihlava) - Brno"));
        data.add(new RailroadEntity(++i, "R 10", "Hradečan", "Praha - Hradec Králové - Trutnov"));
        data.add(new RailroadEntity(++i, "R 11", "Rožmberk", "Brno - České Budějovice / Plzeň"));
        data.add(new RailroadEntity(++i, "R 11", "Bezdrev", "České Budějovice - Plzeň"));
        data.add(new RailroadEntity(++i, "R 12", "Bouzov", "Brno - Olomouc - Šumperk"));
        data.add(new RailroadEntity(++i, "R 13", "Moravan", "Brno - Břeclav - Přerov - Olomouc"));
        data.add(new RailroadEntity(++i, "R 14", "Ještěd", "Pardubice - Liberec"));
        data.add(new RailroadEntity(++i, "R 15", "Ploučnice", "Liberec - Ústí nad Labem"));
        data.add(new RailroadEntity(++i, "R 16", "Berounka", "Praha - Plzeň - Klatovy / Železná Ruda"));
        data.add(new RailroadEntity(++i, "R 17", "Vltava", "Praha - České Budějovice"));
        data.add(new RailroadEntity(++i, "R 17", "Lužnice", "Praha - Tábor - Veselí nad Lužnicí"));
        data.add(new RailroadEntity(++i, "R 18", "Slovácký expres", "Praha - Olomouc - Luhačovice / Veselí nad Moravou"));
        data.add(new RailroadEntity(++i, "R 19", "Svitava", "Praha - Česká Třebová - Brno"));
        data.add(new RailroadEntity(++i, "R 20", "Labe", "Praha - Děčín"));
        data.add(new RailroadEntity(++i, "R 21", "Jizera", "Praha - Turnov / Tanvald / Harrachov"));
        data.add(new RailroadEntity(++i, "R 22", "Bezděz", "Kolín - Rumburk / Šluknov"));
        data.add(new RailroadEntity(++i, "R 23", "Střekov", "Ústí nad Labem - Kolín"));
        data.add(new RailroadEntity(++i, "R 24", "Lány", "Praha - Rakovník"));
        data.add(new RailroadEntity(++i, "R 26", "Otava", "Praha - Písek - České Budějovice"));
        data.add(new RailroadEntity(++i, "R 27", "Praděd", "Olomouc - Krnov - Ostrava"));
        data.add(new RailroadEntity(++i, "R 27", "Cvilín", "Krnov - Ostrava"));
        return data;
    }

    public List<TypeOfInterventionEntity> getSerieTypeOfIntervention() {
        List<TypeOfInterventionEntity> data = new ArrayList<TypeOfInterventionEntity>();
        int i = 0;
        data.add(new TypeOfInterventionEntity(++i, "Požár budov"));
        data.add(new TypeOfInterventionEntity(++i, "Požáry lokomotiv, vozů"));
        data.add(new TypeOfInterventionEntity(++i, "Požáry ostatní (vypalování kabelu apod.)"));
        data.add(new TypeOfInterventionEntity(++i, "Planý poplach"));
        data.add(new TypeOfInterventionEntity(++i, "Cvičení jednotek"));
        data.add(new TypeOfInterventionEntity(++i, "Likvidace nebezpečného hmyzu"));
        data.add(new TypeOfInterventionEntity(++i, "Únik (oleje z lokomotiv, apod.)"));
        data.add(new TypeOfInterventionEntity(++i, "Zimní opatení (sníh, ledové krápníky)"));
        return data;
    }

    public List<AffectedEntityEntity> getSerieAffectedEntity() {
        List<AffectedEntityEntity> data = new ArrayList<AffectedEntityEntity>();
        int i = 0;
        data.add(new AffectedEntityEntity(++i, "Arriva"));
        data.add(new AffectedEntityEntity(++i, "AWT"));
        data.add(new AffectedEntityEntity(++i, "ČD"));
        data.add(new AffectedEntityEntity(++i, "ČD Cargo"));
        data.add(new AffectedEntityEntity(++i, "LeoExpress"));
        data.add(new AffectedEntityEntity(++i, "RegioJet"));
        data.add(new AffectedEntityEntity(++i, "SŽ"));
        data.add(new AffectedEntityEntity(++i, "Jiný"));
        return data;
    }
}
