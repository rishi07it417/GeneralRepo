package com.mypac.test;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CStartEventHandler 
   implements  ApplicationListener,ApplicationEventPublisherAware {
	   
   private ApplicationEventPublisher publisher;
   
   public void onEvent(ContextStartedEvent event) {
      System.out.println("@@@@@@@@@@@@@@@@@ContextStartedEvent Received@@@@@@@@@@");
   }
   
   public void onEvent(CustomEvent event) {
	      System.out.println("$$$$ Custom Event $$$$$" + event.toString());
	   }
   
   
   public void setApplicationEventPublisher (ApplicationEventPublisher publisher) {
	      this.publisher = publisher;
	   }
   public void publish() {
	      System.out.println("---------INSIDE-----------");
	      CustomEvent ce = new CustomEvent(this);
	      publisher.publishEvent(ce);
	   }

@Override
public void onApplicationEvent(ApplicationEvent paramE) {
	if(paramE instanceof ContextStartedEvent)
	onEvent((ContextStartedEvent) paramE);
	
	if(paramE instanceof CustomEvent)
		onEvent((CustomEvent) paramE);
	
}
}