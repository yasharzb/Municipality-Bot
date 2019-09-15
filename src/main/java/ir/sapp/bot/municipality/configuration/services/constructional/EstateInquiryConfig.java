package ir.sapp.bot.municipality.configuration.services.constructional;

import ir.sapp.bot.municipality.configuration.APIConfig.ConstructionalConfig;
import ir.sapp.bot.municipality.services.constructional.EstateInquiry.EstateInquiryRequestProcessor;
import ir.sapp.bot.municipality.services.constructional.EstateInquiry.EstateInquiryResponseProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EstateInquiryConfig extends RouteBuilder {

    @Autowired
    private ConstructionalConfig constructionalConfig;

    @Autowired
    private EstateInquiryRequestProcessor estateInquiryRequestProcessor;

    @Autowired
    private EstateInquiryResponseProcessor estateInquiryResponseProcessor;

    @Override
    public void configure() throws Exception {
        from("direct:" + constructionalConfig.getFaultApi()).process(estateInquiryRequestProcessor).
                to("http:" + constructionalConfig.getFaultApi());
        from("http:" + constructionalConfig.getFaultApi()).process(estateInquiryResponseProcessor).
                to("soroush:sendMessage");
    }
}
