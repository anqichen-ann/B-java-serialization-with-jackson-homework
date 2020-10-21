package com.thoughtworks.capability.gtb.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.thoughtworks.capability.gtb.Serialization.EventTypeSerialization;
import com.thoughtworks.capability.gtb.Serialization.TimeSerialization;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventVo {

  private String id;
  private String name;
  @JsonSerialize(using = EventTypeSerialization.class)
  private EventType type;
  @JsonSerialize(using = TimeSerialization.class)
  private Date time;
  @JsonUnwrapped
  private UserVo user;
}
