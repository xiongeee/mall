package com.scoprion.mall.backstage.service.ticket;

import com.scoprion.mall.domain.Ticket;
import com.scoprion.result.BaseResult;
import com.scoprion.result.PageResult;

/**
 * Created on 2017/10/10.
 */
public interface TicketService {

    /**
     * 创建优惠券
     *
     * @param ticket
     * @return
     * @throws Exception
     */
    BaseResult add(Ticket ticket) throws Exception;

    /**
     * 分页查询优惠券
     *
     * @param pageNo
     * @param pageSize
     * @param ticketName
     * @return
     */
    PageResult listByPage(int pageNo, int pageSize, String ticketName);

    /**
     * 编辑优惠券
     *
     * @param ticket
     * @return
     */
    BaseResult edit(Ticket ticket);

    /**
     * 根据主键删除优惠券
     *
     * @param id
     * @return
     */
    BaseResult deleteByPrimaryKey(Long id);

}