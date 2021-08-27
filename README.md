# Technical Interview Task
## Context description
We are widely use events to connect our microservices. Events are triggered by other microservices and delivered over Message Broker. 

You can use Spring Application Events to simulate the Message Broker. 

In the code base you will find 2 events:
* `ProfileCreatedEvent` - Triggered when user created a Profile 
* `QuoteCreatedEvent` - Triggered when user requested an insurance Quote 

Event might be triggered in any sequence.

One user might have only one profile and multiple quotes. 

## Task
You should implement following functionality:
1. Implement transactional SpringBoot Integration test to trigger `ProfileCreatedEvent` and `QuoteCreatedEvent` for the same `userId`
1. Implement Spring Application Listener accepting 2 events mentioned above
1. Implement JPA entity, call that `InsuranceClient`
1. Implement persistence layer which will create `InsuranceClient` from events and save the entity in a database.  