import io.github.ciudilo.creek.twitter.demo.services.HandleOccurrenceServiceDescriptor;
import org.creekservice.api.platform.metadata.ComponentDescriptor;

module creek.twitter.demo.services {
    requires transitive creek.twitter.demo.api;

    exports io.github.ciudilo.creek.twitter.demo.services;

    provides ComponentDescriptor with
            HandleOccurrenceServiceDescriptor;
}
