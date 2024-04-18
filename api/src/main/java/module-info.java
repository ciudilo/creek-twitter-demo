import io.github.ciudilo.creek.twitter.demo.api.CreekTwitterDemoAggregateDescriptor;
import org.creekservice.api.platform.metadata.ComponentDescriptor;

module creek.twitter.demo.api {
    requires transitive creek.kafka.metadata;

    exports io.github.ciudilo.creek.twitter.demo.api;
    exports io.github.ciudilo.creek.twitter.demo.internal to
            creek.twitter.demo.services,
            creek.twitter.demo.service;

    provides ComponentDescriptor with
            CreekTwitterDemoAggregateDescriptor;
}
