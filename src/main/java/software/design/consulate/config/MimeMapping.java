package software.design.consulate.config;

import org.springframework.boot.web.server.MimeMappings;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MimeMapping implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        final MimeMappings mappings = new MimeMappings(MimeMappings.DEFAULT);
        mappings.add("xhtml", "application/vnd.hbbtv.xhtml+xml; charset=utf-8");
        mappings.add("css", "text/css");
        factory.setMimeMappings(mappings);
    }
}