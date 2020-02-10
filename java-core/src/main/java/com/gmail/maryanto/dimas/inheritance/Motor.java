package com.gmail.maryanto.dimas.inheritance;

public class Motor extends Sepeda {

    @Override
    public String data() {
        return "Test ulang";
    }

    public Integer getJumlahRoda() {
        return 2;
    }

    public Integer getJumlahRoda(Integer roda) {
        return roda;
    }

    public Integer getJumlahRoda(Integer roda, boolean sport) {
        return roda;
    }

    public Integer getJumlahRoda(boolean sport, Integer roda) {
        return roda;
    }


}
