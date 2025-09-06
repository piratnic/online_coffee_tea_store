package ru.store.onlain.model;

import ru.store.onlain.model.enumeration.Aroma;
import ru.store.onlain.model.enumeration.TeaType;

public class Tea extends Drink{

    private TeaType teaType;

    private Aroma aroma;

    public TeaType getTeaType() {
        return teaType;
    }

    public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }

    public Aroma getAroma() {
        return aroma;
    }

    public void setAroma(Aroma aroma) {
        this.aroma = aroma;
    }
}
