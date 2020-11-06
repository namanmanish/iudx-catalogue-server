package iudx.catalogue.server.geocoding;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.codegen.annotations.GenIgnore;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

/**
 * The Geocoding Service.
 * <h1>Geocoding Service</h1>
 * <p>
 * The Geocoding Service in the IUDX Catalogue Server defines the operations to be performed
 * with the IUDX Geocoding  server.
 * </p>
 * 
 * @see io.vertx.codegen.annotations.ProxyGen
 * @see io.vertx.codegen.annotations.VertxGen
 * @version 1.0
 * @since 2020-11-05
 */

@VertxGen
@ProxyGen
public interface GeocodingService {

  /**
   * The tokenInterospect method implements the Geocoding and authorization module using IUDX
   * APIs.
   * @param location which is a String
   * @param handler which is a request handler
   */
  void geocoder(String location, Handler<AsyncResult<JsonObject>> handler);

  /**
   * The tokenInterospect method implements the Geocoding and authorization module using IUDX
   * APIs.
   * @param lat which is a Float
   * @param lon which is a Float
   * @param handler which is a request handler
   */
  void reverseGeocoder(String lat, String lon, Handler<AsyncResult<JsonObject>> handler);

  /**
   * The createProxy helps the code generation blocks to generate proxy code.
   * @param vertx which is the vertx instance
   * @param address which is the proxy address
   * @param GeocodingInfo which is a Json Object
   * @return GeocodingService
   */
  @GenIgnore
  static GeocodingService createProxy(Vertx vertx, String address) {
    return new GeocodingServiceVertxEBProxy(vertx, address);
  }
}
