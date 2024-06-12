package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.CountRoom;
import kg.megocom.RealEstate.repository.CountRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountRoomService {
    private final CountRoomRepository countRoomsRepository;

    public CountRoomService(CountRoomRepository countRoomsRepository) {
        this.countRoomsRepository = countRoomsRepository;
    }

    public List<CountRoom> getAllCountRooms() {
        return countRoomsRepository.findAll();
    }

}
