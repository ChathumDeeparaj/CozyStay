package com.example.CozyStay.repo;

import com.example.CozyStay.entity.Booking;
import com.example.CozyStay.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>{
    List<Booking> findByRoomId(Long roomId);
    List<Booking> findByBookingConfirmationCode(String confirmationCode);
    List<Booking> findByUserId(Long userId);

}
