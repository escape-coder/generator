package com.shanjupay.merchat.controller;


import org.springframework.stereotype.Controller;
import com.shanjupay.merchat.service.IStoreStaffService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2022-02-18
 */
@Slf4j
@Controller
@Api(value = "", tags = "", description="")
public class StoreStaffController {

    @Autowired
    private StoreStaffDTOService storeStaffDTOService;
}
