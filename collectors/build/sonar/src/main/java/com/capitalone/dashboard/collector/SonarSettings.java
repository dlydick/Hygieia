package com.capitalone.dashboard.collector;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;

/**
 * Bean to hold settings specific to the Sonar collector.
 */
@Component
@ConfigurationProperties(prefix = "sonar")
public class SonarSettings {
    private static final Log LOG = LogFactory.getLog(SonarSettings.class);

    private String cron;
    private String username;
    private String password;
    private List<String> servers;
    private List<Double> versions;
    private List<String> metrics;
    private List<String> niceNames;

    // Provide default value for injected fields
    private Integer socketRetries = 3;

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public List<String> getServers() {
        return servers;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }

    public Integer getSocketRetries() {
        LOG.info("getSocketRetries:  " + socketRetries);
        return socketRetries;
    }

    public void setSocketRetries(Integer socketRetries) {
        LOG.info("setSocketRetries:  " + socketRetries);
        this.socketRetries = socketRetries;
    }

    public List<Double> getVersions() {
        return versions;
    }

    public void setVersions(List<Double> versions) {
        this.versions = versions;
    }

    public List<String> getNiceNames() {
        return niceNames;
    }

    public void setNiceNames(List<String> niceNames) {
        this.niceNames = niceNames;
    }

}
