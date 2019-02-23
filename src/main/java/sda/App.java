package sda;


import sda.model.Hotel;
import sda.service.HotelService;

public class App
{
    public static void main( String[] args ) {

        Hotel sdaHotel = new Hotel();
        HotelService sdaHotelService = new HotelService(sdaHotel);

        System.out.println(sdaHotelService.getAllRooms());
        System.out.println(sdaHotelService.getAvailableRooms());



    }
}
