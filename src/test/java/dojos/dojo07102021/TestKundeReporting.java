package dojos.dojo07102021;

import dojos.dojo05102012.*;
import dojos.dojo05102012.util.DateUtil;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKundeReporting {

    @Test
    public void testReportingMethod(){
        //arrange
        LocalDate birthday = DateUtil.convertStringToLocalDate("20.05.2000");
        LocalDate lastBuy = DateUtil.convertStringToLocalDate("20.05.2020");

        LocalDate birthday2 = DateUtil.convertStringToLocalDate("20.05.2001");
        LocalDate lastBuy2 = DateUtil.convertStringToLocalDate("20.05.2021");

        LocalDate birthday3 = DateUtil.convertStringToLocalDate("20.05.2000");
        LocalDate lastBuy3 = DateUtil.convertStringToLocalDate("20.05.2020");

        ViKunde vi = new ViKunde("1", "Max", "test@gmail.com", birthday, lastBuy);
        ExklusivKunde exklusivKunde = new ExklusivKunde("2", "Ilse", "test2@gmail.com", birthday2, lastBuy2);
        StandardKundeOhnePotential standardKundeOhnePotential = new StandardKundeOhnePotential("3", "Elisabeth", "test3@gmail.com", birthday3, lastBuy3);

        List<Kunde> kunden = new ArrayList<>();

        kunden.add(vi);
        kunden.add(exklusivKunde);
        kunden.add(standardKundeOhnePotential);

        //act
        List<Kunde> filteredKunden = KundeReporting.filterKunde(kunden, "V");

        //assert
        assertEquals(1, filteredKunden.size());
        assertEquals(ViKunde.class, filteredKunden.get(0).getClass());
        
    }
}
