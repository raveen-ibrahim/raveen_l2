package pl.edu.pwr.raveen.ism.model;

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


/**
 * Bookings
 */


@Entity
@Table(name="Bookings")
public class Bookings {

  
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="BookingID")
  private Integer bookingID;

  
  @Column(name="UserID")
  private Integer userID;

  
  @Column(name="EventID")
  private Integer eventID;


  @Column(name="CheckInDate")
  private LocalDate checkInDate;
  
  
  @Column(name="CheckOutDate")
  private LocalDate checkOutDate;
  
  
  @Column(name="NumberOfGuests")
  private Integer numberOfGuests;
  
  
  @Column(name="SpecialRequests")
  private String specialRequests;

  public Bookings bookingID(Integer bookingID) {
    this.bookingID = bookingID;
    return this;
  }

  /**
   * Get bookingID
   * @return bookingID
  */

  public Integer getBookingID() {
    return bookingID;
  }

  public void setBookingID(Integer bookingID) {
    this.bookingID = bookingID;
  }

  public Bookings userID(Integer userID) {
    this.userID = userID;
    return this;
  }

  /**
   * Get userID
   * @return userID
  */
  
  public Integer getUserID() {
    return userID;
  }

  public void setUserID(Integer userID) {
    this.userID = userID;
  }

  public Bookings eventID(Integer eventID) {
    this.eventID = eventID;
    return this;
  }

  /**
   * Get eventID
   * @return eventID
  */
  
  public Integer getEventID() {
    return eventID;
  }

  public void setEventID(Integer eventID) {
    this.eventID = eventID;
  }

  public Bookings checkInDate(LocalDate checkInDate) {
    this.checkInDate = checkInDate;
    return this;
  }

  /**
   * Get checkInDate
   * @return checkInDate
  */
  public LocalDate getCheckInDate() {
    return checkInDate;
  }

  public void setCheckInDate(LocalDate checkInDate) {
    this.checkInDate = checkInDate;
  }

  public Bookings checkOutDate(LocalDate checkOutDate) {
    this.checkOutDate = checkOutDate;
    return this;
  }

  /**
   * Get checkOutDate
   * @return checkOutDate
  */

  public LocalDate getCheckOutDate() {
    return checkOutDate;
  }

  public void setCheckOutDate(LocalDate checkOutDate) {
    this.checkOutDate = checkOutDate;
  }

  public Bookings numberOfGuests(Integer numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
    return this;
  }

  /**
   * Get numberOfGuests
   * @return numberOfGuests
  */
  
  public Integer getNumberOfGuests() {
    return numberOfGuests;
  }

  public void setNumberOfGuests(Integer numberOfGuests) {
    this.numberOfGuests = numberOfGuests;
  }

  public Bookings specialRequests(String specialRequests) {
    this.specialRequests = specialRequests;
    return this;
  }

  /**
   * Get specialRequests
   * @return specialRequests
  */

  public String getSpecialRequests() {
    return specialRequests;
  }

  public void setSpecialRequests(String specialRequests) {
    this.specialRequests = specialRequests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bookings bookings = (Bookings) o;
    return Objects.equals(this.bookingID, bookings.bookingID) &&
        Objects.equals(this.userID, bookings.userID) &&
        Objects.equals(this.eventID, bookings.eventID) &&
        Objects.equals(this.checkInDate, bookings.checkInDate) &&
        Objects.equals(this.checkOutDate, bookings.checkOutDate) &&
        Objects.equals(this.numberOfGuests, bookings.numberOfGuests) &&
        Objects.equals(this.specialRequests, bookings.specialRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingID, userID, eventID, checkInDate, checkOutDate, numberOfGuests, specialRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bookings {\n");
    sb.append("    bookingID: ").append(toIndentedString(bookingID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
    sb.append("    checkInDate: ").append(toIndentedString(checkInDate)).append("\n");
    sb.append("    checkOutDate: ").append(toIndentedString(checkOutDate)).append("\n");
    sb.append("    numberOfGuests: ").append(toIndentedString(numberOfGuests)).append("\n");
    sb.append("    specialRequests: ").append(toIndentedString(specialRequests)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

