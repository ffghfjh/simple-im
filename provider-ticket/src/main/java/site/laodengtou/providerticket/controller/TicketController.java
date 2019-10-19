package site.laodengtou.providerticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import site.laodengtou.providerticket.service.TicketService;

@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;
    @GetMapping("/ticket")
    public String getTicket(){
        System.out.println(8002);
        return ticketService.getTicket();
    }
}
