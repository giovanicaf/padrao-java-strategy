package io.github.giovanicaf.service.frete;

import io.github.giovanicaf.service.Frete;

public class Sedex implements Frete {
    public double calcularPreco(int distancia){
        return distancia * 1.45 + 12;
    }
}
