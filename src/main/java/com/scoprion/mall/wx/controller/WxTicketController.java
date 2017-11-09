package com.scoprion.mall.wx.controller;
import com.scoprion.mall.domain.Ticket;
import com.scoprion.mall.wx.service.Ticket.TicketWxService;
import com.scoprion.result.BaseResult;
import com.scoprion.result.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by Administrator
 * @created on 2017/11/2/002.
 */

@RestController
@RequestMapping("wx/ticket")
public class WxTicketController {


    @Autowired
    private TicketWxService ticketWxService;
    /*
    *创建优惠券
     */
    @RequestMapping(value = "/add-ticket",method = RequestMethod.POST)
    public BaseResult addTicket(Ticket ticket) throws Exception{
        return ticketWxService.addTicket(ticket);
    }

    /*
    * 优惠券列表
     */
    @RequestMapping(value = "/ticket-list",method = RequestMethod.GET)
    public PageResult ticketList(Integer pageNo,Integer pageSize,String ticketName){
        return ticketWxService.ticketList(pageNo,pageSize,ticketName);
    }

    /**
     * 优惠券修改
     */
    @RequestMapping(value = "/ticket-alter",method = RequestMethod.POST)
    public BaseResult alter(Ticket ticket){
        return ticketWxService.alter(ticket);
    }

    /**
     * 删除优惠券
     */
    @RequestMapping(value = "delete-ticket",method = RequestMethod.POST)
    public BaseResult deleteTicket(Long id){
        return ticketWxService.deleteTicket(id);
    }
}
