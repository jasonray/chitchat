package jayray.net.chitchat;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ChitChatApplication extends Application<ChitChatConfiguration> {
	public static void main(String[] args) throws Exception {
		new ChitChatApplication().run(args);
	}

	@Override
	public void initialize(Bootstrap<ChitChatConfiguration> bootstrap) {
		bootstrap.addBundle(new AssetsBundle("/webapp/app", "/app", "index.html"));
	}

	@Override
	public void run(ChitChatConfiguration configuration, Environment environment) {
		environment.jersey().register(new MessageResource());
		environment.jersey().register(new JsonProcessingExceptionMapper());
	}

}