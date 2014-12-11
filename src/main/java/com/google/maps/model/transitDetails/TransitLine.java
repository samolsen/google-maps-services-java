package com.google.maps.model.transitDetails;

import java.util.List;

/**
 * @author Sam Olsen
 * @since 12/11/14 10:21 AM
 */
public class TransitLine
{
   public String name;
   public String shortName;
   public String color;
   public List<TransitAgency> agencies;
   public String url;
   public String icon;
   public String textColor;
   public TransitVehicle vehicle;
}
