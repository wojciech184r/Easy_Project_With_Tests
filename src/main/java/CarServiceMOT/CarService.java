package CarServiceMOT;

public class CarService {
    public boolean analyzeCarByParameters(Integer treadThickness, Integer fuelConsumption, Integer carMillage) {

        boolean treadThicknessNull = null == treadThickness;
        boolean fuelConsumptionNull = null == fuelConsumption;
        boolean carMillageNull = null == carMillage;
        if (treadThicknessNull || fuelConsumptionNull || carMillageNull) {

            throw new IllegalArgumentException("Car details can't be null");
        }
        boolean isTreadThicknessCorrect = isCorrect(treadThickness, ParametersValues.TREAD_THICKNESS);
        boolean isFuelConsumption = isCorrect(fuelConsumption, ParametersValues.FUEL_CONSUMPTION);
        boolean isCarMillage = isCorrect(carMillage, ParametersValues.CAR_MILLAGE);
        if (isCarMillage || isFuelConsumption || isTreadThicknessCorrect) {
            return true;
        }
        return false;
    }

    private boolean isCorrect(Integer value, ParametersValues validValues) {
        if (value < 0){
            throw  new IllegalArgumentException("Incorrect value");
        }
        Integer maxValue = validValues.getMaxValue();
        Integer minValue = validValues.getMinValue();
        if (value >minValue && value <maxValue){
            return true;
        }
        return false;
    }
}
