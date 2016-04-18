/**
 * Budi Luhur University, Proprietary Software Cloud Communications
 *  Copyright (c) 2016, budiluhur.ac.id and individual contributors
 *  by the @authors tag.
 *
 *  This program is Proprietary Software: you can not redistribute it and/or modify
 *  without license from Budi Luhur University.
 *
 *  Website : http://www.budiluhur.ac.id/
 *  Report bugs to <techsupport@budiluhur.ac.id>.
 *  Copyright (C) 2016 Budi Luhur University. All rights reserved.
 */
package com.bl.rekweb.ku.group2.web.controller;


import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Date;


@Controller
public class MainController {
	
	private static final Logger log = Logger.getLogger(MainController.class);


    private Date jodaToSQLDate(DateTime dateTime){
        return new Date(dateTime.toDateTime().getMillis());
    }

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String welcome(ModelMap map) {

        log.info("welcome service executed...");

        map.addAttribute("welcome", "MARINEM SCHEDULER");

        return "index";
	}

}
