package com.example.covidtracker;

public class CountryModel {

    private String flag,country,cases,todayCases,deaths,todaydeaths,recovered,active,critical;

    public CountryModel(String flag, String country, String cases, String todayCases, String deaths, String todaydeaths, String recovered, String active, String critical) {
        this.flag = flag;
        this.country = country;
        this.cases = cases;
        this.todayCases = todayCases;
        this.deaths = deaths;
        this.todaydeaths = todaydeaths;
        this.recovered = recovered;
        this.active = active;
        this.critical = critical;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public void setTodaydeaths(String todaydeaths) {
        this.todaydeaths = todaydeaths;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public String getFlag() {
        return flag;
    }

    public String getCountry() {
        return country;
    }

    public String getCases() {
        return cases;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public String getDeaths() {
        return deaths;
    }

    public String getTodaydeaths() {
        return todaydeaths;
    }

    public String getRecovered() {
        return recovered;
    }

    public String getActive() {
        return active;
    }

    public String getCritical() {
        return critical;
    }
}
