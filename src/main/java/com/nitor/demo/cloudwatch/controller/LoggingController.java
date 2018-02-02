package com.nitor.demo.cloudwatch.controller;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nitor.demo.cloudwatch.controller.request.LogRequest;

@RestController
@RequestMapping("/log")
public class LoggingController {

  private static Log LOG = LogFactory.getLog(LoggingController.class);

  @RequestMapping(method = RequestMethod.POST)
  public void log(@Valid @RequestBody LogRequest log) {
    switch (log.getLevel()) {
      case ERROR: {
        LOG.error(log.getMessage());
        break;
      }
      case WARN: {
        LOG.warn(log.getMessage());
        break;
      }
      default: {
        LOG.debug(log.getMessage());
        break;
      }
    }

  }
}
