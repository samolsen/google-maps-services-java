package com.google.maps.model.transitDetails;

/**
 * See https://developers.google.com/maps/documentation/directions/#VehicleType
 */
public enum TransitVehicleType
{
   RAIL,
   METRO_RAIL,
   SUBWAY,
   TRAM,
   MONORAIL,
   HEAVY_RAIL,
   COMMUTER_TRAIN,
   HIGH_SPEED_TRAIN,
   BUS,
   INTERCITY_BUS,
   TROLLEYBUS,
   SHARE_TAXI,
   FERRY,
   CABLE_CAR,
   GONDOLA_LIFT,
   FUNICULAR,
   OTHER,

   UNKNOWN // unrecognized type returned from API
}
