import discord4j.core.DiscordClientBuilder;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.lifecycle.ReadyEvent;

public class MyBot {
    public static void main(String[] args) {
        // Replace "YOUR_BOT_TOKEN" with your actual bot token
        String token = "de17edde24be080b7c54a52af306c57e4ceed65c2af6578de80b8b125049b0a6";
        
        GatewayDiscordClient client = DiscordClientBuilder.create(token)
                .build()
                .login()
                .block();
        
        client.getEventDispatcher().on(ReadyEvent.class)
                .subscribe(event -> {
                    System.out.println("Logged in as " + event.getSelf().getUsername());
                });
        
        client.onDisconnect().block();
    }

    client.getEventDispatcher().on(MessageCreateEvent.class)
        .subscribe(event -> {
            Message message = event.getMessage();
            String content = message.getContent();
            if (content.equalsIgnoreCase("!hello")) {
                message.getChannel().block().createMessage("Hello, world!").block();
            }
        });

}


