package com.lambdaschool.solution;

public class MyApplication implements Processor {

    private AthleteService athlSrv;

    public MyApplication(AthleteService athlSrv) {
        this.athlSrv = athlSrv;
    }

    @Override
    public void displayAthlete() {
        // System Out Print Lines
        System.out.println("*****************");
        athlSrv.displayAthlete();
        System.out.println("*****************\n");
    }
}
