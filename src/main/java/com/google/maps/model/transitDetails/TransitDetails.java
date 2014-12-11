package com.google.maps.model.transitDetails;

/**
 * @author Sam Olsen
 * @since 12/11/14 10:08 AM
 */
public class TransitDetails
{
   public TransitStop arrivalStop;
   public TransitStop departureStop;
   public TransitTime arrivalTime;
   public TransitTime departureTime;
   public String headsign;
   public int headway;
   public int numStops;
   public TransitLine line;

}
