package com.leonardus.hospital.service.comparator;

import com.leonardus.hospital.entities.Client;

import java.util.Comparator;

public class ClientHealthRiskComparator implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        return Double.compare(o1.riskCoefficient(), o2.riskCoefficient());
    }

    @Override
    public Comparator<Client> reversed() {
        return Comparator.super.reversed();
    }
}
