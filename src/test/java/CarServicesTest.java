import CarServiceMOT.CarService;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CarServicesTest {
    @Test
    public void analyzeCarByParameters_millageNull_throwsIllegalArgumentException() {

        //given
        Integer treadThickness = 3;
        Integer fuelConsumption = 8;
        Integer carMillage = null;
        CarService service = new CarService();
        //when

        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.analyzeCarByParameters(treadThickness, fuelConsumption, carMillage));
    }
    @Test
    public void analyzeCarByParameters_allValueOK_throwsIllegalArgumentException(){

        //given
        Integer treadThickness = 3;
        Integer fuelConsumption = 8;
        Integer carMillage = 15000;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParameters(treadThickness,fuelConsumption,carMillage);

        // then
        Assertions.assertTrue(result);

    }

    @Test
    public void analyzeCarByParameters_carMillageWrong_resultFalse(){

        //given
        Integer treadThickness = 3;
        Integer fuelConsumption = 5;
        Integer carMillage = 21000;
        CarService service = new CarService();

        //when
        boolean result = !service.analyzeCarByParameters(treadThickness,fuelConsumption,carMillage);

        // then
        Assertions.assertFalse(result);

    }

    @Test
    public void analyzeCarByParameters_millageLesThenZero_throwsIllegalArgumentException(){

        //given
        Integer treadThickness = 3;
        Integer fuelConsumption = 8;
        Integer carMillage = -1;
        CarService service = new CarService();

        //when


        // then
        Assertions.assertThrows(IllegalArgumentException.class,()->service.analyzeCarByParameters(treadThickness,fuelConsumption,carMillage));

    }
    @Test
    public void analyzeCarByParameters_valuesEqualsToMinOrMax_resultFalse(){

        //given
        Integer treadThickness = 2;
        Integer fuelConsumption = 15;
        Integer carMillage = 0;
        CarService service = new CarService();

        //when
        boolean result = service.analyzeCarByParameters(treadThickness,fuelConsumption,carMillage);

        // then
        Assertions.assertFalse(result);

    }
}
