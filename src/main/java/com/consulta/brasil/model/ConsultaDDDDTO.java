package com.consulta.brasil.model;

import java.util.List;

public class ConsultaDDDDTO {
    
    /** The state */
    private String state;

    /** The cities */
    private List<String> citites;

    /**
     * Gets the state
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the cities
     * @return
     */
    public List<String> getCitites() {
        return citites;
    }

    /**
     * Sets the cities
     * @param citites
     */
    public void setCitites(List<String> citites) {
        this.citites = citites;
    }

    public ConsultaDDDDTO (){

    }

}
