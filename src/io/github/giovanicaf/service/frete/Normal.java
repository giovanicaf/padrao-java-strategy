package io.github.giovanicaf.service.frete;

import io.github.giovanicaf.service.Frete;

public class Normal implements Frete {
    public double calcularPreco(int distancia){
        return distancia * 1.25 + 10;
    }
}
