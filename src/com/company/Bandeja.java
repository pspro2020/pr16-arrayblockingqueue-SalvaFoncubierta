package com.company;

import java.util.concurrent.LinkedBlockingQueue;

public class Bandeja {

    private final LinkedBlockingQueue<Plate> lista = new LinkedBlockingQueue<>();

    public void ponerPlate(Plate plate) throws InterruptedException{
        lista.put(plate);
    }

    public Plate cogerPlate() throws InterruptedException {
        return lista.take();
    }

}
