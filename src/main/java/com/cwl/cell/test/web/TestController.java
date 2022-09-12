package com.cwl.cell.test.web;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/test")
//@AllArgsConstructor
@Slf4j
public class TestController {

  private Integer cnt = 0;
  @GetMapping("bet/{id}")
  public String test(@PathVariable String id) {

    log.info("lxm, ID={}", id);

/*
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
*/
    log.info("lxm, ID={}, cnt={} ok", id, cnt);

    return  cnt++ + " : " + System.nanoTime();
  }


}
