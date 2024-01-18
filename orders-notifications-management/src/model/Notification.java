package com.assignment.ordersnotificationsmanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String template;
    private String language;
    private String channel;
    private String placeholderValues;  // This could be a JSON or another suitable format

    // Constructors
    public Notification() {
    }

    public Notification(String template, String language, String channel, String placeholderValues) {
        this.template = template;
        this.language = language;
        this.channel = channel;
        this.placeholderValues = placeholderValues;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPlaceholderValues() {
        return placeholderValues;
    }

    public void setPlaceholderValues(String placeholderValues) {
        this.placeholderValues = placeholderValues;
    }

    // toString method for easy debugging
    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", template='" + template + '\'' +
                ", language='" + language + '\'' +
                ", channel='" + channel + '\'' +
                ", placeholderValues='" + placeholderValues + '\'' +
                '}';
    }
}
