package com.nitor.demo.cloudwatch.controller.request;

import java.io.Serializable;

import javax.validation.constraints.Size;

public class LogRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  public enum Level {
    DEBUG, WARN, ERROR
  }

  @Size(max = 100)
  private String message;
  private Level level;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

}
