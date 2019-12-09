package net.centro.sample.services.impl;

import org.springframework.stereotype.Service;

import net.centro.sample.services.SampleService;

@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public String getSample() {
        return "OK!";
    }

}