package CarServiceMOT;

public enum ParametersValues {
    CAR_MILLAGE(0,20000),

    TREAD_THICKNESS(2,100000000),

    FUEL_CONSUMPTION(0,15);


    private Integer minValue;
    private Integer maxValue;

    ParametersValues(Integer minValue, Integer maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }


}
