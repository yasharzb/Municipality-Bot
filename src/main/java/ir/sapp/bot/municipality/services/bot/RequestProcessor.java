package ir.sapp.bot.municipality.services.bot;

import ir.sapp.bot.municipality.configuration.APIConfig.ConstructionalConfig;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestProcessor implements Processor {
    @Autowired
    private ConstructionalConfig constructionalConfig;

    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getOut().setHeader("uri", "direct:" + constructionalConfig.getFaultApi());
    }
}
