package pl.edu.pwr.raveen.ism.model;

import java.math.BigDecimal;
import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventID")
    private Integer eventID;

    @Column(name = "EventType")
    private String eventType;

    @Column(name = "EventNumber")
    private Integer eventNumber;

    @Column(name = "PricePerDay")
    private BigDecimal pricePerDay;

    @Column(name = "EventStatus")
    private String eventStatus;

    @Column(name = "FloorNumber")
    private Integer floorNumber;

    // Constructors, getters, setters, equals, hashCode, and toString methods

    public Events() {
    }

    public Events(Integer eventID, String eventType, Integer eventNumber, BigDecimal pricePerDay,
            String eventStatus, Integer floorNumber) {
        this.eventID = eventID;
        this.eventType = eventType;
        this.eventNumber = eventNumber;
        this.pricePerDay = pricePerDay;
        this.eventStatus = eventStatus;
        this.floorNumber = floorNumber;
    }

    public Integer getEventID() {
        return eventID;
    }

    public void setEventID(Integer eventID) {
        this.eventID = eventID;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Integer getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(Integer eventNumber) {
        this.eventNumber = eventNumber;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public Integer getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Events events = (Events) o;
        return Objects.equals(eventID, events.eventID) && Objects.equals(eventType, events.eventType)
                && Objects.equals(eventNumber, events.eventNumber) && Objects.equals(pricePerDay, events.pricePerDay)
                && Objects.equals(eventStatus, events.eventStatus) && Objects.equals(floorNumber, events.floorNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventID, eventType, eventNumber, pricePerDay, eventStatus, floorNumber);
    }

    @Override
    public String toString() {
        return "Events{" +
                "eventID=" + eventID +
                ", eventType='" + eventType + '\'' +
                ", eventNumber=" + eventNumber +
                ", pricePerDay=" + pricePerDay +
                ", eventStatus='" + eventStatus + '\'' +
                ", floorNumber=" + floorNumber +
                '}';
    }
}
