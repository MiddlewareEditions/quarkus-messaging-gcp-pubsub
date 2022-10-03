package io.quarkiverse.quarkusmessaginggcppubsub.messaging.gcp.pubsub.deployment;

import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class MessagingGcpPubsubProcessor {

    private static final String FEATURE = "messaging-gcp-pubsub";

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }
}
