package ru.master.master_lab.controllers;

// region import

import java.sql.Timestamp;
import java.time.Instant;
import java.time.ZoneId;
import java.util.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

// endregion import

@Slf4j
@RestController
public class RunController {
  // region Поля

  private Environment env;

  // endregion Поля

  // region Init

  @Autowired
  public RunController(Environment env) {
    this.env = env;
  }

  // endregion Init

  // region тестирование через rest

  @PostMapping(value = "/calc_test_rest")
  void callRestTest() {
    byte initor = 1;
    String initor_name = "Igoryasha";
    System.out.println("Initor: " + initor_name);
    System.out.println(env.toString());
    System.out.println(env.getProperty("time_code"));
    System.out.println(env.getProperty("person.name"));
    String ccd = env.getProperty("custom_calc_date");
    System.out.println(ccd);


    //dccs.enrollProcessCalculation(sourceList, initor, initor_name);
  }

  // endregion тестирование через rest
}