package com.example.CozyStay.dto;

import com.example.CozyStay.entity.Booking;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDTO {

    private String roomType;
    private String roomPrice;
    private String roomPhotoUrl;
    private String roomDescription;
    private List<Booking> bookings;
}
