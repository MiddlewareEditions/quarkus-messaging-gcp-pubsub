package io.quarkiverse.quarkusmessaginggcppubsub.messaging.gcp.pubsub.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class MessagingGcpPubsubResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/messaging-gcp-pubsub")
                .then()
                .statusCode(200)
                .body(is("Hello messaging-gcp-pubsub"));
    }
}
