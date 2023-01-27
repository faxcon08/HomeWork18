package lesson_18;

public enum LoadCapacity {
    N1(null, 3.5f),
    N2(3.5f,12f),
    N3(12f,null);

    private Float lowBorder;
    private Float upBorder;

    LoadCapacity(Float lowBorder, Float upBorder) {
        this.lowBorder=lowBorder;
        this.upBorder=upBorder;
    }

    @Override
    public String toString() {
        String low = (lowBorder!=null)? (" От "+lowBorder) : "";
        String up = (upBorder!=null)? (" До "+upBorder): "";
        return "Грузоподьемность: "+low+up;
    }

    public LoadCapacity getLoadCapacityByWeight(float weight) {
        Float maxPossibleCapacity = 1000f;
        Float minCapacity = 0f;
        if (weight < 0 || weight > maxPossibleCapacity) {
            System.err.println("Некорретное значение возможной грузоподьемности грузовика. Присвоено значение по умолчанию");
            return N1;
        }
        for (LoadCapacity loadCapacity : LoadCapacity.values()) {
            Float low = (lowBorder!=null)? lowBorder: minCapacity;
            Float up = (upBorder!=null)? upBorder: maxPossibleCapacity;
            if(low <=weight && up>weight)
                return loadCapacity;
        }
        System.err.println("Некорретное значение возможной грузоподьемности грузовика. Присвоено значение по умолчанию");
        return N1;
    }
}
