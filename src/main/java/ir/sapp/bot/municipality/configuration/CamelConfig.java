package ir.sapp.bot.municipality.configuration;

import ir.sapp.bot.municipality.services.bot.RequestProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CamelConfig extends RouteBuilder {
    @Autowired
    private RequestProcessor requestProcessor;

    @Override
    public void configure() throws Exception {
        from("soroush:action").process(requestProcessor).recipientList(header("uri"));
    }
}
